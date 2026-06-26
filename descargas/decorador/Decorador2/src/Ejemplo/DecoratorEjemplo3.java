package Ejemplo;

//Ejemplo 3 - Archivos con compresión y encriptación

interface Archivo {
 void guardar(String contenido);
}

class ArchivoTexto implements Archivo {
 public void guardar(String contenido) {
     System.out.println("Guardando archivo: " + contenido);
 }
}

abstract class ArchivoDecorator implements Archivo {
 protected Archivo archivo;

 public ArchivoDecorator(Archivo archivo) {
     this.archivo = archivo;
 }
}

class CompresorDecorator extends ArchivoDecorator {
 public CompresorDecorator(Archivo archivo) {
     super(archivo);
 }

 public void guardar(String contenido) {
     contenido = "ZIP(" + contenido + ")";
     archivo.guardar(contenido);
 }
}

class EncriptadorDecorator extends ArchivoDecorator {
 public EncriptadorDecorator(Archivo archivo) {
     super(archivo);
 }

 public void guardar(String contenido) {
     contenido = "ENC(" + contenido + ")";
     archivo.guardar(contenido);
 }
}

//Vista
class VistaArchivo {
 public void mostrarProceso(String mensaje) {
     System.out.println("Proceso: " + mensaje);
 }
}

//Controlador
class ControladorArchivo {
 private Archivo archivo;
 private VistaArchivo vista;

 public ControladorArchivo(Archivo archivo, VistaArchivo vista) {
     this.archivo = archivo;
     this.vista = vista;
 }

 public void guardarContenido(String contenido) {
     vista.mostrarProceso("Guardando con decoradores...");
     archivo.guardar(contenido);
 }
}

public class DecoratorEjemplo3 {
 public static void main(String[] args) {
     Archivo archivo = new ArchivoTexto();
     archivo = new EncriptadorDecorator(new CompresorDecorator(archivo));

     VistaArchivo vista = new VistaArchivo();
     ControladorArchivo controlador = new ControladorArchivo(archivo, vista);
     controlador.guardarContenido("DatosImportantes");
 }
}
