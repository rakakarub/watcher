
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kisiTuru.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kisiTuru"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GERCEK"/&gt;
 *     &lt;enumeration value="TUZEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kisiTuru")
@XmlEnum
public enum KisiTuru {

    GERCEK,
    TUZEL;

    public String value() {
        return name();
    }

    public static KisiTuru fromValue(String v) {
        return valueOf(v);
    }

}
