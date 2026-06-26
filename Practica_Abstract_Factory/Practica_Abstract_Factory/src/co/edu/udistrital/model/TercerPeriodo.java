package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioNotas;

public class TercerPeriodo implements ServicioNotas {

	@Override
	public String validarNotaQuiz() {
		return "La nota del quiz del tercer periodo es valida";
	}

	@Override
	public String validarNotaTrabajo() {
		return "La nota del trabajo del tercer periodo es valida";
	}

	@Override
	public String validarNotaParcial() {
		return "La nota del parcial del tercer periodo es valida";
	}
}
