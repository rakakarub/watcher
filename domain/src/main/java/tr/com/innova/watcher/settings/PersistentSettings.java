package tr.com.innova.watcher.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

/**
 * Created by tozyurek on 17.06.2016.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersistentSettings {

    @Id
    private BigInteger id;

    private String settingsName;
    private ConfigurationSettings settings;

    public PersistentSettings(String settingsName, ConfigurationSettings settings) {
        this.settingsName =  settingsName;
        this.settings = settings;
    }
}
