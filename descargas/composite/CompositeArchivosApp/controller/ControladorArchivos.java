package controller;

import model.ArchivoComponente;
import view.VistaExplorador;

public class ControladorArchivos {
    private ArchivoComponente raiz;
    private VistaExplorador vista;

    public ControladorArchivos(ArchivoComponente raiz, VistaExplorador vista) {
        this.raiz = raiz;
        this.vista = vista;
    }

    public void mostrarEstructura() {
        vista.mostrarInicio();
        raiz.mostrar();
    }
}