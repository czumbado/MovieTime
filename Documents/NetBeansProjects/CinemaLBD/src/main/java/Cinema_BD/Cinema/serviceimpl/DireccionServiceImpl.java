package Cinema_BD.Cinema.serviceimpl;

import Cinema_BD.Cinema.models.Direccion;
import Cinema_BD.Cinema.repositories.DireccionRepository;
import Cinema_BD.Cinema.services.DireccionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionServiceImpl implements DireccionService {

    private final DireccionRepository direccionRepository;

    public DireccionServiceImpl(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    @Override
    public List<Direccion> getAllDirecciones() {
        return direccionRepository.findAll();
    }

    @Override
    public Optional<Direccion> getDireccionById(Long id) {
        return direccionRepository.findById(id);
    }

    @Override
    public Direccion saveDireccion(Direccion direccion) {
        if (direccion.getDir_canton() == null || direccion.getDir_canton().isEmpty()) {
            // Manejar el caso cuando el campo dir_canton es NULL o vacío
            throw new IllegalArgumentException("El campo dir_canton no puede ser nulo o vacío.");
        }

        return direccionRepository.save(direccion);
    }

    @Override
    public void deleteDireccion(Long id) {
        direccionRepository.deleteById(id);
    }
}
