package co.edu.udistrital.controller;

import co.edu.udistrital.model.Iterator;
import co.edu.udistrital.model.NombreModel;
import co.edu.udistrital.view.NombreView;

public class NombreController {
	
	private NombreModel modelo;
    private NombreView vista;

    public NombreController(NombreModel modelo, NombreView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        String entrada;
        while (!(entrada = vista.pedirNombre()).equalsIgnoreCase("fin")) {
            modelo.agregarNombre(entrada);
        }

        int tipo = vista.pedirTipoIterador();
        Iterator iterador;

        if (tipo == 2) {
            iterador = modelo.getIteradorInverso();
            vista.mostrarMensaje("\n--- Nombres (Inverso) ---");
        } else {
            iterador = modelo.getIteradorNormal();
            vista.mostrarMensaje("\n--- Nombres (Normal) ---");
        }

        while (iterador.hasMore()) {
            vista.mostrarNombre(iterador.getNext());
        }
    }

}
