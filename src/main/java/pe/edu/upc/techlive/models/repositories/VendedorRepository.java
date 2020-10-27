package pe.edu.upc.techlive.models.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.techlive.models.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer>{
	List<Vendedor> findByNombreStartingWith(String nombre) throws Exception;
	List<Vendedor> findByDireccionContaining(String direccion) throws Exception;
	Optional<Vendedor> findByRuc (String ruc) throws Exception;
}
