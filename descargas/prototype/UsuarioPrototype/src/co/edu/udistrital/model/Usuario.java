package co.edu.udistrital.model;

public class Usuario implements Prototype {
	private String nombre;
	private String rol;

	public Usuario(String nombre, String rol) {
		this.nombre = nombre;
		this.rol = rol;
	}

	public Usuario(Usuario original) {
		this.nombre = original.nombre;
		this.rol = original.rol;
	}

	@Override
	public Prototype clone() {
		return new Usuario(this);
	}

	public String getNombre() {
		return nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
