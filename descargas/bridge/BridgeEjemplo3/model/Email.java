package model;

public class Email implements Enviador {
    public void enviar(String mensaje) {
        System.out.println("Enviando por Email: " + mensaje);
    }
}
