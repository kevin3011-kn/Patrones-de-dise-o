package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Triangulo;

public class Equilatero extends Triangulo {

	public Equilatero(int a, int b, int c) {
		super(a, b, c);
	}

	@Override
	public String describir() {
		return "....... EQUILATERO......";
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
