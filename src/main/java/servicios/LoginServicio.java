package servicios;

import modelo.UsuarioNulo;
import modelo.Usuario;
import persistencia.UsuarioDAO;
import persistenciaGeneral.DAOFactory;

public class LoginServicio {

	public Usuario login(String nombre, String password) {
		UsuarioDAO usuarioDao = DAOFactory.getUsuarioDAO();
		Usuario usuario = usuarioDao.findByNombre(nombre);

    	if (usuario.isNull() || !usuario.checkPassword(password)) {
    		usuario = UsuarioNulo.build();
    	}
    	return usuario;
	}
}
