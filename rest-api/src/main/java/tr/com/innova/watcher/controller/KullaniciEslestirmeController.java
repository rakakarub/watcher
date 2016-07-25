package tr.com.innova.watcher.controller;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import tr.com.innova.watcher.config.ConfigFileManager;
import tr.com.innova.watcher.kullanici.LdapEslesmeRestModel;
import tr.com.innova.watcher.kullanici.LdapKullaniciEslesmeModel;
import tr.com.innova.watcher.settings.LegaliteSettings;
import tr.com.innova.watcher.settings.MusteriSettings;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by herdemir on 08.04.2016.
 */
@RestController
@RequestMapping("/kullanici")
public class KullaniciEslestirmeController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConfigFileManager configFileManager;

    @RequestMapping(value = "/legalite-kullanicilari", method = RequestMethod.GET)
    public ResponseEntity<List<LdapKullaniciEslesmeModel>> legaliteKullanicilari() {
        HttpEntity entity = getHttpEntityForCors();
        ResponseEntity<LdapEslesmeRestModel> response =
            restTemplate.exchange(getKullanicilarUrl(), HttpMethod.GET, entity, LdapEslesmeRestModel.class);
        return ResponseEntity.ok(response.getBody().getLdapKullanicilar());
    }

    @RequestMapping(value = "/ldap-kullanicilari", method = RequestMethod.GET)
    public ResponseEntity<List<LdapKullaniciEslesmeModel>> ldapKullanicilari() {
        final List<LdapKullaniciEslesmeModel> kullanicilar = Lists.newArrayList();
        return ResponseEntity.ok(kullanicilar);
    }

    @RequestMapping(value = "/ldap-kullanicilari-eslestir", method = RequestMethod.PUT)
    public ResponseEntity<String> kullanicilariEslestir(@Valid @RequestBody List<LdapKullaniciEslesmeModel> kullanicilar,
        BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.unprocessableEntity().body("Boş değer olamaz.");
        }
        if(kullanicilar.isEmpty()) {
            return ResponseEntity.ok("Eşleştirilen herhangi bir kullanıcı yok.");
        }
        if (ayniLdapKullanicisiBirdenFazlaKullaniciyaEklenmisMi(kullanicilar)) {
            return ResponseEntity.ok("Ldap kullanıcısı birden fazla legalite kullanıcısıyla eşleşemez.");
        }
        try {
            restTemplate.put(getLdapKullanicilariEslestirUrl(), new LdapEslesmeRestModel(kullanicilar));
        } catch (HttpClientErrorException e) {
            return ResponseEntity.badRequest().body(e.getResponseBodyAsString());
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body("Leagaliteye erişim sağlanamadı.");
        }

        return ResponseEntity.ok("Kullanıcılar Başarıyla Eşleştirildi.");
    }

    private boolean ayniLdapKullanicisiBirdenFazlaKullaniciyaEklenmisMi(List<LdapKullaniciEslesmeModel> kullanicilar) {
        return kullanicilar.stream().filter(f -> f.getMappedUsername() != null)
                           .map(LdapKullaniciEslesmeModel::getMappedUsername).distinct().count() <
               kullanicilar.stream().filter(f -> f.getMappedUsername() != null).count();
    }

    private HttpEntity getHttpEntityForCors() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");
        return new HttpEntity(headers);
    }

    private String getKullanicilarUrl() {
        return baseUrl() + "/legalite/api/khy/kullanicilar" + "?musteriId=" + getMusteriId();
    }

    private String getLdapKullanicilariEslestirUrl() {
        return baseUrl() + "/legalite/api/khy/ldap-kullanicilari-eslestir" + "?musteriId=" + getMusteriId();
    }

    public String baseUrl() {
        LegaliteSettings settings = configFileManager.readConfigSettings(LegaliteSettings.class);
        return settings.getAddress();
    }

    public String getMusteriId() {
        MusteriSettings musteriSettings = configFileManager.readConfigSettings(MusteriSettings.class);
        return musteriSettings.getMusteriId();
    }
}
