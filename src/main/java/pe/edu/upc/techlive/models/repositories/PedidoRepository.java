package pe.edu.upc.techlive.models.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.techlive.models.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{


}
