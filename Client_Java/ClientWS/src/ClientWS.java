import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import proxy.ListComptes;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stubWS = new BanqueWS().getBanqueServicePort();
        System.out.println(stubWS.conversionEuroToDH(80));
        Compte cp = stubWS.getCompte(2L);
        System.out.println("code du compte : "+cp.getCode());
        System.out.println("solde du compte : "+cp.getSolde());
        List<Compte> cptes = stubWS.listComptes();
        cptes.forEach(c -> {
            System.out.println("------------------------");
            System.out.println("code du compte : "+c.getCode());
            System.out.println("solde du compte : "+c.getSolde());
        });
    }
}
