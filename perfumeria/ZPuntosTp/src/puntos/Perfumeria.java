package puntos;
import java.util.Iterator;
import java.util.LinkedList;

import puntos.Productos;
import puntos.Cliente;
import puntos.Administrador;
import puntos.Venta;

public class Perfumeria {

	private String nombre;
	private Administrador administrador;
	private LinkedList<Cliente> listaUsuarios = new LinkedList<Cliente>();
	private LinkedList<Venta> listaVentas = new LinkedList<Venta>();
	private LinkedList<Productos> listaProducto = new LinkedList<Productos>();
	private Boolean sesionAbierta;

	public Perfumeria(String nombre, Administrador administrador) {
		this.nombre = nombre;
		this.administrador = administrador;
		this.sesionAbierta = false;
	}

	public Perfumeria(String nombre, Administrador administrador, String nombreAd, String apellido, String email,
			String password, Integer id) {
		this.nombre = nombre;
		this.administrador = new Administrador(nombreAd, apellido, email, password, id);
		this.sesionAbierta = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Cliente> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(LinkedList<Cliente> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public LinkedList<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(LinkedList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public LinkedList<Productos> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(LinkedList<Productos> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public Boolean agregarUsuario(Cliente usuario) {

		return listaUsuarios.add(usuario);

	}

	public Boolean agregarProducto(Productos producto) {

		return listaProducto.add(producto);

	}

	public Boolean agregarVenta(Venta venta) {

		return listaVentas.add(venta);

	}

	public Boolean loguearUsuario(String email, String password) {

		for (Cliente lista : listaUsuarios) {

			if (lista.getEmail().equals(email) && lista.getPassword().equals(password)) {

				sesionAbierta = true;

			} else {
				sesionAbierta = false;
			}
		}

		return sesionAbierta;

	}

	public void cerrarSesion() {

		if (this.sesionAbierta = true) {
			this.sesionAbierta = false;
		}
	}

	 public Boolean eliminarUsuario(String nombreUsuario) {
	
	 Boolean eliminado = false;
	
	 Iterator<Cliente> it = listaUsuarios.iterator();
	
	 while (it.hasNext()) {
	
	 Cliente u = it.next();
	 if (u.getNombre().equals(nombreUsuario)) {
	 it.remove();
	 eliminado = true;
	 }
	
	 }
	
	 return eliminado;
	
	 }