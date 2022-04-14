
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetCompteResponse_QNAME = new QName("http://WS/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://WS/", "getCompte");
    private final static QName _ListComptes_QNAME = new QName("http://WS/", "listComptes");
    private final static QName _ListComptesResponse_QNAME = new QName("http://WS/", "listComptesResponse");
    private final static QName _ConversionEuroToDHResponse_QNAME = new QName("http://WS/", "conversionEuroToDHResponse");
    private final static QName _Compte_QNAME = new QName("http://WS/", "compte");
    private final static QName _ConversionEuroToDH_QNAME = new QName("http://WS/", "conversionEuroToDH");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<ListComptes>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<ListComptesResponse>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "conversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<ConversionEuroToDHResponse>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "conversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<ConversionEuroToDH>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

}
