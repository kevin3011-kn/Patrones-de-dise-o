package Ejemplo;

//Ejemplo 1 - Sistema de inicio de computadora (Facade)

class CPU {
 void iniciar() { System.out.println("CPU iniciada"); }
}

class Memoria {
 void cargar() { System.out.println("Memoria cargada"); }
}

class Disco {
 void leer() { System.out.println("Leyendo desde disco"); }
}

//Fachada
class ComputadoraFacade {
 private CPU cpu;
 private Memoria memoria;
 private Disco disco;

 public ComputadoraFacade() {
     cpu = new CPU();
     memoria = new Memoria();
     disco = new Disco();
 }

 public void iniciarComputadora() {
     cpu.iniciar();
     memoria.cargar();
     disco.leer();
 }
}

//Vista
class VistaComputadora {
 public void mostrar() {
     System.out.println("Iniciando sistema...");
 }
}

//Controlador
class ControladorComputadora {
 private ComputadoraFacade computadora;
 private VistaComputadora vista;

 public ControladorComputadora(ComputadoraFacade computadora, VistaComputadora vista) {
     this.computadora = computadora;
     this.vista = vista;
 }

 public void iniciar() {
     vista.mostrar();
     computadora.iniciarComputadora();
 }
}

public class FacadeEjemplo1 {
 public static void main(String[] args) {
     ComputadoraFacade computadora = new ComputadoraFacade();
     VistaComputadora vista = new VistaComputadora();
     ControladorComputadora controlador = new ControladorComputadora(computadora, vista);
     controlador.iniciar();
 }
}
