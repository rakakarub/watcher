package tr.com.innova.watcher.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by usuicmez on 14.04.2016.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusteriSettings implements Serializable, ConfigurationSettings {
    @NotEmpty
    private String musteriId;
}
