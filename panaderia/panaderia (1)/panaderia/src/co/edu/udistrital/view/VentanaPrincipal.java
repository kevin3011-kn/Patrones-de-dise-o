package co.edu.udistrital.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelPrincipal pp;
    private PanelAdministrador pa;
    private PanelEmpleado pe ;
  
    
    
    public VentanaPrincipal() {
		setTitle("Cafeteria");
		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(253, 119, 253));
		getContentPane().setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoproyecto.png")).getImage());
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);	
		setVisible(true);
	}
    
    public void inicializarComponentes(){
        
                pp = new PanelPrincipal();
                pp.setBounds(0,0,1200,700);
                getContentPane().add(pp);
               
                pa = new PanelAdministrador();
                pa.setBounds(0,0,1200,700);
                getContentPane().add(pa);
               
                pe = new PanelEmpleado();
                pe.setBounds(0,0,1200,700);
                getContentPane().add(pe);
                
               
                
               
        
        
    }

    public PanelPrincipal getPp() {
        return pp;
    }

    public void setPp(PanelPrincipal pp) {
        this.pp = pp;
    }

	public PanelAdministrador getPa() {
		return pa;
	}

	public void setPa(PanelAdministrador pa) {
		this.pa = pa;
	}

	
	public PanelEmpleado getPe() {
		return pe;
	}

	public void setPe(PanelEmpleado pe) {
		this.pe = pe;
	}

   
    
    
    
    
    
    
}


