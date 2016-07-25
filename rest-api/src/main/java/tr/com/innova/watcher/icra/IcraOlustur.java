
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for icraOlustur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="icraOlustur"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dosyaBilgileri" type="{http://khy.legalite.innova.com.tr/icraOlusturService}dosyaBilgileri"/&gt;
 *         &lt;element name="kisiBilgileri" type="{http://khy.legalite.innova.com.tr/icraOlusturService}kisiBilgileri"/&gt;
 *         &lt;element name="icraBilgileri" type="{http://khy.legalite.innova.com.tr/icraOlusturService}icraBilgileri"/&gt;
 *         &lt;element name="tutarBilgileri" type="{http://khy.legalite.innova.com.tr/icraOlusturService}tutarBilgileri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "icraOlustur", propOrder = {
    "dosyaBilgileri",
    "kisiBilgileri",
    "icraBilgileri",
    "tutarBilgileri"
})
public class IcraOlustur {

    @XmlElement(required = true)
    protected DosyaBilgileri dosyaBilgileri;
    @XmlElement(required = true)
    protected KisiBilgileri kisiBilgileri;
    @XmlElement(required = true)
    protected IcraBilgileri icraBilgileri;
    @XmlElement(required = true)
    protected TutarBilgileri tutarBilgileri;

    /**
     * Gets the value of the dosyaBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link DosyaBilgileri }
     *     
     */
    public DosyaBilgileri getDosyaBilgileri() {
        return dosyaBilgileri;
    }

    /**
     * Sets the value of the dosyaBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link DosyaBilgileri }
     *     
     */
    public void setDosyaBilgileri(DosyaBilgileri value) {
        this.dosyaBilgileri = value;
    }

    /**
     * Gets the value of the kisiBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link KisiBilgileri }
     *     
     */
    public KisiBilgileri getKisiBilgileri() {
        return kisiBilgileri;
    }

    /**
     * Sets the value of the kisiBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiBilgileri }
     *     
     */
    public void setKisiBilgileri(KisiBilgileri value) {
        this.kisiBilgileri = value;
    }

    /**
     * Gets the value of the icraBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link IcraBilgileri }
     *     
     */
    public IcraBilgileri getIcraBilgileri() {
        return icraBilgileri;
    }

    /**
     * Sets the value of the icraBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcraBilgileri }
     *     
     */
    public void setIcraBilgileri(IcraBilgileri value) {
        this.icraBilgileri = value;
    }

    /**
     * Gets the value of the tutarBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link TutarBilgileri }
     *     
     */
    public TutarBilgileri getTutarBilgileri() {
        return tutarBilgileri;
    }

    /**
     * Sets the value of the tutarBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link TutarBilgileri }
     *     
     */
    public void setTutarBilgileri(TutarBilgileri value) {
        this.tutarBilgileri = value;
    }

}
