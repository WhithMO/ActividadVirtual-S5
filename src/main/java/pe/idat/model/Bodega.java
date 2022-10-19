package pe.idat.model;

public class Bodega {
	private int id;
	private String nombre;
	private String Direccion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public Bodega(int id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		Direccion = direccion;
	}
	
	public Bodega() {

	}
	
	
}
