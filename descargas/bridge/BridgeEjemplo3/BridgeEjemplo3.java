import controller.ControladorNotificacion;
import model.Email;
import model.Enviador;
import model.Notificacion;
import model.NotificacionUrgente;
import view.VistaNotificacion;

public class BridgeEjemplo3 {
    public static void main(String[] args) {
        Enviador email = new Email();
        Notificacion noti = new NotificacionUrgente(email);
        VistaNotificacion vista = new VistaNotificacion();
        ControladorNotificacion controlador = new ControladorNotificacion(noti, vista);

        controlador.enviarMensaje("¡Sistema caído!");
    }
}
