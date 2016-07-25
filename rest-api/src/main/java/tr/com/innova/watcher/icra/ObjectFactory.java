
package tr.com.innova.watcher.icra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.innova.legalite.khy.icra package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IcraOlustur_QNAME = new QName("http://khy.legalite.innova.com.tr/icraOlusturService", "icraOlustur");
    private final static QName _IcraOlusturResponse_QNAME = new QName("http://khy.legalite.innova.com.tr/icraOlusturService", "icraOlusturResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.innova.legalite.khy.icra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IcraOlustur }
     * 
     */
    public IcraOlustur createIcraOlustur() {
        return new IcraOlustur();
    }

    /**
     * Create an instance of {@link IcraOlusturResponse }
     * 
     */
    public IcraOlusturResponse createIcraOlusturResponse() {
        return new IcraOlusturResponse();
    }

    /**
     * Create an instance of {@link DosyaBilgileri }
     * 
     */
    public DosyaBilgileri createDosyaBilgileri() {
        return new DosyaBilgileri();
    }

    /**
     * Create an instance of {@link KisiBilgileri }
     * 
     */
    public KisiBilgileri createKisiBilgileri() {
        return new KisiBilgileri();
    }

    /**
     * Create an instance of {@link IcraBilgileri }
     * 
     */
    public IcraBilgileri createIcraBilgileri() {
        return new IcraBilgileri();
    }

    /**
     * Create an instance of {@link TutarBilgileri }
     * 
     */
    public TutarBilgileri createTutarBilgileri() {
        return new TutarBilgileri();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IcraOlustur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://khy.legalite.innova.com.tr/icraOlusturService", name = "icraOlustur")
    public JAXBElement<IcraOlustur> createIcraOlustur(IcraOlustur value) {
        return new JAXBElement<IcraOlustur>(_IcraOlustur_QNAME, IcraOlustur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IcraOlusturResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://khy.legalite.innova.com.tr/icraOlusturService", name = "icraOlusturResponse")
    public JAXBElement<IcraOlusturResponse> createIcraOlusturResponse(IcraOlusturResponse value) {
        return new JAXBElement<IcraOlusturResponse>(_IcraOlusturResponse_QNAME, IcraOlusturResponse.class, null, value);
    }

}
