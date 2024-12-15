
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _CompteList_QNAME = new QName("http://ws/", "compteList");
    private static final QName _CompteListResponse_QNAME = new QName("http://ws/", "compteListResponse");
    private static final QName _ConvertionFromEuroToDH_QNAME = new QName("http://ws/", "convertionFromEuroToDH");
    private static final QName _ConvertionFromEuroToDHResponse_QNAME = new QName("http://ws/", "convertionFromEuroToDHResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompteList }
     * 
     * @return
     *     the new instance of {@link CompteList }
     */
    public CompteList createCompteList() {
        return new CompteList();
    }

    /**
     * Create an instance of {@link CompteListResponse }
     * 
     * @return
     *     the new instance of {@link CompteListResponse }
     */
    public CompteListResponse createCompteListResponse() {
        return new CompteListResponse();
    }

    /**
     * Create an instance of {@link ConvertionFromEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConvertionFromEuroToDH }
     */
    public ConvertionFromEuroToDH createConvertionFromEuroToDH() {
        return new ConvertionFromEuroToDH();
    }

    /**
     * Create an instance of {@link ConvertionFromEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConvertionFromEuroToDHResponse }
     */
    public ConvertionFromEuroToDHResponse createConvertionFromEuroToDHResponse() {
        return new ConvertionFromEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compteList")
    public JAXBElement<CompteList> createCompteList(CompteList value) {
        return new JAXBElement<>(_CompteList_QNAME, CompteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compteListResponse")
    public JAXBElement<CompteListResponse> createCompteListResponse(CompteListResponse value) {
        return new JAXBElement<>(_CompteListResponse_QNAME, CompteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertionFromEuroToDH")
    public JAXBElement<ConvertionFromEuroToDH> createConvertionFromEuroToDH(ConvertionFromEuroToDH value) {
        return new JAXBElement<>(_ConvertionFromEuroToDH_QNAME, ConvertionFromEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertionFromEuroToDHResponse")
    public JAXBElement<ConvertionFromEuroToDHResponse> createConvertionFromEuroToDHResponse(ConvertionFromEuroToDHResponse value) {
        return new JAXBElement<>(_ConvertionFromEuroToDHResponse_QNAME, ConvertionFromEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
