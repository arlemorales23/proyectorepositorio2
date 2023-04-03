package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(name = "userWS")
public class UserWS {
    @WebMethod
    public User getUser(@WebParam(name = "id") int id) {
        return new User(1, "Arle", "arle@gmail.com");
    }

    @WebMethod
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Arle", "arleth64@hotmail.com"));
        users.add(new User(2, "Alvaro", "alvaro@hotmail.com"));
        users.add(new User(1, "Santiago", "arleth64@hotmail.com"));
        return users;
    }

}
