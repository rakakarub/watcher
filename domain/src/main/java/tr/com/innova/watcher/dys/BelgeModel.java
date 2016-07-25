package tr.com.innova.watcher.dys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

/**
 * Created by tozyurek on 26.04.2016.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BelgeModel {

    private BigInteger id;
    private UUID dokumId;
    private String name;
    private UUID dosyaId;
    private byte[] content;
    private DosyaKodu dosyaKodu;
    private Kullanici gonderenKullanici;
    private BelgeTipi belgeTipi;
    private Long sistemDosyaNo;
    private String dokumanKonu;
    private String detsisNo;
    private String mahkemeAdi;
    private List<Kullanici> imzaListesi;

    public BelgeModel(BigInteger id, UUID dokumId, UUID dosyaId) {
        this.id = id;
        this.dokumId = dokumId;
        this.dosyaId = dosyaId;
    }
}
