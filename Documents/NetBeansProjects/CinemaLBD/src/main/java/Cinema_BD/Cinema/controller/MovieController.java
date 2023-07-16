package Cinema_BD.Cinema.controller;

import Cinema_BD.Cinema.models.Cine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @GetMapping("/movies")
    public String getAllMovies(Model model) {
        List<Cine> movies = obtenerPeliculasDesdeRepositorio(); // Lógica para obtener las películas desde el repositorio
        model.addAttribute("movies", movies); // Agregar la lista de películas al modelo con el nombre "movies"
        return "movies"; // Nombre de la vista HTML
    }

    // Método de ejemplo para obtener las películas desde el repositorio
    private List<Cine> obtenerPeliculasDesdeRepositorio() {
        // Lógica para obtener las películas desde el repositorio
        // Por ejemplo, puedes utilizar un servicio o una clase de repositorio para obtener los datos

        // Aquí se muestra un ejemplo con una lista de películas de ejemplo
        List<Cine> movies = new ArrayList<>();
        movies.add(new Cine(1L, "Cinemark", 123456789L, "cinemarkSP@gamil.com", "WX83+PHW, Centro Comercial Multiplaza del Este, Ruta Nacional Secundaria 215, San José, Curridabat, 11801"));
        movies.add(new Cine(2L, "Cinepolis", 987654321L, "cinepolisD@gamil.com", "Multicentro Sabana, 209, San José, Desamparados"));
        movies.add(new Cine(3L, "Nova Cinemas", 555555555L, "novacinem@gmail.com", "San José, Escazú, San Rafael contiguo a Hospital Cima, en Avenida Escazú, edificio 206."));

        return movies;
    }
}
