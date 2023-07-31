package Cinema_BD.Cinema.controller;

import Cinema_BD.Cinema.models.Direccion;
import Cinema_BD.Cinema.services.DireccionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class DireccionController {

    private final DireccionService direccionService;

    public DireccionController(DireccionService direccionService) {
        this.direccionService = direccionService;
    }

    @GetMapping("/direccion")
    public String getAllDirecciones(Model model) {
        List<Direccion> direcciones = direccionService.getAllDirecciones();
        model.addAttribute("direcciones", direcciones);
        return "direccion"; // Nombre de la vista HTML para mostrar la lista de direcciones
    }

    @GetMapping("/direccion/{id}")
    public String getDireccionById(@PathVariable Long id, Model model) {
        Optional<Direccion> direccion = direccionService.getDireccionById(id);
        direccion.ifPresent(d -> model.addAttribute("direccion", d));
        return "direccion"; // Nombre de la vista HTML para mostrar los detalles de una dirección
    }

    @GetMapping("/direccion/crear")
    public String showCreateForm(Model model) {
        model.addAttribute("direccion", new Direccion());
        return "crear_direccion"; // Nombre de la vista HTML para mostrar el formulario de creación
    }

    @PostMapping("/direccion/crear")
    public String createDireccion(@ModelAttribute Direccion direccion) {
        direccionService.saveDireccion(direccion);
        return "redirect:/direccion"; // Redirigir a la lista de direcciones después de crear una nueva dirección
    }

    @GetMapping("/direccion/editar/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Direccion> direccion = direccionService.getDireccionById(id);
        direccion.ifPresent(d -> model.addAttribute("direccion", d));
        return "editar_direccion"; // Nombre de la vista HTML para mostrar el formulario de edición
    }

     @PostMapping("/direccion/editar/{id}")
    public String updateDireccion(@PathVariable Long id, @ModelAttribute Direccion direccion) {
        direccion.setId_direccion(id);
        direccionService.saveDireccion(direccion);
        return "redirect:/direccion"; // Redirigir a la lista de direcciones después de editar una dirección
    }

    @GetMapping("/direccion/eliminar/{id}")
    public String deleteDireccion(@PathVariable Long id) {
        direccionService.deleteDireccion(id);
        return "redirect:/direccion"; // Redirigir a la lista de direcciones después de eliminar una dirección
    }
   
}
