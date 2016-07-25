package tr.com.innova.watcher.dys;

import tr.com.innova.watcher.configuration.SimpleResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by tozyurek on 09.05.2016.
 */
@Path("/api/khy")
@Produces("application/json")
public interface LegaliteDysRESTApis {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/belge-durum-guncelle")
    SimpleResponse belgeDurumGuncelle(BelgeDurumuModel belgeDurum);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/belge-al")
    SimpleResponse belgeGonder(BelgeAlRestModel request);
}
