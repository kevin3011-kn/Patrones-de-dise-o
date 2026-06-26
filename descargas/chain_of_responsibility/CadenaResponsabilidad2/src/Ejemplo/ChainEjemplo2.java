package Ejemplo;

//Ejemplo 2 - Aprobación de presupuestos

abstract class Aprobador {
 protected Aprobador siguiente;

 public void setSiguiente(Aprobador siguiente) {
     this.siguiente = siguiente;
 }

 public abstract void aprobar(int monto);
}

class Supervisor extends Aprobador {
 public void aprobar(int monto) {
     if (monto <= 1000) {
         System.out.println("Supervisor aprobó $" + monto);
     } else if (siguiente != null) {
         siguiente.aprobar(monto);
     }
 }
}

class Gerente extends Aprobador {
 public void aprobar(int monto) {
     if (monto <= 5000) {
         System.out.println("Gerente aprobó $" + monto);
     } else {
         System.out.println("Monto muy alto. Escalada a dirección.");
     }
 }
}

//Vista
class VistaAprobacion {
 public void mensaje(String m) {
     System.out.println("Solicitud: " + m);
 }
}

//Controlador
class ControladorPresupuesto {
 private Aprobador aprobador;
 private VistaAprobacion vista;

 public ControladorPresupuesto(Aprobador aprobador, VistaAprobacion vista) {
     this.aprobador = aprobador;
     this.vista = vista;
 }

 public void procesar(int monto) {
     vista.mensaje("Presupuesto por $" + monto);
     aprobador.aprobar(monto);
 }
}

public class ChainEjemplo2 {
 public static void main(String[] args) {
     Aprobador supervisor = new Supervisor();
     Aprobador gerente = new Gerente();
     supervisor.setSiguiente(gerente);

     VistaAprobacion vista = new VistaAprobacion();
     ControladorPresupuesto controlador = new ControladorPresupuesto(supervisor, vista);

     controlador.procesar(500);
     controlador.procesar(3000);
     controlador.procesar(8000);
 }
}
