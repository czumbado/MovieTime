package Cinema_BD.Cinema.controller;

import Cinema_BD.Cinema.models.Producto;
import Cinema_BD.Cinema.services.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/producto")
    public String getAllProductos(Model model) {
        List<Producto> productos = productoService.getAllProductos();
        model.addAttribute("productos", productos);
        return "producto"; // Nombre de la vista HTML para mostrar la lista de productos
    }

    @GetMapping("/producto/{id}")
    public String getProductoById(@PathVariable Long id, Model model) {
        Optional<Producto> producto = productoService.getProductoById(id);
        producto.ifPresent(p -> model.addAttribute("producto", p));
        return "producto_detalle"; // Nombre de la vista HTML para mostrar los detalles de un producto
    }

    @GetMapping("/producto/crear")
    public String showCreateForm(Model model) {
        model.addAttribute("producto", new Producto());
        return "crear_producto"; // Nombre de la vista HTML para mostrar el formulario de creación de producto
    }

    @PostMapping("/producto/crear")
    public String createProducto(@ModelAttribute Producto producto) {
        productoService.saveProducto(producto);
        return "redirect:/producto"; // Redirigir a la lista de productos después de crear un nuevo producto
    }

    @GetMapping("/producto/editar/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Producto> producto = productoService.getProductoById(id);
        producto.ifPresent(p -> model.addAttribute("producto", p));
        return "editar_producto"; // Nombre de la vista HTML para mostrar el formulario de edición de producto
    }

    @PostMapping("/producto/editar/{id}")
    public String updateProducto(@PathVariable Long id, @ModelAttribute Producto producto) {
        producto.setId_producto(id);
        productoService.saveProducto(producto);
        return "redirect:/producto"; // Redirigir a la lista de productos después de editar un producto
    }

    @GetMapping("/producto/eliminar/{id}")
    public String deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
        return "redirect:/producto"; // Redirigir a la lista de productos después de eliminar un producto
    }
}
