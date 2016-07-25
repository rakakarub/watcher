package tr.com.innova.watcher.dys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by tozyurek on 29.04.2016.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kullanici {
    private UUID id;
    private String eposta;
    private String ad;
    private String soyad;
    private String username;
    private String tckNo;

    public String getAdSoyad() {
        return ad + (soyad == null ? "" : " " + soyad);
    }
}
