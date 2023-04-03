package es.arle.soap;

import es.arle.model.User;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "es.arle.soap.SOAPI")
public class SOAPImpl implements SOAPI{

    @Override
    public List<User> getUsers() {
        return User.getUsers();
    }

    @Override
    public void addUser(User user) {
        User.getUsers().add(user);
    }

}