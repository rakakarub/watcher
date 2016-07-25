
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresTipi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="adresTipi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASKERLIK_ADRESI"/&gt;
 *     &lt;enumeration value="DEPO_ADRESI"/&gt;
 *     &lt;enumeration value="SIRKET_MERKEZI"/&gt;
 *     &lt;enumeration value="CEZAEVI_ADRESI"/&gt;
 *     &lt;enumeration value="YURTDISI_IKAMETGAH_ADRESI"/&gt;
 *     &lt;enumeration value="YURTDISI_ISYERI_ADRESI"/&gt;
 *     &lt;enumeration value="YURTICI_IKAMETGAH_ADRESI"/&gt;
 *     &lt;enumeration value="YURTICI_ISYERI_ADRESI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "adresTipi")
@XmlEnum
public enum AdresTipi {

    ASKERLIK_ADRESI,
    DEPO_ADRESI,
    SIRKET_MERKEZI,
    CEZAEVI_ADRESI,
    YURTDISI_IKAMETGAH_ADRESI,
    YURTDISI_ISYERI_ADRESI,
    YURTICI_IKAMETGAH_ADRESI,
    YURTICI_ISYERI_ADRESI;

    public String value() {
        return name();
    }

    public static AdresTipi fromValue(String v) {
        return valueOf(v);
    }

}
