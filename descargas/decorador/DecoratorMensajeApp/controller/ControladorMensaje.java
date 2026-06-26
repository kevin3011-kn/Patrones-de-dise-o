package controller;

import model.Mensaje;
import view.VistaMensaje;

public class ControladorMensaje {
    private Mensaje mensaje;
    private VistaMensaje vista;

    public ControladorMensaje(Mensaje mensaje, VistaMensaje vista) {
        this.mensaje = mensaje;
        this.vista = vista;
    }

    public void mostrarMensaje() {
        vista.mostrar(mensaje.obtenerTexto());
    }
}