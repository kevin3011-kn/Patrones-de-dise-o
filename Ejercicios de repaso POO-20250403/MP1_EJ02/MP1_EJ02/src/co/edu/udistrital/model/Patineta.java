package co.edu.udistrital.model;

public class Patineta implements MedioTransporte{

	private int precio;
	private String marca;
	
	public Patineta() {
		precio = 0;
		marca = "";
	}

	public Patineta(int precio, String marca) {
		super();
		this.precio = precio;
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Patineta [precio=" + precio + ", marca=" + marca + "]";
	}

	@Override
	public String frenar() {
		return "Voy en patineta, ahora sí me morí!!!";
	}

	@Override
	public String acelerar() {
		return "Tranqui, que llego rapido!!!";
	}
	
	
}
