package tr.com.innova.watcher.config;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.innova.watcher.icra.IcraOlusturService;

/**
 * Created by mersoy on 29.04.2016.
 */

@Component
public class RouteConfiguration extends SpringRouteBuilder {
    @Autowired
    private IcraOlusturService icraOlusturService;

    @Override
    public void configure() throws Exception {
        from("cxf:bean:icraOlusturWS")
            .to("log:deneme")
            .bean(icraOlusturService);
    }
}
