package tr.com.innova.watcher.ldap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.AuthenticationException;
import org.springframework.ldap.InvalidNameException;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.stereotype.Service;
import tr.com.innova.watcher.config.ConfigFileManager;
import tr.com.innova.watcher.settings.LdapSettings;

import javax.annotation.PostConstruct;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

/**
 * Created by herdemir on 28.03.2016.
 */
@Service
public class LdapServiceImpl implements LdapService {
    private static final Logger LOG = LoggerFactory.getLogger(LdapServiceImpl.class);

    private final LdapTemplate ldap = new LdapTemplate();

    @Autowired
    private ConfigFileManager configFileManager;

    @PostConstruct
    private void init() {
        ldap.setContextSource(initializeLdapContext());
        ldap.setIgnorePartialResultException(true);
    }

    @Override
    public boolean performAuthentication(final String username, final String password) {
        try {
            final String attribute = ldapSettings().getUsernameAttribute() == null ? "mail" : ldapSettings().getUsernameAttribute();
            ldap.authenticate(query().where(attribute).is(username), password);
        } catch (final AuthenticationException ex) {
            return false;
        } catch (final Exception ex) {
            LOG.error("Cannot perform LDAP Authentication for user: " + username, ex);
            return false;
        }

        return true;
    }

    @Override
    public void reloadLdapContext() {
        ldap.setContextSource(initializeLdapContext());
    }

    private LdapContextSource initializeLdapContext() {
        if (ldapSettings() == null) {
            return null;
        }

        final LdapContextSource contextSource = new LdapContextSource();
        try{
        contextSource.setUserDn(ldapSettings().getUsername());
        contextSource.setPassword(ldapSettings().getPassword());
        contextSource.setUrl(ldapSettings().getLdapUrl());
        contextSource.setBase(ldapSettings().getBaseDn());}
        catch (InvalidNameException e){
            LOG.error("Geçersiz BaseDN adı: " + e);
        }
        return contextSource;
    }

    private LdapSettings ldapSettings() {
        return configFileManager.readConfigSettings(LdapSettings.class);
    }
}
