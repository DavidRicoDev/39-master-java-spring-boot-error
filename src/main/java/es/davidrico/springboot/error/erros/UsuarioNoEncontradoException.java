package es.davidrico.springboot.error.erros;

public class UsuarioNoEncontradoException extends RuntimeException {

	public UsuarioNoEncontradoException(String id) {
		super("Uusario con ID: ".concat(id.concat(" no existe en el sistema")));

	}

	private static final long serialVersionUID = 1L;
	
	

}
