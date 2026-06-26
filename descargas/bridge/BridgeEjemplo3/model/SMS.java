package model;

public class SMS implements Enviador {
    public void enviar(String mensaje) {
        System.out.println("Enviando por SMS: " + mensaje);
    }
}
