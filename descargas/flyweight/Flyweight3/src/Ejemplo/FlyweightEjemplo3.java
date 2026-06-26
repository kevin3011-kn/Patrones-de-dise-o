package Ejemplo;

//Ejemplo 3 - Figuras compartidas en aplicación de dibujo

import java.util.*;

interface Figura {
 void dibujar(int x, int y);
}

class Circulo implements Figura {
 private String color;

 public Circulo(String color) {
     this.color = color;
 }

 public void dibujar(int x, int y) {
     System.out.println("Dibujando círculo " + color + " en (" + x + "," + y + ")");
 }
}

//Flyweight Factory
class FabricaFiguras {
 private static final Map<String, Figura> circulos = new HashMap<>();

 public static Figura obtenerCirculo(String color) {
     circulos.putIfAbsent(color, new Circulo(color));
     return circulos.get(color);
 }
}

//Vista
class VistaLienzo {
 public void mostrarInicio() {
     System.out.println("Iniciando lienzo de dibujo...");
 }
}

//Controlador
class ControladorDibujo {
 private VistaLienzo vista;

 public ControladorDibujo(VistaLienzo vista) {
     this.vista = vista;
 }

 public void dibujar() {
     vista.mostrarInicio();
     Figura rojo = FabricaFiguras.obtenerCirculo("Rojo");
     rojo.dibujar(10, 10);
     rojo.dibujar(20, 30);

     Figura azul = FabricaFiguras.obtenerCirculo("Azul");
     azul.dibujar(5, 15);
 }
}

public class FlyweightEjemplo3 {
 public static void main(String[] args) {
     VistaLienzo vista = new VistaLienzo();
     ControladorDibujo controlador = new ControladorDibujo(vista);
     controlador.dibujar();
 }
}

