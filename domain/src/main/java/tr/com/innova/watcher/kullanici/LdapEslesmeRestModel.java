package tr.com.innova.watcher.kullanici;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by usuicmez on 13.04.2016.
 */
@Data
public class LdapEslesmeRestModel implements Serializable {
    List<LdapKullaniciEslesmeModel> ldapKullanicilar;

    public LdapEslesmeRestModel(){}

    public LdapEslesmeRestModel(List<LdapKullaniciEslesmeModel> ldapKullanicilar) {
        this.ldapKullanicilar = ldapKullanicilar;
    }
}