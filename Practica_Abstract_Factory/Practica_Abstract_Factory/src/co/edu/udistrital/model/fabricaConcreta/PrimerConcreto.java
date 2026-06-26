package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.PrimerPeriodo;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioNotas;

public class PrimerConcreto implements ServicioFactory {

	@Override
	public ServicioNotas crearNota() {
		return new PrimerPeriodo();
	}
	
}
