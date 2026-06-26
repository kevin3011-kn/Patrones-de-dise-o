package controller;

import model.Forma;
import view.VistaForma;

public class ControladorForma {
    private Forma forma;
    private VistaForma vista;

    public ControladorForma(Forma forma, VistaForma vista) {
        this.forma = forma;
        this.vista = vista;
    }

    public void mostrarForma() {
        vista.mostrar();
        forma.dibujar();
    }
}
