package Ejemplo;

//Ejemplo 2 - Imagen con carga diferida (Lazy Loading)

interface Imagen {
 void mostrar();
}

class ImagenReal implements Imagen {
 private String archivo;

 public ImagenReal(String archivo) {
     this.archivo = archivo;
     cargar();
 }

 private void cargar() {
     System.out.println("Cargando imagen desde disco: " + archivo);
 }

 public void mostrar() {
     System.out.println("Mostrando imagen: " + archivo);
 }
}

//Proxy
class ImagenProxy implements Imagen {
 private String archivo;
 private ImagenReal imagenReal;

 public ImagenProxy(String archivo) {
     this.archivo = archivo;
 }

 public void mostrar() {
     if (imagenReal == null) {
         imagenReal = new ImagenReal(archivo);
     }
     imagenReal.mostrar();
 }
}

//Vista
class VistaGaleria {
 public void mensaje(String msg) {
     System.out.println(msg);
 }
}

//Controlador
class ControladorGaleria {
 private Imagen imagen;
 private VistaGaleria vista;

 public ControladorGaleria(Imagen imagen, VistaGaleria vista) {
     this.imagen = imagen;
     this.vista = vista;
 }

 public void verImagen() {
     vista.mensaje("Abriendo imagen...");
     imagen.mostrar();
 }
}

public class ProxyEjemplo2 {
 public static void main(String[] args) {
     Imagen imagen = new ImagenProxy("foto_vacaciones.jpg");
     VistaGaleria vista = new VistaGaleria();
     ControladorGaleria controlador = new ControladorGaleria(imagen, vista);
     controlador.verImagen();
     controlador.verImagen(); // No vuelve a cargar
 }
}
