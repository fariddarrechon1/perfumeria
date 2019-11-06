package puntos;

public class Productos{

	private Double precio;
	private Integer punto;
	private String id;
	private String descripcion;
	private Boolean estado;
	
	public Productos(Double precio , Integer punto , String id , String descripcion) {
		
		this.precio=precio;
		this.punto=punto;
		this.id=id;
		this.descripcion=descripcion;
		this.estado=false;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getPunto() {
		return punto;
	}

	public void setPunto(Integer punto) {
		this.punto = punto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	
	
}
