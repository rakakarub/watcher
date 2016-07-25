package tr.com.innova.watcher.ldap;

/**
 * Created by herdemir on 28.03.2016.
 */
public interface LdapService {
    boolean performAuthentication(String username, String password);

    void reloadLdapContext();
}
