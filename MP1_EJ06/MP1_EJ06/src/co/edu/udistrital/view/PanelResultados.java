package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JTextArea txtCampoResultados;
	
	public PanelResultados() {
		setLayout(new BorderLayout());
		setBackground(Color.ORANGE);
		setBorder(new TitledBorder("Panel de Resultados"));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		txtCampoResultados = new JTextArea();
		txtCampoResultados.setEditable(false);
		
		JScrollPane pScroll = new JScrollPane(
				txtCampoResultados, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		add(pScroll, BorderLayout.CENTER);
		
	}

	public JTextArea getTxtCampoResultados() {
		return txtCampoResultados;
	}

	public void setTxtCampoResultados(JTextArea txtCampoResultados) {
		this.txtCampoResultados = txtCampoResultados;
	}

}
