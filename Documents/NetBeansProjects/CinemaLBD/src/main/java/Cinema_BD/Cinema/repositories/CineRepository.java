package Cinema_BD.Cinema.repositories;

import Cinema_BD.Cinema.models.Cine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CineRepository extends JpaRepository<Cine, Long> {
    // Puedes agregar métodos adicionales según tus necesidades
}
