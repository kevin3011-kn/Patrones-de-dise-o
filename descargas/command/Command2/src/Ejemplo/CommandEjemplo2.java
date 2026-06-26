package Ejemplo;

//Ejemplo 2 - Editor de texto con comandos

interface Comando {
 void ejecutar();
}

class Documento {
 public void copiar() {
     System.out.println("📋 Copiar contenido");
 }

 public void pegar() {
     System.out.println("📌 Pegar contenido");
 }
}

class CopiarComando implements Comando {
 private Documento doc;

 public CopiarComando(Documento doc) {
     this.doc = doc;
 }

 public void ejecutar() {
     doc.copiar();
 }
}

class PegarComando implements Comando {
 private Documento doc;

 public PegarComando(Documento doc) {
     this.doc = doc;
 }

 public void ejecutar() {
     doc.pegar();
 }
}

//Vista
class VistaEditor {
 public void mostrar(String accion) {
     System.out.println("Acción del editor: " + accion);
 }
}

//Controlador
class ControladorEditor {
 private Comando copiar;
 private Comando pegar;
 private VistaEditor vista;

 public ControladorEditor(Comando copiar, Comando pegar, VistaEditor vista) {
     this.copiar = copiar;
     this.pegar = pegar;
     this.vista = vista;
 }

 public void ejecutarCopiar() {
     vista.mostrar("Copiar");
     copiar.ejecutar();
 }

 public void ejecutarPegar() {
     vista.mostrar("Pegar");
     pegar.ejecutar();
 }
}

public class CommandEjemplo2 {
 public static void main(String[] args) {
     Documento doc = new Documento();
     VistaEditor vista = new VistaEditor();
     ControladorEditor controlador = new ControladorEditor(
         new CopiarComando(doc),
         new PegarComando(doc),
         vista
     );

     controlador.ejecutarCopiar();
     controlador.ejecutarPegar();
 }
}
