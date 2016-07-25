package tr.com.innova.watcher.controller;

import retrofit2.Call;
import retrofit2.http.GET;
import tr.com.innova.watcher.configuration.SimpleResponse;

/**
 * Created by tozyurek on 12.05.2016.
 */

public interface LegaliteRestApis {

    @GET("api/khy/connectionTest")
    Call<SimpleResponse> test();
}