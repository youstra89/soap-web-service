package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convertionFromEuroToDH")
    public double convertion(@WebParam(name = "montant") double amount) {
        return amount * 11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 15000, new Date());
    }


    @WebMethod
    public List<Compte> compteList() {
        List<Compte> compteList = new ArrayList<>();
        compteList.add(getCompte(1));
        compteList.add(getCompte(2));
        compteList.add(getCompte(3));

        return compteList;
    }
}
