package model;

public class NotificacionUrgente extends Notificacion {
    public NotificacionUrgente(Enviador enviador) {
        super(enviador);
    }

    public void notificar(String mensaje) {
        enviador.enviar("[URGENTE] " + mensaje);
    }
}
