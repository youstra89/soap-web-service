package ws;

import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8888/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Server started at " + url);
    }
}
