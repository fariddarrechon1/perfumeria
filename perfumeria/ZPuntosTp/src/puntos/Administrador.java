package puntos;

//import java.util.Iterator;


public class Administrador extends Usuario {

	public Administrador(String nombre, String apellido, String email, String password, Integer id) {
		super(nombre, apellido, email, password, id);
	}

	// public Boolean agregarUsuario(Cliente usuario) {
	//
	// Perfumeria perfumeria = null;
	// Perfumeria clientes = null;
	// Boolean usuarioAgregado=false;
	//
	// for(Cliente usuarios : perfumeria.getListaUsuarios()) {
	//
	// clientes.agregarUsuario(usuario);
	//
	// if(perfumeria.getListaUsuarios().contains(usuario)) {
	//
	// usuarioAgregado=true;
	//
	// }
	//
	//
	// }
	//
	// return usuarioAgregado;
	//
	// }

//	public Boolean eliminarUsuario(Integer id) {
//
//		Boolean eliminado = false;
//		Perfumeria perfumeria = null;
//
//		Iterator<Cliente> it = perfumeria.getListaUsuarios().iterator();
//
//		while (it.hasNext()) {
//
//			Cliente u = it.next();
//			if (u.getId().equals(id)) {
//				it.remove();
//				eliminado = true;
//			}
//
//		}
//
//		return eliminado;
//
//	}

}
