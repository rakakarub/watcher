package tr.com.innova.watcher.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by tozyurek on 11.04.2016.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegaliteSettings implements ConfigurationSettings {
    @NotEmpty
    private String address = "";
    private String kullaniciAdi;
    private String sifre;
}
