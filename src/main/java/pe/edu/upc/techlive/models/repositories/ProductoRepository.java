package pe.edu.upc.techlive.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.techlive.models.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	List<Producto> findByModeloContaining(String modelo) throws Exception;
}
