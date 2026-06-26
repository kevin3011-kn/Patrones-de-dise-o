package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioNotas;

public class PrimerPeriodo implements ServicioNotas{
    
    @Override
    public String validarNotaQuiz(){
       return "La nota del quiz del primer periodo es valida";
    }
    @Override
    public String validarNotaTrabajo(){
    	return "La nota del trabajo del primer periodo es valida";
    }
    
    @Override
    public String validarNotaParcial(){
    	return "La nota del parcial del primer periodo es valida";
    }
    
}
