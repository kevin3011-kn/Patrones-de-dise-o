package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Triangulo;
import co.edu.udistrital.model.abstracto.TrianguloFactory;

public class TrianguloCreador implements TrianguloFactory {

	@Override
	public Triangulo crearTriangulo(int ladoA, int ladoB, int ladoc) {
		if ((ladoA == ladoB) && (ladoA == ladoc)) {
			return new Equilatero(ladoA, ladoB, ladoc);
		} else if ((ladoA != ladoB) && (ladoA != ladoc) && (ladoB != ladoc)) {
			return new Escaleno(ladoA, ladoB, ladoc);
		} else {
			return new Isosceles(ladoA, ladoB, ladoc);
		}
	}

}
