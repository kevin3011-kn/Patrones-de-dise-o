package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelOperaciones pOperaciones;
	private PanelResultados pResultados;
	private PanelIngresar pIngreso;
	
	public VentanaPrincipal() {
		setTitle("Ejemplo GUI");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.red);
		getContentPane().setLayout(new BorderLayout(10, 10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		pOperaciones = new PanelOperaciones();
		getContentPane().add(pOperaciones, BorderLayout.WEST);
		
		pResultados = new PanelResultados();
		getContentPane().add(pResultados, BorderLayout.CENTER);
		
		pIngreso = new PanelIngresar();
	}

	public PanelOperaciones getpOperaciones() {
		return pOperaciones;
	}

	public void setpOperaciones(PanelOperaciones pOperaciones) {
		this.pOperaciones = pOperaciones;
	}

	public PanelResultados getpResultados() {
		return pResultados;
	}

	public void setpResultados(PanelResultados pResultados) {
		this.pResultados = pResultados;
	}

	public PanelIngresar getpIngreso() {
		return pIngreso;
	}

	public void setpIngreso(PanelIngresar pIngreso) {
		this.pIngreso = pIngreso;
	}
	
}
