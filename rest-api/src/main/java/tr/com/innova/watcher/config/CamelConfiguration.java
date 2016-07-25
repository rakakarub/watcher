package tr.com.innova.watcher.config;

import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.CxfSpringEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.com.innova.watcher.icra.IcraOlusturService;

/**
 * Created by mersoy on 29.04.2016.
 */

@Configuration
public class CamelConfiguration {

    @Bean
    public CxfEndpoint icraOlusturWS() {
        final CxfSpringEndpoint endpoint = new CxfSpringEndpoint();
        endpoint.setAddress("/icraOlusturService");
        endpoint.setServiceClass(IcraOlusturService.class);
        return endpoint;
    }
}
