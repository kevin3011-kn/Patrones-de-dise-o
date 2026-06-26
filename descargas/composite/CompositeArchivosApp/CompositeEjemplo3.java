import controller.ControladorArchivos;
import model.Archivo;
import model.Carpeta;
import model.ArchivoComponente;
import view.VistaExplorador;

public class CompositeEjemplo3 {
    public static void main(String[] args) {
        Carpeta documentos = new Carpeta("Documentos");
        documentos.agregar(new Archivo("CV.pdf"));
        documentos.agregar(new Archivo("Reporte.docx"));

        Carpeta proyectos = new Carpeta("Proyectos");
        proyectos.agregar(new Archivo("Plan.java"));

        documentos.agregar(proyectos);

        VistaExplorador vista = new VistaExplorador();
        ControladorArchivos controlador = new ControladorArchivos(documentos, vista);
        controlador.mostrarEstructura();
    }
}