package tr.com.innova.watcher.dys;

/**
 * Created by tozyurek on 13.05.2016.
 */
public enum DosyaKodu {
    ICRA("641.03.03","İCRA"),
    ADLI_CEZA("641.03.02","CEZA"),
    ADLI_HUKUK("641.03.01","HUKUK"),
    IDARI_YARGI_DAVA_DOSYASI("641.04","İDARİ DAVALAR"),
    IDARI_YARGI_BOLGE_DOSYASI("641.04","İDARİ DAVALAR"),
    IDARI_YARGI_YD_ITIRAZ_DOSYASI("641.04","İDARİ DAVALAR"),
    IDARI_YARGI_KAMU_DOSYASI("641.04","İDARİ DAVALAR"),
    IDARI_YARGI_VERGI_DAVA_DOSYASI("641.05", "VERGİ DAVALARI"),
    TUKETICI_SIKAYETI("641.99","DİĞER");

    private final String ebysDavaTipi;
    private final String ebysKodu;

    DosyaKodu(String ebysKodu, String ebysDavaTipi) {
        this.ebysDavaTipi = ebysDavaTipi;
        this.ebysKodu = ebysKodu;
    }

    public String getEbysDavaTipi() {
        return ebysDavaTipi;
    }

    public String getEbysKodu() {
        return ebysKodu;
    }
}
