package Cinema_BD.Cinema.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pelicula;
    private String pel_titulo;
    private Integer pel_duracion;
    private String pel_clasificacion;
    private java.util.Date pel_fecha; // Cambiado el tipo de dato a java.util.Date
    private Integer pel_genero;
    private Integer pel_idioma;
    private String imagen_url; // Nuevo atributo para la URL de la imagen

    // Constructor por defecto (necesario para JPA)
    public Pelicula() {
    }

    // Constructor con parámetros (opcional)
    public Pelicula(String pel_titulo, Integer pel_duracion, String pel_clasificacion, java.util.Date pel_fecha,
                    Integer pel_genero, Integer pel_idioma, String imagen_url) {
        this.pel_titulo = pel_titulo;
        this.pel_duracion = pel_duracion;
        this.pel_clasificacion = pel_clasificacion;
        this.pel_fecha = pel_fecha;
        this.pel_genero = pel_genero;
        this.pel_idioma = pel_idioma;
        this.imagen_url = imagen_url;
    }

    // Getters y setters (incluyendo imagen_url)
    public Long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getPel_titulo() {
        return pel_titulo;
    }

    public void setPel_titulo(String pel_titulo) {
        this.pel_titulo = pel_titulo;
    }

    public Integer getPel_duracion() {
        return pel_duracion;
    }

    public void setPel_duracion(Integer pel_duracion) {
        this.pel_duracion = pel_duracion;
    }

    public String getPel_clasificacion() {
        return pel_clasificacion;
    }

    public void setPel_clasificacion(String pel_clasificacion) {
        this.pel_clasificacion = pel_clasificacion;
    }

    public java.util.Date getPel_fecha() {
        return pel_fecha;
    }

    public void setPel_fecha(java.util.Date pel_fecha) {
        this.pel_fecha = pel_fecha;
    }

    public Integer getPel_genero() {
        return pel_genero;
    }

    public void setPel_genero(Integer pel_genero) {
        this.pel_genero = pel_genero;
    }

    public Integer getPel_idioma() {
        return pel_idioma;
    }

    public void setPel_idioma(Integer pel_idioma) {
        this.pel_idioma = pel_idioma;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }
}
