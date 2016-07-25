package tr.com.innova.watcher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.innova.watcher.config.ConfigFileManager;
import tr.com.innova.watcher.settings.LegaliteSettings;

import javax.validation.Valid;

/**
 * Created by mersoy on 06.04.2016.
 */

@RestController
@RequestMapping("/legaliteConnection")
public class LegaliteConnectionController {

    @Autowired
    private ConfigFileManager configFileManager;

    @RequestMapping(value = "/config", method = RequestMethod.PUT, produces = "text/plain;charset=UTF-8")
    public ResponseEntity save(@Valid @RequestBody LegaliteSettings legaliteSettings, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.unprocessableEntity().body("Boş değer olamaz");
        }
        configFileManager.writeConfigSettings(legaliteSettings);
        return ResponseEntity.ok("Kayıt Başarılı");
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseEntity fetch() {
        return ResponseEntity.ok(configFileManager.readConfigSettings(LegaliteSettings.class));
    }
}