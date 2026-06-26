package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Triangulo;

public class Escaleno extends Triangulo {

	public Escaleno(int a, int b, int c) {
		super(a, b, c);
	}

	@Override
	public String describir() {
		return "....... ESCALENO......";
	}

	@Override
	public String calcularSuperficie() {
		int x;
		String res;
		x = (lado_1 * lado_2) / 2;
		res = Integer.toString(x);
		return res;
	}
}
