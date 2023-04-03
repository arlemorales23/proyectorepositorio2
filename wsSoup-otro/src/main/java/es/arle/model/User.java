package es.arle.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public static List<User> users = new ArrayList<>(Arrays.asList(
            new User("Arle", "arleth64"),
            new User("Pepito", "Grillo"),
            new User("Manuela", "Río")));
    @XmlElement
   public String name;
    @XmlElement
    public String username;

    public User() {
        super();
    }

    public User(String name, String username) {
        super();
        this.name = name;
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static List<User> getUsers()
    {
        return users;
    }

}