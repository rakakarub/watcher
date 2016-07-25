package tr.com.innova.watcher.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by tcopur on 11.04.2016.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DysSettings implements Serializable, ConfigurationSettings {

    @Id
    private BigInteger id;
    @NotEmpty
    private String serverAddress;
    @NotEmpty
    private String wsdlAddress;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
