package pe.edu.upc.techlive.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.techlive.models.entities.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Integer>{

	List<DetallePedido> findByConfirmacionPedidoTrue() throws Exception;
	
}
