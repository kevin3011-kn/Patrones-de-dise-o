package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.TercerPeriodo;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioNotas;

public class TercerConcreto implements ServicioFactory{
    
    @Override
    public ServicioNotas crearNota(){
      return new  TercerPeriodo();
      
    }
    
}
