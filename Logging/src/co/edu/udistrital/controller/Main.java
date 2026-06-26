package co.edu.udistrital.controller;

import java.lang.ModuleLayer.Controller;

import co.edu.udistrital.model.RegistroEventos;

import co.edu.udistrital.view.VistaPrincipal;

public class Main {
    public static void main(String[] args) {
    	
        RegistroEventos modelo = RegistroEventos.getInstancia();
        VistaPrincipal vista = new VistaPrincipal();
        new ControladorEventos(modelo, vista);
    }
}
