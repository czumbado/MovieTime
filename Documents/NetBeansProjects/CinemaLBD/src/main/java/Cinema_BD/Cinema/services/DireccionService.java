package Cinema_BD.Cinema.services;

import Cinema_BD.Cinema.models.Direccion;

import java.util.List;
import java.util.Optional;

public interface DireccionService {
    List<Direccion> getAllDirecciones();
    Optional<Direccion> getDireccionById(Long id);
    Direccion saveDireccion(Direccion direccion);
    void deleteDireccion(Long id);
}
