package es.arle.soap;

import es.arle.model.User;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface SOAPI {

    @WebMethod
    public List<User> getUsers();

    @WebMethod
    public void addUser(User user);

}