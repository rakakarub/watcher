
package tr.com.innova.watcher.icra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for icraBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="icraBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="takipTipi" type="{http://khy.legalite.innova.com.tr/icraOlusturService}takipTipi"/&gt;
 *         &lt;element name="takipBaslatilmis" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ilamTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ilamEsasNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilamKararNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilamMahkemesiId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="karsiTarafVekilleri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="takipBaslatmaTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="icraDosyaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icraMudurluguId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tebligTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="takipKesinlestirmeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hacizTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="bsmvHesaplansinMi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "icraBilgileri", propOrder = {
    "takipTipi",
    "takipBaslatilmis",
    "ilamTarihi",
    "ilamEsasNo",
    "ilamKararNo",
    "ilamMahkemesiId",
    "karsiTarafVekilleri",
    "takipBaslatmaTarihi",
    "icraDosyaNo",
    "icraMudurluguId",
    "tebligTarihi",
    "takipKesinlestirmeTarihi",
    "hacizTarihi",
    "bsmvHesaplansinMi"
})
public class IcraBilgileri {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TakipTipi takipTipi;
    protected boolean takipBaslatilmis;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ilamTarihi;
    @XmlElement(required = true)
    protected String ilamEsasNo;
    @XmlElement(required = true)
    protected String ilamKararNo;
    @XmlElement(required = true)
    protected String ilamMahkemesiId;
    @XmlElement(required = true, nillable = true)
    protected String karsiTarafVekilleri;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar takipBaslatmaTarihi;
    @XmlElement(required = true, nillable = true)
    protected String icraDosyaNo;
    @XmlElement(required = true, nillable = true)
    protected String icraMudurluguId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tebligTarihi;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar takipKesinlestirmeTarihi;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hacizTarihi;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bsmvHesaplansinMi;

    /**
     * Gets the value of the takipTipi property.
     * 
     * @return
     *     possible object is
     *     {@link TakipTipi }
     *     
     */
    public TakipTipi getTakipTipi() {
        return takipTipi;
    }

    /**
     * Sets the value of the takipTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakipTipi }
     *     
     */
    public void setTakipTipi(TakipTipi value) {
        this.takipTipi = value;
    }

    /**
     * Gets the value of the takipBaslatilmis property.
     * 
     */
    public boolean isTakipBaslatilmis() {
        return takipBaslatilmis;
    }

    /**
     * Sets the value of the takipBaslatilmis property.
     * 
     */
    public void setTakipBaslatilmis(boolean value) {
        this.takipBaslatilmis = value;
    }

    /**
     * Gets the value of the ilamTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIlamTarihi() {
        return ilamTarihi;
    }

    /**
     * Sets the value of the ilamTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIlamTarihi(XMLGregorianCalendar value) {
        this.ilamTarihi = value;
    }

    /**
     * Gets the value of the ilamEsasNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlamEsasNo() {
        return ilamEsasNo;
    }

    /**
     * Sets the value of the ilamEsasNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlamEsasNo(String value) {
        this.ilamEsasNo = value;
    }

    /**
     * Gets the value of the ilamKararNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlamKararNo() {
        return ilamKararNo;
    }

    /**
     * Sets the value of the ilamKararNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlamKararNo(String value) {
        this.ilamKararNo = value;
    }

    /**
     * Gets the value of the ilamMahkemesiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlamMahkemesiId() {
        return ilamMahkemesiId;
    }

    /**
     * Sets the value of the ilamMahkemesiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlamMahkemesiId(String value) {
        this.ilamMahkemesiId = value;
    }

    /**
     * Gets the value of the karsiTarafVekilleri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKarsiTarafVekilleri() {
        return karsiTarafVekilleri;
    }

    /**
     * Sets the value of the karsiTarafVekilleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKarsiTarafVekilleri(String value) {
        this.karsiTarafVekilleri = value;
    }

    /**
     * Gets the value of the takipBaslatmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakipBaslatmaTarihi() {
        return takipBaslatmaTarihi;
    }

    /**
     * Sets the value of the takipBaslatmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakipBaslatmaTarihi(XMLGregorianCalendar value) {
        this.takipBaslatmaTarihi = value;
    }

    /**
     * Gets the value of the icraDosyaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcraDosyaNo() {
        return icraDosyaNo;
    }

    /**
     * Sets the value of the icraDosyaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcraDosyaNo(String value) {
        this.icraDosyaNo = value;
    }

    /**
     * Gets the value of the icraMudurluguId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcraMudurluguId() {
        return icraMudurluguId;
    }

    /**
     * Sets the value of the icraMudurluguId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcraMudurluguId(String value) {
        this.icraMudurluguId = value;
    }

    /**
     * Gets the value of the tebligTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTebligTarihi() {
        return tebligTarihi;
    }

    /**
     * Sets the value of the tebligTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTebligTarihi(XMLGregorianCalendar value) {
        this.tebligTarihi = value;
    }

    /**
     * Gets the value of the takipKesinlestirmeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakipKesinlestirmeTarihi() {
        return takipKesinlestirmeTarihi;
    }

    /**
     * Sets the value of the takipKesinlestirmeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakipKesinlestirmeTarihi(XMLGregorianCalendar value) {
        this.takipKesinlestirmeTarihi = value;
    }

    /**
     * Gets the value of the hacizTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHacizTarihi() {
        return hacizTarihi;
    }

    /**
     * Sets the value of the hacizTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHacizTarihi(XMLGregorianCalendar value) {
        this.hacizTarihi = value;
    }

    /**
     * Gets the value of the bsmvHesaplansinMi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBsmvHesaplansinMi() {
        return bsmvHesaplansinMi;
    }

    /**
     * Sets the value of the bsmvHesaplansinMi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBsmvHesaplansinMi(Boolean value) {
        this.bsmvHesaplansinMi = value;
    }

}
