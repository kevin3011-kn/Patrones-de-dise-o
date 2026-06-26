package co.edu.udistrital.model;

public class Cilindro {

	private double radio;
	private double altura;
	private double volumen;
	
	public Cilindro() {
		this.radio = 0.0;
		this.altura = 0.0;
		this.volumen = 0.0;
	}
	
	public void calcularVolumen() {
		volumen = (Math.PI*Math.pow(radio, 2)*altura);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + ", volumen=" + volumen + "]";
	}
	
}
