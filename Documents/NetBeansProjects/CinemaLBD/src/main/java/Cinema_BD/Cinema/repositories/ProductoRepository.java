package Cinema_BD.Cinema.repositories;

import Cinema_BD.Cinema.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
