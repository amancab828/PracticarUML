package dominio;

public abstract class Persona {
	protected int id;
	protected String nombre;
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
