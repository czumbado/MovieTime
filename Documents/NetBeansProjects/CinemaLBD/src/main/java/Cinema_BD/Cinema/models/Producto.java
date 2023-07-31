package Cinema_BD.Cinema.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    private String pro_nombre;
    private int pro_cantidad;
    private double pro_precio;

    // Constructor por defecto (necesario para JPA)
    public Producto() {
    }

    // Constructor con parámetros (opcional)
    public Producto(String pro_nombre, int pro_cantidad, double pro_precio) {
        this.pro_nombre = pro_nombre;
        this.pro_cantidad = pro_cantidad;
        this.pro_precio = pro_precio;
    }

    // Getters y setters
    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public int getPro_cantidad() {
        return pro_cantidad;
    }

    public void setPro_cantidad(int pro_cantidad) {
        this.pro_cantidad = pro_cantidad;
    }

    public double getPro_precio() {
        return pro_precio;
    }

    public void setPro_precio(double pro_precio) {
        this.pro_precio = pro_precio;
    }
}
