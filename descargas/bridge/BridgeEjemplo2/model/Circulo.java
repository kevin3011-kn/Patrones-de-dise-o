package model;

public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }

    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + color.usarColor());
    }
}
