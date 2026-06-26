import controller.ControladorMenu;
import model.MenuComponente;
import model.MenuGrupo;
import model.MenuItem;
import view.VistaMenu;

public class CompositeEjemplo2 {
    public static void main(String[] args) {
        MenuGrupo menuPrincipal = new MenuGrupo("Archivo");
        menuPrincipal.agregar(new MenuItem("Nuevo"));
        menuPrincipal.agregar(new MenuItem("Abrir"));

        MenuGrupo submenu = new MenuGrupo("Exportar");
        submenu.agregar(new MenuItem("PDF"));
        submenu.agregar(new MenuItem("Excel"));

        menuPrincipal.agregar(submenu);

        VistaMenu vista = new VistaMenu();
        ControladorMenu controlador = new ControladorMenu(menuPrincipal, vista);
        controlador.mostrarMenu();
    }
}