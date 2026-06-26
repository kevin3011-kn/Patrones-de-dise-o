package co.edu.udistrital.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.udistrital.model.Veterinaria;
import co.edu.udistrital.model.persistence.MascotaDTO;
import co.edu.udistrital.view.VentanaPrincipal;
import co.edu.udistrital.view.VistaConsola;

public class Controller implements ActionListener{

	private VentanaPrincipal ventana;
	private Veterinaria veterinaria;
	
	public Controller() {
		ventana = new VentanaPrincipal();
		veterinaria = new Veterinaria();
		veterinaria.actualizarBD();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana.getpOperaciones().getBtnActualizar().addActionListener(this);
		ventana.getpOperaciones().getBtnIngresar().addActionListener(this);
		ventana.getpOperaciones().getBtnEliminar().addActionListener(this);
		ventana.getpOperaciones().getBtnBuscar().addActionListener(this);
		ventana.getpOperaciones().getBtnVerTodos().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("VERTODOS")) {
			ventana.getpResultados().getTxtCampoResultados().setText(veterinaria.obtenerListaClientes());
		}else if(comando.equals("INGRESAR")) {
			ventana.getContentPane().remove(ventana.getpResultados());
			ventana.getContentPane().add(ventana.getpIngreso(), BorderLayout.CENTER);
			ventana.getpIngreso().setVisible(true);
			ventana.repaint();
		}
		
	}
	
}
