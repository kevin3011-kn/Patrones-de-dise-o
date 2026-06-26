package co.edu.udistrital.controller;

//Ejemplo 3 - Iterador de tareas pendientes

import java.util.*;

class Tarea {
 private String descripcion;

 public Tarea(String descripcion) {
     this.descripcion = descripcion;
 }

 public String getDescripcion() {
     return descripcion;
 }
}

class ListaTareas {
 private List<Tarea> tareas = new ArrayList<>();

 public void agregarTarea(Tarea tarea) {
     tareas.add(tarea);
 }

 public Iterator<Tarea> crearIterador() {
     return tareas.iterator();
 }
}

//Vista
class VistaTareas {
 public void mostrar(String desc) {
     System.out.println("📝 " + desc);
 }
}

//Controlador
class ControladorTareas {
 private ListaTareas lista;
 private VistaTareas vista;

 public ControladorTareas(ListaTareas lista, VistaTareas vista) {
     this.lista = lista;
     this.vista = vista;
 }

 public void mostrarTodas() {
     Iterator<Tarea> it = lista.crearIterador();
     while (it.hasNext()) {
         vista.mostrar(it.next().getDescripcion());
     }
 }
}

public class IteratorEjemplo3 {
 public static void main(String[] args) {
     ListaTareas lista = new ListaTareas();
     lista.agregarTarea(new Tarea("Hacer la cama"));
     lista.agregarTarea(new Tarea("Estudiar patrones de diseño"));
     lista.agregarTarea(new Tarea("Preparar café"));

     VistaTareas vista = new VistaTareas();
     ControladorTareas controlador = new ControladorTareas(lista, vista);
     controlador.mostrarTodas();
 }
}
