package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VistaPrincipal extends JFrame{
	
	
	private PanelPrincipal pp;
	
	 public VistaPrincipal() {
		 
		 	setTitle("LOGGIN - Registro de eventos");
			setSize(450, 350);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(new Color(253, 119, 253));
			getContentPane().setLayout(null);
			 //setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoproyecto.png")).getImage());
			
			inicializarComponentes();
			
			setResizable(true);
			setLocationRelativeTo(null);	
			setVisible(true);
	    }
	 
	private void inicializarComponentes() {
		
		
          pp = new PanelPrincipal();
          pp.setBounds(0,0,450,300);
          getContentPane().add(pp);    
	     	
		
	}

	public PanelPrincipal getPp() {
		return pp;
	}

	public void setPp(PanelPrincipal pp) {
		this.pp = pp;
	}


	
	
	

	

}
