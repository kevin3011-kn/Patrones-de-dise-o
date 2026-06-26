package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.SegundoPeriodo;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioNotas;


public class SegundoConcreto implements ServicioFactory {

	@Override
	public ServicioNotas crearNota() {
		return new SegundoPeriodo();
	}
	
}
