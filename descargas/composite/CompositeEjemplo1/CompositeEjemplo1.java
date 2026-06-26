import controller.ControladorOrganizacion;
import model.ComponenteEmpleado;
import model.Empleado;
import model.Gerente;
import view.VistaOrganizacion;

public class CompositeEjemplo1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura");
        gerente.agregar(new Empleado("Carlos"));
        gerente.agregar(new Empleado("Ana"));

        VistaOrganizacion vista = new VistaOrganizacion();
        ControladorOrganizacion controlador = new ControladorOrganizacion(gerente, vista);
        controlador.mostrarEstructura();
    }
}
