package ws;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    @XmlAttribute
    private int id;
    @XmlElement
    private String nom;
    @XmlElement
    private String email;

    public User() {
    }

    public User(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
