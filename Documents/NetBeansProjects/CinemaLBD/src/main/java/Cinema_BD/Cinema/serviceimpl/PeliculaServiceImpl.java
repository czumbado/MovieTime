package Cinema_BD.Cinema.serviceimpl;

import Cinema_BD.Cinema.models.Pelicula;
import Cinema_BD.Cinema.repositories.PeliculaRepository;
import Cinema_BD.Cinema.services.PeliculaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final PeliculaRepository peliculaRepository;

    public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(Long id) {
        return peliculaRepository.findById(id);
    }

    @Override
    public Pelicula savePelicula(Pelicula pelicula) {
        // Puedes agregar validaciones o lógica de negocio aquí antes de guardar la película
        return peliculaRepository.save(pelicula);
    }

    @Override
    public void deletePelicula(Long id) {
        peliculaRepository.deleteById(id);
    }
}
