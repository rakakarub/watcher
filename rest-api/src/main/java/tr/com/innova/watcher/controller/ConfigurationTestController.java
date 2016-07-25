package tr.com.innova.watcher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import retrofit2.Response;
import retrofit2.Retrofit;
import tr.com.innova.watcher.RetrofitBuilderFactory;
import tr.com.innova.watcher.configuration.ConnectionTestModel;
import tr.com.innova.watcher.configuration.SimpleResponse;

/**
 * Created by tozyurek on 08.04.2016.
 */

@RestController
@RequestMapping("/configuration")
public class ConfigurationTestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/connectionTest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8", headers = "Accept=application/json")
    public ResponseEntity connectionTest(@RequestBody ConnectionTestModel model) {

        Retrofit retrofit = RetrofitBuilderFactory.simpleRetrofit(model.getAddress());

        LegaliteRestApis legaliteRestApis = retrofit.create(LegaliteRestApis.class);

        try {
            Response<SimpleResponse> response = legaliteRestApis.test().execute();
            if(response.isSuccessful()){
                return ResponseEntity.ok(response.body());
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/connectionTest", method = RequestMethod.GET)
    public String connectionTest() {
        return "{\"result\":\"Bağlantı Başarılı\"}";
    }

    private HttpEntity getHttpEntityForCors() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");
        return new HttpEntity(headers);
    }
}
