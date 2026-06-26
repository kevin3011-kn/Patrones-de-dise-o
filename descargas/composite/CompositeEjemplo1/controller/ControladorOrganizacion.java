package controller;

import model.ComponenteEmpleado;
import view.VistaOrganizacion;

public class ControladorOrganizacion {
    private ComponenteEmpleado raiz;
    private VistaOrganizacion vista;

    public ControladorOrganizacion(ComponenteEmpleado raiz, VistaOrganizacion vista) {
        this.raiz = raiz;
        this.vista = vista;
    }

    public void mostrarEstructura() {
        vista.mostrar();
        raiz.mostrarDetalles();
    }
}
