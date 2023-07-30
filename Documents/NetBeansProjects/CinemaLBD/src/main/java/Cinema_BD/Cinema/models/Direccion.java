package Cinema_BD.Cinema.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Direccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_direccion;
    private String dir_provincia;
    private String dir_distrito;
    private String dir_canton;
    private String dir_ubicacion;

    // Constructor por defecto (necesario para JPA)
    public Direccion() {
    }

    // Constructor con parámetros (opcional)
    public Direccion(String dir_provincia, String dir_distrito, String dir_canton, String dir_ubicacion) {
        this.dir_provincia = dir_provincia;
        this.dir_distrito = dir_distrito;
        this.dir_canton = dir_canton;
        this.dir_ubicacion = dir_ubicacion;
    }

    // Getters y setters
    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getDir_provincia() {
        return dir_provincia;
    }

    public void setDir_provincia(String dir_provincia) {
        this.dir_provincia = dir_provincia;
    }

    public String getDir_distrito() {
        return dir_distrito;
    }

    public void setDir_distrito(String dir_distrito) {
        this.dir_distrito = dir_distrito;
    }

    public String getDir_canton() {
        return dir_canton;
    }

    public void setDir_canton(String dir_canton) {
        this.dir_canton = dir_canton;
    }

    public String getDir_ubicacion() {
        return dir_ubicacion;
    }

    public void setDir_ubicacion(String dir_ubicacion) {
        this.dir_ubicacion = dir_ubicacion;
    }

}
