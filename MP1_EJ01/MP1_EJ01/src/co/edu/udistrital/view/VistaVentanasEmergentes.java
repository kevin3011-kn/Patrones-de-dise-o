package co.edu.udistrital.view;

import javax.swing.JOptionPane;

public class VistaVentanasEmergentes {

		
	public VistaVentanasEmergentes() {
		
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje);
	}
	
	public double leerDatoReal(String mensaje) {
		String aux =JOptionPane.showInputDialog(mensaje);
		double dato =  Double.parseDouble(aux);
		return dato;
	}
}
