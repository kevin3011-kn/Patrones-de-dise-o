package Ejemplo;

//Ejemplo 3 - Comandos en cajero automático

interface Comando {
 void ejecutar();
}

class Cajero {
 public void retirarDinero() {
     System.out.println("💸 Retiro realizado");
 }

 public void depositarDinero() {
     System.out.println("💰 Depósito realizado");
 }
}

class RetirarComando implements Comando {
 private Cajero cajero;

 public RetirarComando(Cajero cajero) {
     this.cajero = cajero;
 }

 public void ejecutar() {
     cajero.retirarDinero();
 }
}

class DepositarComando implements Comando {
 private Cajero cajero;

 public DepositarComando(Cajero cajero) {
     this.cajero = cajero;
 }

 public void ejecutar() {
     cajero.depositarDinero();
 }
}

//Vista
class VistaCajero {
 public void mostrar(String mensaje) {
     System.out.println("Operación: " + mensaje);
 }
}

//Controlador
class ControladorCajero {
 private Comando retirar;
 private Comando depositar;
 private VistaCajero vista;

 public ControladorCajero(Comando retirar, Comando depositar, VistaCajero vista) {
     this.retirar = retirar;
     this.depositar = depositar;
     this.vista = vista;
 }

 public void ejecutarRetiro() {
     vista.mostrar("Retiro");
     retirar.ejecutar();
 }

 public void ejecutarDeposito() {
     vista.mostrar("Depósito");
     depositar.ejecutar();
 }
}

public class CommandEjemplo3 {
 public static void main(String[] args) {
     Cajero cajero = new Cajero();
     VistaCajero vista = new VistaCajero();
     ControladorCajero controlador = new ControladorCajero(
         new RetirarComando(cajero),
         new DepositarComando(cajero),
         vista
     );

     controlador.ejecutarRetiro();
     controlador.ejecutarDeposito();
 }
}

