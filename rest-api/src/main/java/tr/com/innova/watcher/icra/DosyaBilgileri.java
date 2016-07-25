
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dosyaBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dosyaBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muvekkilTipi" type="{http://khy.legalite.innova.com.tr/icraOlusturService}muvekkilTipi"/&gt;
 *         &lt;element name="muvekkilId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buroId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="muvekkilDosyaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dosyaKonu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dosyaAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dosyaBilgileri", propOrder = {
    "muvekkilTipi",
    "muvekkilId",
    "buroId",
    "muvekkilDosyaNo",
    "dosyaKonu",
    "ilId",
    "ilceId",
    "dosyaAciklama"
})
public class DosyaBilgileri {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MuvekkilTipi muvekkilTipi;
    @XmlElement(required = true)
    protected String muvekkilId;
    @XmlElement(required = true, nillable = true)
    protected String buroId;
    @XmlElement(required = true)
    protected String muvekkilDosyaNo;
    @XmlElement(required = true)
    protected String dosyaKonu;
    @XmlElement(required = true)
    protected String ilId;
    @XmlElement(required = true)
    protected String ilceId;
    @XmlElement(required = true, nillable = true)
    protected String dosyaAciklama;

    /**
     * Gets the value of the muvekkilTipi property.
     * 
     * @return
     *     possible object is
     *     {@link MuvekkilTipi }
     *     
     */
    public MuvekkilTipi getMuvekkilTipi() {
        return muvekkilTipi;
    }

    /**
     * Sets the value of the muvekkilTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MuvekkilTipi }
     *     
     */
    public void setMuvekkilTipi(MuvekkilTipi value) {
        this.muvekkilTipi = value;
    }

    /**
     * Gets the value of the muvekkilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuvekkilId() {
        return muvekkilId;
    }

    /**
     * Sets the value of the muvekkilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuvekkilId(String value) {
        this.muvekkilId = value;
    }

    /**
     * Gets the value of the buroId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuroId() {
        return buroId;
    }

    /**
     * Sets the value of the buroId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuroId(String value) {
        this.buroId = value;
    }

    /**
     * Gets the value of the muvekkilDosyaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuvekkilDosyaNo() {
        return muvekkilDosyaNo;
    }

    /**
     * Sets the value of the muvekkilDosyaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuvekkilDosyaNo(String value) {
        this.muvekkilDosyaNo = value;
    }

    /**
     * Gets the value of the dosyaKonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyaKonu() {
        return dosyaKonu;
    }

    /**
     * Sets the value of the dosyaKonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyaKonu(String value) {
        this.dosyaKonu = value;
    }

    /**
     * Gets the value of the ilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlId() {
        return ilId;
    }

    /**
     * Sets the value of the ilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlId(String value) {
        this.ilId = value;
    }

    /**
     * Gets the value of the ilceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlceId() {
        return ilceId;
    }

    /**
     * Sets the value of the ilceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlceId(String value) {
        this.ilceId = value;
    }

    /**
     * Gets the value of the dosyaAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyaAciklama() {
        return dosyaAciklama;
    }

    /**
     * Sets the value of the dosyaAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyaAciklama(String value) {
        this.dosyaAciklama = value;
    }

}
