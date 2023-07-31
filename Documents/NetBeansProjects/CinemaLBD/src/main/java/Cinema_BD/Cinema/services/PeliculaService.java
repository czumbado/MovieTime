package Cinema_BD.Cinema.services;

import Cinema_BD.Cinema.models.Pelicula;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Optional<Pelicula> getPeliculaById(Long id);
    Pelicula savePelicula(Pelicula pelicula);
    void deletePelicula(Long id);
}
