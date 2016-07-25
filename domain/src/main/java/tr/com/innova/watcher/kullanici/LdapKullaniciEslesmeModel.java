package tr.com.innova.watcher.kullanici;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by usuicmez on 13.04.2016.
 */
@Data
public class LdapKullaniciEslesmeModel implements Serializable {
    private String username;
    private String displayName;
    private String mappedUsername;
    private boolean yeni;

    public LdapKullaniciEslesmeModel() {
    }

    public LdapKullaniciEslesmeModel(String username, String displayName, String mappedUsername) {
        this.username = username;
        this.displayName = displayName;
        this.mappedUsername = mappedUsername;
    }
}
