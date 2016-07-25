
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tutarBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tutarBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="borcKalem" type="{http://khy.legalite.innova.com.tr/icraOlusturService}borcKalem"/&gt;
 *         &lt;element name="borcTutari" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="faizTipiId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faizBaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sabitFaizOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="faizPeriyodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tutarAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tutarBilgileri", propOrder = {
    "borcKalem",
    "borcTutari",
    "faizTipiId",
    "faizBaslangicTarihi",
    "sabitFaizOrani",
    "faizPeriyodu",
    "tutarAciklama"
})
public class TutarBilgileri {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BorcKalem borcKalem;
    protected long borcTutari;
    @XmlElement(required = true, nillable = true)
    protected String faizTipiId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar faizBaslangicTarihi;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sabitFaizOrani;
    @XmlElement(required = true, nillable = true)
    protected String faizPeriyodu;
    @XmlElement(required = true, nillable = true)
    protected String tutarAciklama;

    /**
     * Gets the value of the borcKalem property.
     * 
     * @return
     *     possible object is
     *     {@link BorcKalem }
     *     
     */
    public BorcKalem getBorcKalem() {
        return borcKalem;
    }

    /**
     * Sets the value of the borcKalem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorcKalem }
     *     
     */
    public void setBorcKalem(BorcKalem value) {
        this.borcKalem = value;
    }

    /**
     * Gets the value of the borcTutari property.
     * 
     */
    public long getBorcTutari() {
        return borcTutari;
    }

    /**
     * Sets the value of the borcTutari property.
     * 
     */
    public void setBorcTutari(long value) {
        this.borcTutari = value;
    }

    /**
     * Gets the value of the faizTipiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaizTipiId() {
        return faizTipiId;
    }

    /**
     * Sets the value of the faizTipiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaizTipiId(String value) {
        this.faizTipiId = value;
    }

    /**
     * Gets the value of the faizBaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaizBaslangicTarihi() {
        return faizBaslangicTarihi;
    }

    /**
     * Sets the value of the faizBaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaizBaslangicTarihi(XMLGregorianCalendar value) {
        this.faizBaslangicTarihi = value;
    }

    /**
     * Gets the value of the sabitFaizOrani property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSabitFaizOrani() {
        return sabitFaizOrani;
    }

    /**
     * Sets the value of the sabitFaizOrani property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSabitFaizOrani(Double value) {
        this.sabitFaizOrani = value;
    }

    /**
     * Gets the value of the faizPeriyodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaizPeriyodu() {
        return faizPeriyodu;
    }

    /**
     * Sets the value of the faizPeriyodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaizPeriyodu(String value) {
        this.faizPeriyodu = value;
    }

    /**
     * Gets the value of the tutarAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTutarAciklama() {
        return tutarAciklama;
    }

    /**
     * Sets the value of the tutarAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTutarAciklama(String value) {
        this.tutarAciklama = value;
    }

}
