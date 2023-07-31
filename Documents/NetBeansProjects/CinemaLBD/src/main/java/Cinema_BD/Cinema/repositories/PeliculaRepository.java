package Cinema_BD.Cinema.repositories;

import Cinema_BD.Cinema.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
