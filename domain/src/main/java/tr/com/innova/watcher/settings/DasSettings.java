package tr.com.innova.watcher.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by tcopur on 11.04.2016.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DasSettings implements Serializable, ConfigurationSettings {

    @NotEmpty
    private String url;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
