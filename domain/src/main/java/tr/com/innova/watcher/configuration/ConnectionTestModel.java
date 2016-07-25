package tr.com.innova.watcher.configuration;

import java.io.Serializable;
import java.net.URI;

/**
 * Created by tozyurek on 11.04.2016.
 */
public class ConnectionTestModel implements Serializable {

    private String address;
    private String path;
    private String kullaniciId;
    private String password;
    private boolean needAuthentication = false;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(String kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isNeedAuthentication() {
        return needAuthentication;
    }

    public void setNeedAuthentication(boolean needAuthentication) {
        this.needAuthentication = needAuthentication;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
