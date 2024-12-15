package ci.youstra;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientSoap {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();

        System.out.println("----------------------------------------------");
        System.out.println("Exécution de la méthode convertionFromEuroToDH");
        System.out.println(proxy.convertionFromEuroToDH(100));

        System.out.println("----------------------------------------------");
        System.out.println("Exécution de la méthode getCompte");
        Compte cp = proxy.getCompte(3);
        printCompte(cp);

        List<Compte> comptes = proxy.compteList();
        System.out.println("----------------------------------------------");
        System.out.println("Exécution de la méthode compteList");
        comptes.forEach(ClientSoap::printCompte);
    }

    public static void printCompte(Compte cp) {
        System.out.println("---------------------");
        System.out.println("Code : " + cp.getCode());
        System.out.println("Solde : " + cp.getSolde());
        System.out.println("Date de création : " + cp.getDateCreation());
    }
}
