
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertionFromEuroToDH", targetNamespace = "http://ws/", className = "proxy.ConvertionFromEuroToDH")
    @ResponseWrapper(localName = "convertionFromEuroToDHResponse", targetNamespace = "http://ws/", className = "proxy.ConvertionFromEuroToDHResponse")
    @Action(input = "http://ws/BanqueService/convertionFromEuroToDHRequest", output = "http://ws/BanqueService/convertionFromEuroToDHResponse")
    public double convertionFromEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "compteList", targetNamespace = "http://ws/", className = "proxy.CompteList")
    @ResponseWrapper(localName = "compteListResponse", targetNamespace = "http://ws/", className = "proxy.CompteListResponse")
    @Action(input = "http://ws/BanqueService/compteListRequest", output = "http://ws/BanqueService/compteListResponse")
    public List<Compte> compteList();

}
