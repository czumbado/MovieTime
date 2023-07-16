package Cinema_BD.Cinema.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Long telFk;
    private String emailFk;
    private String direccionFk;

    // Otros atributos y métodos getter/setter
    
    public Cine() {
    }

    public Cine(String title) {
        this.title = title;
    }

    public Cine(Long id, String title, Long telFk, String emailFk, String direccionFk) {
        this.id = id;
        this.title = title;
        this.telFk = telFk;
        this.emailFk = emailFk;
        this.direccionFk = direccionFk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Long getTelFk() {
        return telFk;
    }

    public void setTelFk(Long telFk) {
        this.telFk = telFk;
    }

    public String getEmailFk() {
        return emailFk;
    }

    public void setEmailFk(String emailFk) {
        this.emailFk = emailFk;
    }

    public String getDireccionFk() {
        return direccionFk;
    }

    public void setDireccionFk(String direccionFk) {
        this.direccionFk = direccionFk;
    }

}
