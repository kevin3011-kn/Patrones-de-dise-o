package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel{

	private JButton btnIngresar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private JButton btnVerTodos;
	private JButton btnBuscar;
	
	public PanelOperaciones() {
		setLayout(new GridLayout(11, 1, 5, 5));
		setPreferredSize(new Dimension(200, 50));
		setBackground(Color.CYAN);
		setBorder(new TitledBorder("Panel de Operaciones"));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		JLabel lblBlanco = new JLabel();
		add(lblBlanco);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setActionCommand("INGRESAR");
		add(btnIngresar);
		
		lblBlanco = new JLabel();
		add(lblBlanco);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setActionCommand("BUSCAR");
		add(btnBuscar);
		
		lblBlanco = new JLabel();
		add(lblBlanco);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand("ACTUALIZAR");
		add(btnActualizar);
		
		lblBlanco = new JLabel();
		add(lblBlanco);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setActionCommand("ELIMINAR");
		add(btnEliminar);
		
		lblBlanco = new JLabel();
		add(lblBlanco);
		
		btnVerTodos = new JButton("Ver Lista");
		btnVerTodos.setActionCommand("VERTODOS");
		add(btnVerTodos);
		
		lblBlanco = new JLabel();
		add(lblBlanco);
		
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnVerTodos() {
		return btnVerTodos;
	}

	public void setBtnVerTodos(JButton btnVerTodos) {
		this.btnVerTodos = btnVerTodos;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}
	
}
