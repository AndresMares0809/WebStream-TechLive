package pe.edu.upc.techlive.models.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.techlive.models.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	List<Cliente> findByDireccionContaining(String direccion) throws Exception;
	Optional<Cliente> findByDni(String dni) throws Exception;
	Optional<Cliente> findByRuc(String ruc) throws Exception;
}
