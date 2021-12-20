package servicios;

import java.util.List;

import modelo.Producto;
import modelo.Usuario;
import persistenciaGeneral.DAOFactory;

public class ItinerarioServicio {

	public List<Producto> find(Usuario usuario) {
		int usuarioId = usuario.getId();
		List<Producto> productos = DAOFactory.getItinerarioDAO().findByNombre(usuarioId);
		/*if(productos != null) {
			for(Producto comprasRealizadas:productos ) {
				usuario.itinerario.add(comprasRealizadas);	
			}	
		}		*/
		return usuario.itinerario;
	} 
}
