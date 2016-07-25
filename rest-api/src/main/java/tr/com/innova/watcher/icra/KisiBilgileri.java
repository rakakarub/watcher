
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kisiBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kisiBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kisiTuru" type="{http://khy.legalite.innova.com.tr/icraOlusturService}kisiTuru"/&gt;
 *         &lt;element name="kisiAdUnvan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kisiSoyad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kisiAdresTipi" type="{http://khy.legalite.innova.com.tr/icraOlusturService}adresTipi"/&gt;
 *         &lt;element name="kisiIlId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kisiilceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kisiAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kisiBilgileri", propOrder = {
    "kisiTuru",
    "kisiAdUnvan",
    "kisiSoyad",
    "kisiAdresTipi",
    "kisiIlId",
    "kisiilceId",
    "kisiAdres"
})
public class KisiBilgileri {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected KisiTuru kisiTuru;
    @XmlElement(required = true)
    protected String kisiAdUnvan;
    @XmlElement(required = true)
    protected String kisiSoyad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AdresTipi kisiAdresTipi;
    @XmlElement(required = true)
    protected String kisiIlId;
    @XmlElement(required = true)
    protected String kisiilceId;
    @XmlElement(required = true)
    protected String kisiAdres;

    /**
     * Gets the value of the kisiTuru property.
     * 
     * @return
     *     possible object is
     *     {@link KisiTuru }
     *     
     */
    public KisiTuru getKisiTuru() {
        return kisiTuru;
    }

    /**
     * Sets the value of the kisiTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiTuru }
     *     
     */
    public void setKisiTuru(KisiTuru value) {
        this.kisiTuru = value;
    }

    /**
     * Gets the value of the kisiAdUnvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKisiAdUnvan() {
        return kisiAdUnvan;
    }

    /**
     * Sets the value of the kisiAdUnvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKisiAdUnvan(String value) {
        this.kisiAdUnvan = value;
    }

    /**
     * Gets the value of the kisiSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKisiSoyad() {
        return kisiSoyad;
    }

    /**
     * Sets the value of the kisiSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKisiSoyad(String value) {
        this.kisiSoyad = value;
    }

    /**
     * Gets the value of the kisiAdresTipi property.
     * 
     * @return
     *     possible object is
     *     {@link AdresTipi }
     *     
     */
    public AdresTipi getKisiAdresTipi() {
        return kisiAdresTipi;
    }

    /**
     * Sets the value of the kisiAdresTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresTipi }
     *     
     */
    public void setKisiAdresTipi(AdresTipi value) {
        this.kisiAdresTipi = value;
    }

    /**
     * Gets the value of the kisiIlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKisiIlId() {
        return kisiIlId;
    }

    /**
     * Sets the value of the kisiIlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKisiIlId(String value) {
        this.kisiIlId = value;
    }

    /**
     * Gets the value of the kisiilceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKisiilceId() {
        return kisiilceId;
    }

    /**
     * Sets the value of the kisiilceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKisiilceId(String value) {
        this.kisiilceId = value;
    }

    /**
     * Gets the value of the kisiAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKisiAdres() {
        return kisiAdres;
    }

    /**
     * Sets the value of the kisiAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKisiAdres(String value) {
        this.kisiAdres = value;
    }

}
