
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for takipTipi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="takipTipi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ILAMSIZ_TAKIP"/&gt;
 *     &lt;enumeration value="ILAMLI_TAKIP"/&gt;
 *     &lt;enumeration value="ILAMSIZ_IPOTEK"/&gt;
 *     &lt;enumeration value="ILAMSIZ_KAMBIYO"/&gt;
 *     &lt;enumeration value="ILAMSIZ_REHIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "takipTipi")
@XmlEnum
public enum TakipTipi {

    ILAMSIZ_TAKIP,
    ILAMLI_TAKIP,
    ILAMSIZ_IPOTEK,
    ILAMSIZ_KAMBIYO,
    ILAMSIZ_REHIN;

    public String value() {
        return name();
    }

    public static TakipTipi fromValue(String v) {
        return valueOf(v);
    }

}
