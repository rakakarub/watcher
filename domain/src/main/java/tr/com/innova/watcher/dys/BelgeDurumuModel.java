package tr.com.innova.watcher.dys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tozyurek on 06.05.2016.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BelgeDurumuModel {
    private String status;
    private BelgeModel dokuman;
}
