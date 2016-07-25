
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for muvekkilTipi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="muvekkilTipi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALACAKLI"/&gt;
 *     &lt;enumeration value="BORCLU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "muvekkilTipi")
@XmlEnum
public enum MuvekkilTipi {

    ALACAKLI,
    BORCLU;

    public String value() {
        return name();
    }

    public static MuvekkilTipi fromValue(String v) {
        return valueOf(v);
    }

}
