package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJAXWS {
    public static void main(String[] args) {
        String address = "http://127.0.0.1:5555/";
        Endpoint.publish(address, new UserWS());
        System.out.println("web service esta desplegado en :" + address);
    }
}
