package Cinema_BD.Cinema.services;

import Cinema_BD.Cinema.models.Cine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import Cinema_BD.Cinema.repositories.CineRepository;

@Service
public class MovieService {

    private final CineRepository movieRepository;

    @Autowired
    public MovieService(CineRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Cine> getAllMovies() {
        return movieRepository.findAll();
    }

    // Otros métodos según tus necesidades
}