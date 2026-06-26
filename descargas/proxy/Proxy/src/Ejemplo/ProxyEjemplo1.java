package Ejemplo;

//Ejemplo 1 - Acceso a documento con protección

interface Documento {
 void mostrar();
}

class DocumentoReal implements Documento {
 private String nombre;

 public DocumentoReal(String nombre) {
     this.nombre = nombre;
     cargarDesdeDisco();
 }

 private void cargarDesdeDisco() {
     System.out.println("Cargando documento: " + nombre);
 }

 public void mostrar() {
     System.out.println("Mostrando documento: " + nombre);
 }
}

//Proxy
class DocumentoProxy implements Documento {
 private DocumentoReal documentoReal;
 private String nombre;

 public DocumentoProxy(String nombre) {
     this.nombre = nombre;
 }

 public void mostrar() {
     if (documentoReal == null) {
         documentoReal = new DocumentoReal(nombre);
     }
     documentoReal.mostrar();
 }
}

//Vista
class VistaDocumento {
 public void mensaje(String msg) {
     System.out.println(msg);
 }
}

//Controlador
class ControladorDocumento {
 private Documento documento;
 private VistaDocumento vista;

 public ControladorDocumento(Documento documento, VistaDocumento vista) {
     this.documento = documento;
     this.vista = vista;
 }

 public void abrir() {
     vista.mensaje("Accediendo al documento...");
     documento.mostrar();
 }
}

public class ProxyEjemplo1 {
 public static void main(String[] args) {
     Documento doc = new DocumentoProxy("informe.pdf");
     VistaDocumento vista = new VistaDocumento();
     ControladorDocumento controlador = new ControladorDocumento(doc, vista);
     controlador.abrir();
     controlador.abrir(); // Segunda vez, no se carga desde disco
 }
}

