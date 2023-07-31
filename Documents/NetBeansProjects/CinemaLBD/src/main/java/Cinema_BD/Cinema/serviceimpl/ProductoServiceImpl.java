package Cinema_BD.Cinema.serviceimpl;

import Cinema_BD.Cinema.models.Producto;
import Cinema_BD.Cinema.repositories.ProductoRepository;
import Cinema_BD.Cinema.services.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        // Puedes agregar validaciones o lógica de negocio aquí antes de guardar el producto
        return productoRepository.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
