package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaAbstracta.*;
import co.edu.udistrital.model.fabricaConcreta.PrimerConcreto;
import co.edu.udistrital.model.fabricaConcreta.SegundoConcreto;
import co.edu.udistrital.model.fabricaConcreta.TercerConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	int op = 0;
        do{
            op=menu();
            switch(op){
                case 1:
                    periodo(new PrimerConcreto());
                    break;
                case 2:
                    periodo(new SegundoConcreto());
                    break;
                case 3:
                    periodo(new TercerConcreto());
                    break;
                case 4:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
            vista.mostrarInformacion("");
        }while(op!=4);
    }
    
    public void periodo(ServicioFactory Notas){
        ServicioNotas servicio = Notas.crearNota();
        vista.mostrarInformacion(servicio.validarNotaParcial());  
        vista.mostrarInformacion(servicio.validarNotaQuiz());
        vista.mostrarInformacion(servicio.validarNotaTrabajo());
        
    }
    
    public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   Solicitar Notas Primer Perido. \n"
                + "2.   Solicitar Notas Segundo Perido. \n"
                + "3.   Solicitar Notas tercer periodo. \n"
                + "4.   Cerrar programa. \n\n"
                + "Seleccion opcion...";
        return vista.leerDatoEntero(menu2);
    }
    
}
