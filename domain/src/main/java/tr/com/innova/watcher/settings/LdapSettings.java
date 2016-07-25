package tr.com.innova.watcher.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by herdemir on 28.03.2016.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LdapSettings implements Serializable, ConfigurationSettings {

    @NotEmpty
    private String baseDn;
    @NotEmpty
    private String ldapUrl;
    @NotEmpty
    private String username;
    @NotEmpty
    private String usernameAttribute;
    @NotEmpty
    private String password;
}
