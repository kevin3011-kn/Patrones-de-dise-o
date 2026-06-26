package Ejemplo;

//Ejemplo 2 - Cine en casa (Facade)

class Proyector {
 void encender() { System.out.println("Proyector encendido"); }
}

class ReproductorDVD {
 void reproducir() { System.out.println("Reproduciendo película"); }
}

class Luces {
 void apagar() { System.out.println("Luces apagadas"); }
}

//Fachada
class CineEnCasa {
 private Proyector proyector;
 private ReproductorDVD dvd;
 private Luces luces;

 public CineEnCasa() {
     proyector = new Proyector();
     dvd = new ReproductorDVD();
     luces = new Luces();
 }

 public void verPelicula() {
     luces.apagar();
     proyector.encender();
     dvd.reproducir();
 }
}

//Vista
class VistaCine {
 public void mostrar() {
     System.out.println("Preparando cine en casa...");
 }
}

//Controlador
class ControladorCine {
 private CineEnCasa cine;
 private VistaCine vista;

 public ControladorCine(CineEnCasa cine, VistaCine vista) {
     this.cine = cine;
     this.vista = vista;
 }

 public void reproducirPelicula() {
     vista.mostrar();
     cine.verPelicula();
 }
}

public class FacadeEjemplo2 {
 public static void main(String[] args) {
     CineEnCasa cine = new CineEnCasa();
     VistaCine vista = new VistaCine();
     ControladorCine controlador = new ControladorCine(cine, vista);
     controlador.reproducirPelicula();
 }
}

