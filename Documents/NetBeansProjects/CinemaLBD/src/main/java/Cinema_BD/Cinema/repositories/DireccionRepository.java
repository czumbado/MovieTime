package Cinema_BD.Cinema.repositories;

import Cinema_BD.Cinema.models.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
