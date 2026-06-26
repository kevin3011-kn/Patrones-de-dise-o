package co.edu.udistrital.controller;

//Ejemplo 1 - Recorrido de lista de nombres

import java.util.*;

class ColeccionNombres {
 private List<String> nombres = new ArrayList<>();

 public void agregar(String nombre) {
     nombres.add(nombre);
 }

 public Iterator<String> getIterator() {
     return nombres.iterator();
 }
}

//Vista
class VistaNombres {
 public void mostrar(String nombre) {
     System.out.println("Nombre: " + nombre);
 }
}

//Controlador
class ControladorNombres {
 private ColeccionNombres coleccion;
 private VistaNombres vista;

 public ControladorNombres(ColeccionNombres coleccion, VistaNombres vista) {
     this.coleccion = coleccion;
     this.vista = vista;
 }

 public void mostrarTodos() {
     Iterator<String> it = coleccion.getIterator();
     while (it.hasNext()) {
         vista.mostrar(it.next());
     }
 }
}

public class IteratorEjemplo1 {
 public static void main(String[] args) {
     ColeccionNombres coleccion = new ColeccionNombres();
     coleccion.agregar("Ana");
     coleccion.agregar("Luis");
     coleccion.agregar("Carlos");

     VistaNombres vista = new VistaNombres();
     ControladorNombres controlador = new ControladorNombres(coleccion, vista);
     controlador.mostrarTodos();
 }
}
