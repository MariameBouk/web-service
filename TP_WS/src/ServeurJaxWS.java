import WS.BanqueService;

import javax.xml.ws.Endpoint;
public class ServeurJaxWS {
    public static void main(String[] args) {
        /*
        Déployer le web service
         */
        String url = "http://0.0.0.0:3232/"; //quelque soit l'@ IP
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployé sur l'url "+url);

    }
}
