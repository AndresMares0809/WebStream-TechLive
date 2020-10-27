package pe.edu.upc.techlive.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.techlive.models.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	List<Usuario> findByApellidoStartingWith(String apellido) throws Exception;
}
