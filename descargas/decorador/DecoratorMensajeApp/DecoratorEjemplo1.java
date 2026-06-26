import model.*;
import view.VistaMensaje;
import controller.ControladorMensaje;

public class DecoratorEjemplo1 {
    public static void main(String[] args) {
        Mensaje mensaje = new MensajeBasico();
        mensaje = new NegritaDecorator(new CursivaDecorator(mensaje));

        VistaMensaje vista = new VistaMensaje();
        ControladorMensaje controlador = new ControladorMensaje(mensaje, vista);
        controlador.mostrarMensaje();
    }
}