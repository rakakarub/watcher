package tr.com.innova.watcher.dys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by usuicmez on 04.05.2016.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BelgeAlRestModel implements Serializable {
    private long legaliteSistemNo;
    private byte[] content;
    private BelgeTipi belgeTipi;
    private String belgeAdi;
}
