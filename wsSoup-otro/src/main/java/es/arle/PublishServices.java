package es.arle;

import es.arle.soap.SOAPImpl;
import jakarta.xml.ws.Endpoint;
import es.arle.model.User;

public class PublishServices {
    public static void main(String[] args) {
        String address = "http://127.0.0.1:4500/apialvaro";
        Endpoint.publish(address, new SOAPImpl());
        System.out.println("web service esta desplegado en :" + address);
    }
}
