package Cinema_BD.Cinema.controller;

import Cinema_BD.Cinema.models.Pelicula;
import Cinema_BD.Cinema.services.PeliculaService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PeliculaController {

    private final PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping("/pelicula")
    public String getAllPeliculas(Model model) {
        List<Pelicula> peliculas = peliculaService.getAllPeliculas();
        model.addAttribute("peliculas", peliculas);
        return "pelicula"; // Nombre de la vista HTML para mostrar la lista de películas
    }

    @GetMapping("/pelicula/{id}")
    public String getPeliculaById(@PathVariable Long id, Model model) {
        Optional<Pelicula> pelicula = peliculaService.getPeliculaById(id);
        pelicula.ifPresent(p -> model.addAttribute("pelicula", p));
        return "pelicula_detalle"; // Nombre de la vista HTML para mostrar los detalles de una película
    }

    @GetMapping("/pelicula/crear")
    public String showCreateForm(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        return "crear_pelicula"; // Nombre de la vista HTML para mostrar el formulario de creación de película
    }

    @PostMapping("/pelicula/crear")
    public String createPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula"; // Redirigir a la lista de películas después de crear una nueva película
    }

    @GetMapping("/pelicula/editar/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Pelicula> peliculaOptional = peliculaService.getPeliculaById(id);
        if (peliculaOptional.isPresent()) {
            Pelicula pelicula = peliculaOptional.get();

            // Convertir la fecha (java.util.Date) a String en el formato deseado
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String fechaString = dateFormatter.format(pelicula.getPel_fecha());

            // Establecer la fecha convertida en el modelo
            model.addAttribute("fecha", fechaString);
            model.addAttribute("pelicula", pelicula);
        }

        return "editar_pelicula"; // Nombre de la vista HTML para mostrar el formulario de edición de película
    }

    @PostMapping("/pelicula/editar/{id}")
    public String updatePelicula(@PathVariable Long id, @ModelAttribute Pelicula pelicula, @RequestParam("pel_fecha") String pel_fecha) {
        pelicula.setId_pelicula(id);

        // Convertir la fecha String en un objeto java.util.Date
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha = dateFormatter.parse(pel_fecha);
            pelicula.setPel_fecha(fecha); // Establecer la fecha convertida en la película
        } catch (ParseException e) {
          
        }

        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula"; // Redirigir a la lista de películas después de editar una película
    }

    @GetMapping("/pelicula/eliminar/{id}")
    public String deletePelicula(@PathVariable Long id) {
        peliculaService.deletePelicula(id);
        return "redirect:/pelicula"; // Redirigir a la lista de películas después de eliminar una película
    }
}
