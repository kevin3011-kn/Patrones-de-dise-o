package co.edu.udistrital.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class PanelPrincipal extends JPanel {

    public JTextField campoEvento;
    public JButton botonAgregar;
    public JButton botonMostrar;
    public JButton botonLimpiar;
    public JTextArea areaEventos;

    public PanelPrincipal() {
       

    	setLayout(null);
		setBackground(Color.lightGray);
		setBorder(new TitledBorder("Modulo Principal"));
		inicializarComponentes();
		setVisible(true);
    }
    
    public void inicializarComponentes() {
    	
        
        campoEvento = new JTextField();
        campoEvento.setBounds(0, 0,350, 30);
        add(campoEvento);
        
        botonAgregar = new JButton("Agregar");
        botonAgregar.setBounds(350, 0, 100, 30);
        botonAgregar.setForeground(Color.black);
        botonAgregar.setBackground(Color.red);
        botonAgregar.setBorder(null);
        botonAgregar.setActionCommand("AGREGAR");
		add(botonAgregar);
        
   

        
        
        botonMostrar = new JButton("Mostrar");
        botonMostrar.setBounds(0, 250, 225, 50);
        botonMostrar.setForeground(Color.black);
        botonMostrar.setBackground(Color.red);
        botonMostrar.setBorder(null);
        botonMostrar.setActionCommand("MOSTRAR");
		add(botonMostrar);
        
        
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(225, 250, 225, 50);
        botonLimpiar.setForeground(Color.black);
        botonLimpiar.setBackground(Color.red);
        botonLimpiar.setBorder(null);
        botonLimpiar.setActionCommand("LIMPIAR");
		add(botonLimpiar);
       

    
        areaEventos = new JTextArea();
        areaEventos.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaEventos);
        areaEventos.setBounds(0, 30, 450,220);
        areaEventos.setForeground(Color.gray);
		add(areaEventos);
		

    
       
       
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

	public JTextField getCampoEvento() {
		return campoEvento;
	}

	public void setCampoEvento(JTextField campoEvento) {
		this.campoEvento = campoEvento;
	}

	public JButton getBotonAgregar() {
		return botonAgregar;
	}

	public void setBotonAgregar(JButton botonAgregar) {
		this.botonAgregar = botonAgregar;
	}

	public JButton getBotonMostrar() {
		return botonMostrar;
	}

	public void setBotonMostrar(JButton botonMostrar) {
		this.botonMostrar = botonMostrar;
	}

	public JButton getBotonLimpiar() {
		return botonLimpiar;
	}

	public void setBotonLimpiar(JButton botonLimpiar) {
		this.botonLimpiar = botonLimpiar;
	}

	public JTextArea getAreaEventos() {
		return areaEventos;
	}

	public void setAreaEventos(JTextArea areaEventos) {
		this.areaEventos = areaEventos;
	}
    
    
    
}