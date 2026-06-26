package Ejemplo;

//Ejemplo 2 - Caracteres compartidos en editor de texto

import java.util.*;

class Caracter {
 private char simbolo;

 public Caracter(char simbolo) {
     this.simbolo = simbolo;
 }

 public void imprimir(int pos) {
     System.out.println("Carácter '" + simbolo + "' en posición " + pos);
 }
}

//Flyweight Factory
class FabricaCaracteres {
 private static final Map<Character, Caracter> caracteres = new HashMap<>();

 public static Caracter obtener(char c) {
     caracteres.putIfAbsent(c, new Caracter(c));
     return caracteres.get(c);
 }
}

//Vista
class VistaEditor {
 public void mostrarInicio() {
     System.out.println("Mostrando texto del editor...");
 }
}

//Controlador
class ControladorEditor {
 private VistaEditor vista;

 public ControladorEditor(VistaEditor vista) {
     this.vista = vista;
 }

 public void escribirTexto(String texto) {
     vista.mostrarInicio();
     for (int i = 0; i < texto.length(); i++) {
         Caracter c = FabricaCaracteres.obtener(texto.charAt(i));
         c.imprimir(i);
     }
 }
}

public class FlyweightEjemplo2 {
 public static void main(String[] args) {
     VistaEditor vista = new VistaEditor();
     ControladorEditor controlador = new ControladorEditor(vista);
     controlador.escribirTexto("hola");
 }
}
