package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelIngresar extends JPanel{

	private JButton btnRegistrar;
	private JButton btnCancelar;
	private JLabel lblNombre;
	private JLabel lblTipo;
	private JLabel lblEdad;
	private JTextField txtNombre;
	private JTextField txtTipo;
	private JTextField txtEdad;
	
	public PanelIngresar() {
		setLayout(new GridLayout(4, 2, 5, 5));
		setBackground(Color.ORANGE);
		setBorder(new TitledBorder("Panel de Ingreso"));
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		lblNombre = new JLabel("Nombre:");
		add(lblNombre);
		
		txtNombre = new JTextField();
		add(txtNombre);
		
		lblTipo = new JLabel("Tipo:");
		add(lblTipo);
		
		txtTipo = new JTextField();
		add(txtTipo);
		
		lblEdad = new JLabel("Edad:");
		add(lblEdad);
		
		txtEdad = new JTextField();
		add(txtEdad);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar .setActionCommand("CANCELAR");
		add(btnCancelar );
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setActionCommand("REGISTRAR");
		add(btnRegistrar);
		
		
		
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblTipo() {
		return lblTipo;
	}

	public void setLblTipo(JLabel lblTipo) {
		this.lblTipo = lblTipo;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	
}
