package Ejemplo;

//Ejemplo 3 - Pedido en restaurante (Facade)

class Cocina {
 void prepararPlato() { System.out.println("Plato preparado"); }
}

class Mesero {
 void tomarOrden() { System.out.println("Orden tomada por mesero"); }
}

class Cajero {
 void cobrar() { System.out.println("Pago realizado"); }
}

//Fachada
class ServicioRestaurante {
 private Cocina cocina;
 private Mesero mesero;
 private Cajero cajero;

 public ServicioRestaurante() {
     cocina = new Cocina();
     mesero = new Mesero();
     cajero = new Cajero();
 }

 public void atenderCliente() {
     mesero.tomarOrden();
     cocina.prepararPlato();
     cajero.cobrar();
 }
}

//Vista
class VistaRestaurante {
 public void mostrar() {
     System.out.println("Cliente llegó al restaurante...");
 }
}

//Controlador
class ControladorRestaurante {
 private ServicioRestaurante servicio;
 private VistaRestaurante vista;

 public ControladorRestaurante(ServicioRestaurante servicio, VistaRestaurante vista) {
     this.servicio = servicio;
     this.vista = vista;
 }

 public void atender() {
     vista.mostrar();
     servicio.atenderCliente();
 }
}

public class FacadeEjemplo3 {
 public static void main(String[] args) {
     ServicioRestaurante servicio = new ServicioRestaurante();
     VistaRestaurante vista = new VistaRestaurante();
     ControladorRestaurante controlador = new ControladorRestaurante(servicio, vista);
     controlador.atender();
 }
}

