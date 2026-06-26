package controller;

import model.Notificacion;
import view.VistaNotificacion;

public class ControladorNotificacion {
    private Notificacion notificacion;
    private VistaNotificacion vista;

    public ControladorNotificacion(Notificacion notificacion, VistaNotificacion vista) {
        this.notificacion = notificacion;
        this.vista = vista;
    }

    public void enviarMensaje(String mensaje) {
        vista.mostrar("Notificación urgente");
        notificacion.notificar(mensaje);
    }
}
