package tr.com.innova.watcher.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.innova.watcher.config.ConfigFileManager;
import tr.com.innova.watcher.dys.BelgeModel;
import tr.com.innova.watcher.settings.DysSettings;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by tcopur on 08.04.2016.
 */

@RestController
@RequestMapping("/dys")
public class DysController {


    @Autowired
    private CamelContext camelContext;

    @Autowired
    private ConfigFileManager configFileManager;

    @RequestMapping(value = "/config", method = RequestMethod.PUT)
    public ResponseEntity save(@Valid @RequestBody DysSettings dysSettings, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.unprocessableEntity().body("Boş değer olamaz.");
        }
        configFileManager.writeConfigSettings(dysSettings);
        try {
            camelContext.stopRoute("ebysSendDocumentRoute");
            camelContext.startRoute("ebysSendDocumentRoute");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("Kayıt Başarılı.");
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseEntity fetch() {
        return ResponseEntity.ok(configFileManager.readConfigSettings(DysSettings.class));
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/query", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity query(@RequestBody String query) {
        //dysden query ile sorgulanacak...
        return ResponseEntity.ok(new ArrayList<>());
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/belge", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity belgeKaydet(@RequestBody BelgeModel model){
        System.out.println(model.getName());
        ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
        producerTemplate.sendBody("seda:dysSendDocument", model);
        return ResponseEntity.ok("{\"result\":\"Belge İletiliyor.\"}");

    }
}