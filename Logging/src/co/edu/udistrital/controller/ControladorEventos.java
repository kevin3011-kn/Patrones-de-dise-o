package co.edu.udistrital.controller;




import co.edu.udistrital.model.RegistroEventos;

import co.edu.udistrital.view.VistaConsola;

import co.edu.udistrital.view.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControladorEventos implements ActionListener {

    private RegistroEventos modelo;
    private VistaPrincipal vista;

    public ControladorEventos(RegistroEventos modelo,VistaPrincipal vista) {
    	
      this.modelo = modelo;
        this.vista = vista;
        asignarOyentes();
        
    }
public void asignarOyentes() {
    	
    	vista.getPp().getBotonAgregar().addActionListener(this);
    	vista.getPp().getBotonMostrar().addActionListener(this);
    	vista.getPp().getBotonLimpiar().addActionListener(this);
        
}

public void actionPerformed(ActionEvent e) {
	
	String comando = e.getActionCommand();
	
	 if(comando.equals("AGREGAR")) {
		 
		  String evento = vista.getPp().getCampoEvento().getText().trim();
          if (!evento.isEmpty()) {
              modelo.agregarEvento(evento);
              vista.getPp().getCampoEvento().setText("");
              vista.getPp().mostrarMensaje("Evento agregado.");
          } else {
              vista.getPp().mostrarMensaje("El campo de evento está vacío.");
          }
		 

	 }
	 
	 if(comando.equals("MOSTRAR")) {
		 
		  List<String> eventos = modelo.getEventos();
          vista.getPp().getAreaEventos().setText(""); 
          if (eventos.isEmpty()) {
              vista.getPp().getAreaEventos().setText("No hay eventos registrados.");
          } else {
              for (int i = 0; i < eventos.size(); i++) {
                  vista.getPp().getAreaEventos().append((i + 1) + ". " + eventos.get(i) + "\n");
              }
          }
		 

	 }
	 if(comando.equals("LIMPIAR")) {
		 
		 modelo.limpiarEventos();
         vista.getPp().getAreaEventos().setText("");
         vista.getPp().mostrarMensaje("Eventos eliminados.");
	 

	 }

}
}