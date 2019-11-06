package puntos;

import puntos.Cliente;
import puntos.Productos;

public class Venta {
	private Cliente cliente;
	private Productos producto; 
	private Integer IdVenta;
	
	public Venta(Cliente cliente, Productos producto, Integer idVenta) {
		this.cliente = cliente;
		this.producto = producto;
		this.IdVenta = idVenta;
	}

	public Venta(Integer puntos, Double precio, Integer punto,String id,String descripcion, Integer IdVenta) {
		this.cliente=new Cliente(puntos);
		this.producto=new Productos(precio,punto,id,descripcion,estado);
		this.IdVenta=IdVenta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public Integer getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(Integer idVenta) {
		IdVenta = idVenta;
	}
}
