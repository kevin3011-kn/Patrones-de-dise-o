package Ejemplo;

//Ejemplo 1 - Soporte técnico escalado

abstract class ManejadorSoporte {
 protected ManejadorSoporte siguiente;

 public void setSiguiente(ManejadorSoporte siguiente) {
     this.siguiente = siguiente;
 }

 public abstract void manejar(String problema);
}

class NivelBasico extends ManejadorSoporte {
 public void manejar(String problema) {
     if (problema.equals("contraseña")) {
         System.out.println("Soporte Básico resolvió: " + problema);
     } else if (siguiente != null) {
         siguiente.manejar(problema);
     }
 }
}

class NivelAvanzado extends ManejadorSoporte {
 public void manejar(String problema) {
     System.out.println("Soporte Avanzado resolvió: " + problema);
 }
}

//Vista
class VistaSoporte {
 public void mostrarMensaje(String mensaje) {
     System.out.println("Problema recibido: " + mensaje);
 }
}

//Controlador
class ControladorSoporte {
 private ManejadorSoporte manejador;
 private VistaSoporte vista;

 public ControladorSoporte(ManejadorSoporte manejador, VistaSoporte vista) {
     this.manejador = manejador;
     this.vista = vista;
 }

 public void procesarProblema(String problema) {
     vista.mostrarMensaje(problema);
     manejador.manejar(problema);
 }
}

public class ChainEjemplo1 {
 public static void main(String[] args) {
     ManejadorSoporte basico = new NivelBasico();
     ManejadorSoporte avanzado = new NivelAvanzado();
     basico.setSiguiente(avanzado);

     VistaSoporte vista = new VistaSoporte();
     ControladorSoporte controlador = new ControladorSoporte(basico, vista);
     controlador.procesarProblema("contraseña");
     controlador.procesarProblema("problema grave");
 }
}

