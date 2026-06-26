package model;

public class NegritaDecorator extends MensajeDecorator {
    public NegritaDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    public String obtenerTexto() {
        return "<b>" + mensaje.obtenerTexto() + "</b>";
    }
}