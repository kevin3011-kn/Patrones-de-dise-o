package controller;

import model.MenuComponente;
import view.VistaMenu;

public class ControladorMenu {
    private MenuComponente menu;
    private VistaMenu vista;

    public ControladorMenu(MenuComponente menu, VistaMenu vista) {
        this.menu = menu;
        this.vista = vista;
    }

    public void mostrarMenu() {
        vista.mostrarInicio();
        menu.mostrar();
    }
}