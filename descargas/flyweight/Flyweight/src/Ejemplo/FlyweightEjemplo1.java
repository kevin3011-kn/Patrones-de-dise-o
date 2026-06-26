package Ejemplo;

//Ejemplo 1 - Árboles en un bosque compartiendo datos

import java.util.*;

class TipoArbol {
 private String tipo;
 private String textura;

 public TipoArbol(String tipo, String textura) {
     this.tipo = tipo;
     this.textura = textura;
 }

 public void mostrar(int x, int y) {
     System.out.println("Árbol tipo " + tipo + " con textura " + textura + " en (" + x + "," + y + ")");
 }
}

//Flyweight Factory
class FabricaArboles {
 private static final Map<String, TipoArbol> tipos = new HashMap<>();

 public static TipoArbol obtenerTipo(String tipo, String textura) {
     String clave = tipo + "-" + textura;
     if (!tipos.containsKey(clave)) {
         tipos.put(clave, new TipoArbol(tipo, textura));
     }
     return tipos.get(clave);
 }
}

//Vista
class VistaBosque {
 public void mostrarInicio() {
     System.out.println("Mostrando árboles en el bosque...");
 }
}

//Controlador
class ControladorBosque {
 private VistaBosque vista;

 public ControladorBosque(VistaBosque vista) {
     this.vista = vista;
 }

 public void plantar() {
     vista.mostrarInicio();
     TipoArbol pino = FabricaArboles.obtenerTipo("Pino", "Verde");
     pino.mostrar(10, 20);
     pino.mostrar(30, 40);

     TipoArbol roble = FabricaArboles.obtenerTipo("Roble", "Marrón");
     roble.mostrar(50, 60);
 }
}

public class FlyweightEjemplo1 {
 public static void main(String[] args) {
     VistaBosque vista = new VistaBosque();
     ControladorBosque controlador = new ControladorBosque(vista);
     controlador.plantar();
 }
}

