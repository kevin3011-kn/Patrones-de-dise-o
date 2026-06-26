package Ejemplo;

//Ejemplo 3 - Filtro de correos (Spam)

abstract class FiltroCorreo {
 protected FiltroCorreo siguiente;

 public void setSiguiente(FiltroCorreo siguiente) {
     this.siguiente = siguiente;
 }

 public abstract void procesar(String mensaje);
}

class FiltroSpam extends FiltroCorreo {
 public void procesar(String mensaje) {
     if (mensaje.contains("gratis")) {
         System.out.println("Correo marcado como SPAM: " + mensaje);
     } else if (siguiente != null) {
         siguiente.procesar(mensaje);
     }
 }
}

class FiltroNormal extends FiltroCorreo {
 public void procesar(String mensaje) {
     System.out.println("Correo entregado: " + mensaje);
 }
}

//Vista
class VistaCorreo {
 public void mostrar(String mensaje) {
     System.out.println("Procesando correo: " + mensaje);
 }
}

//Controlador
class ControladorCorreo {
 private FiltroCorreo filtro;
 private VistaCorreo vista;

 public ControladorCorreo(FiltroCorreo filtro, VistaCorreo vista) {
     this.filtro = filtro;
     this.vista = vista;
 }

 public void procesarMensaje(String mensaje) {
     vista.mostrar(mensaje);
     filtro.procesar(mensaje);
 }
}

public class ChainEjemplo3 {
 public static void main(String[] args) {
     FiltroCorreo spam = new FiltroSpam();
     FiltroCorreo normal = new FiltroNormal();
     spam.setSiguiente(normal);

     VistaCorreo vista = new VistaCorreo();
     ControladorCorreo controlador = new ControladorCorreo(spam, vista);

     controlador.procesarMensaje("gana dinero gratis");
     controlador.procesarMensaje("reunión a las 3 PM");
 }
}
