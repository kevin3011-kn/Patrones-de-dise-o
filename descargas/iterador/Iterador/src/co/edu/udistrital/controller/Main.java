package co.edu.udistrital.controller;

import co.edu.udistrital.model.NombreModel;
import co.edu.udistrital.view.NombreView;

public class Main {
	
    public static void main(String[] args) {
        NombreModel modelo = new NombreModel();
        NombreView vista = new NombreView();
        NombreController controlador = new NombreController(modelo, vista);
        controlador.iniciar();
    }

}
