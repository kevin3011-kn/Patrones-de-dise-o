package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioNotas;

public class SegundoPeriodo implements ServicioNotas {

	@Override
	public String validarNotaQuiz() {
		return "La nota del quiz del segundo periodo es valida";
	}

	@Override
	public String validarNotaTrabajo() {
		return "La nota del trabajo del segundo periodo es valida";
	}

	@Override
	public String validarNotaParcial() {
		return "La nota del parcial del segundo periodo es valida";
	}
}
