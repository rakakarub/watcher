
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for borcKalem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="borcKalem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALACAK_DAVA"/&gt;
 *     &lt;enumeration value="ALACAK_ICRA"/&gt;
 *     &lt;enumeration value="ALEYHE_ESAS_ALACAK"/&gt;
 *     &lt;enumeration value="ALEYHE_MASRAF_DAVA"/&gt;
 *     &lt;enumeration value="ALEYHE_MASRAF_ICRA"/&gt;
 *     &lt;enumeration value="ALEYHE_TAHSIL_HARCI_DAVA"/&gt;
 *     &lt;enumeration value="ALEYHE_TAHSIL_HARCI_ICRA"/&gt;
 *     &lt;enumeration value="ALEYHE_TAKIBE_ESAS_ALACAK"/&gt;
 *     &lt;enumeration value="ALEYHE_VEKALET_UCRETI_DAVA"/&gt;
 *     &lt;enumeration value="ALEYHE_VEKALET_UCRETI_ICRA"/&gt;
 *     &lt;enumeration value="ALEYHE_YARGILAMA_GIDERI"/&gt;
 *     &lt;enumeration value="ASIL_ALACAK_DAVA"/&gt;
 *     &lt;enumeration value="ASIL_ALACAK_ICRA"/&gt;
 *     &lt;enumeration value="ASIL_SUPHELI_ALACAK"/&gt;
 *     &lt;enumeration value="DAMGA_VERGISI"/&gt;
 *     &lt;enumeration value="DAVA_KARARI_FAIZ_FARKI"/&gt;
 *     &lt;enumeration value="DAVA_VEKALET_UCRETI_DAVA"/&gt;
 *     &lt;enumeration value="DAVA_VEKALET_UCRETI_ICRA"/&gt;
 *     &lt;enumeration value="DIGER"/&gt;
 *     &lt;enumeration value="FAZLA_MESAI_ALACAGI_DAVA"/&gt;
 *     &lt;enumeration value="FAZLA_MESAI_ALACAGI_ICRA"/&gt;
 *     &lt;enumeration value="HASAR_BEDELI_DAVA"/&gt;
 *     &lt;enumeration value="HASAR_BEDELI_ICRA"/&gt;
 *     &lt;enumeration value="ICRA_INKAR_TAZMINATI"/&gt;
 *     &lt;enumeration value="ICRA_VEKALET_UCRETI"/&gt;
 *     &lt;enumeration value="IHBAR_TAZMINATI_DAVA"/&gt;
 *     &lt;enumeration value="IHBAR_TAZMINATI_ICRA"/&gt;
 *     &lt;enumeration value="ISCI_ALACAGI_DAVA"/&gt;
 *     &lt;enumeration value="ISCI_ALACAGI_ICRA"/&gt;
 *     &lt;enumeration value="KAMBIYO_ALACAGI"/&gt;
 *     &lt;enumeration value="KIDEM_TAZMINATI_DVA"/&gt;
 *     &lt;enumeration value="KIDEM_TAZMINATI_ICRA"/&gt;
 *     &lt;enumeration value="KIRA_ALACAGI"/&gt;
 *     &lt;enumeration value="KOMISYON"/&gt;
 *     &lt;enumeration value="MADDI_TAZMINAT_DAVA"/&gt;
 *     &lt;enumeration value="MADDI_TAZMINAT_ICRA"/&gt;
 *     &lt;enumeration value="MANEVI_TAZMINAT_DAVA"/&gt;
 *     &lt;enumeration value="MANEVI_TAZMINAT_ICRA"/&gt;
 *     &lt;enumeration value="TAKSITLENDIRME_BEDELI"/&gt;
 *     &lt;enumeration value="TAZMINAT"/&gt;
 *     &lt;enumeration value="YARGILAMA_GIDERI_DAVA"/&gt;
 *     &lt;enumeration value="YARGILAMA_GIDERI_ICRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "borcKalem")
@XmlEnum
public enum BorcKalem {

    ALACAK_DAVA,
    ALACAK_ICRA,
    ALEYHE_ESAS_ALACAK,
    ALEYHE_MASRAF_DAVA,
    ALEYHE_MASRAF_ICRA,
    ALEYHE_TAHSIL_HARCI_DAVA,
    ALEYHE_TAHSIL_HARCI_ICRA,
    ALEYHE_TAKIBE_ESAS_ALACAK,
    ALEYHE_VEKALET_UCRETI_DAVA,
    ALEYHE_VEKALET_UCRETI_ICRA,
    ALEYHE_YARGILAMA_GIDERI,
    ASIL_ALACAK_DAVA,
    ASIL_ALACAK_ICRA,
    ASIL_SUPHELI_ALACAK,
    DAMGA_VERGISI,
    DAVA_KARARI_FAIZ_FARKI,
    DAVA_VEKALET_UCRETI_DAVA,
    DAVA_VEKALET_UCRETI_ICRA,
    DIGER,
    FAZLA_MESAI_ALACAGI_DAVA,
    FAZLA_MESAI_ALACAGI_ICRA,
    HASAR_BEDELI_DAVA,
    HASAR_BEDELI_ICRA,
    ICRA_INKAR_TAZMINATI,
    ICRA_VEKALET_UCRETI,
    IHBAR_TAZMINATI_DAVA,
    IHBAR_TAZMINATI_ICRA,
    ISCI_ALACAGI_DAVA,
    ISCI_ALACAGI_ICRA,
    KAMBIYO_ALACAGI,
    KIDEM_TAZMINATI_DVA,
    KIDEM_TAZMINATI_ICRA,
    KIRA_ALACAGI,
    KOMISYON,
    MADDI_TAZMINAT_DAVA,
    MADDI_TAZMINAT_ICRA,
    MANEVI_TAZMINAT_DAVA,
    MANEVI_TAZMINAT_ICRA,
    TAKSITLENDIRME_BEDELI,
    TAZMINAT,
    YARGILAMA_GIDERI_DAVA,
    YARGILAMA_GIDERI_ICRA;

    public String value() {
        return name();
    }

    public static BorcKalem fromValue(String v) {
        return valueOf(v);
    }

}
