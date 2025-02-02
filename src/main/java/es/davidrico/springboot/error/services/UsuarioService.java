package es.davidrico.springboot.error.services;

import java.util.List;
import java.util.Optional;

import es.davidrico.springboot.error.models.domain.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listar();
	
	public Usuario obtenerPorId(Integer id);
	
	public Optional<Usuario> obtenerPorIdOptional(Integer id);

}
