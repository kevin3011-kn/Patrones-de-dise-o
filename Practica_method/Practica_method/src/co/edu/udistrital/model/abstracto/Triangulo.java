package co.edu.udistrital.model.abstracto;

public abstract class Triangulo {

	protected int lado_1;
	protected int lado_2;
	protected int lado_3;

	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.lado_1 = ladoA;
		this.lado_2 = ladoB;
		this.lado_3 = ladoC;
	}

	public abstract String describir();

	public abstract String calcularSuperficie();

}
