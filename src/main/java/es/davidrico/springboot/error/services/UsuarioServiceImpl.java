package es.davidrico.springboot.error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.davidrico.springboot.error.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "David", "Rico"));
		this.lista.add(new Usuario(2, "Miguel", "Vazquez"));
		this.lista.add(new Usuario(3, "Manuel", "Perez"));
		this.lista.add(new Usuario(4, "Chani", "Merino"));
		this.lista.add(new Usuario(5, "Miguel", "Marquez"));
		this.lista.add(new Usuario(6, "Juana", "Perez"));
		this.lista.add(new Usuario(7, "Josefa", "Mojedas"));
	}

	@Override
	public List<Usuario> listar() {

		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		
		Usuario resultado = null;
		
		for(Usuario u : this.lista) {
			if(u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		
		Usuario usuario =  this.obtenerPorId(id);
		
		return Optional.ofNullable(usuario);
	}
}
