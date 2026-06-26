package co.edu.udistrital.view;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelPrincipal extends JPanel {
    
    
        private JButton Administrador;
        private JButton salir;
        private JButton Empleado;
       
        
        private JLabel Nombre;
        private JLabel Descripcion;
        private JLabel Lportada;
        
        Font fuente = new Font ("Broadway",Font.BOLD,32);
        Font fuente1 = new Font ("Broadway",Font.BOLD,18);
        
    public PanelPrincipal() {
		
		setLayout(null);
		setBackground(Color.WHITE);
		setBorder(new TitledBorder("Modulo Principal"));
		inicializarComponentes();
		setVisible(true);
	}
	
    public void inicializarComponentes(){
        
        Nombre = new JLabel("La embajada del pan y las galletas");
		Nombre.setBounds(300, 150, 800, 30);
		Nombre.setForeground(Color.blue);
		Nombre.setFont(fuente);
		add(Nombre);
		
		Descripcion = new JLabel("¡¡¡LLEVA LOS PRODUCTOS QUE DESEES AL MEJOR PRECIO !!!");
		Descripcion.setBounds(300, 180, 1500, 30);
		Descripcion.setForeground(Color.black);
                Descripcion.setFont(fuente1);
		add(Descripcion);
        
      
		
		Administrador = new JButton("PANEL ADMINISTRADOR");
		Administrador.setBounds(300, 300, 190, 70);
		Administrador.setForeground(Color.black);
		Administrador.setBackground(Color.red);
		Administrador.setBorder(null);
		Administrador.setActionCommand("ADMIN");
		add(Administrador);
		
		salir = new JButton("SALIR");
		salir.setBounds(700, 300, 190, 70);
		salir.setForeground(Color.black);
		salir.setBackground(Color.red);
		salir.setBorder(null);
		salir.setActionCommand("SALIR");
		add(salir);
                
               
                
        Empleado = new JButton("PANEL EMPLEADO");
        Empleado.setBounds(500, 300, 190, 70);
        Empleado.setForeground(Color.black);
        Empleado.setBackground(Color.red);
        Empleado.setBorder(null);
        Empleado.setActionCommand("EMPLEADO");
		add(Empleado);
                
       
                
        ImageIcon portada = new ImageIcon ("src\\imagenes\\portada2.jpg");
		ImageIcon logo = new ImageIcon(portada.getImage().getScaledInstance(1200,700,Image.SCALE_AREA_AVERAGING)); 
		Lportada = new JLabel(logo);
		Lportada.setBounds(0,0,1200,700);
		add(Lportada);
		
                
    }

	public JButton getAdministrador() {
		return Administrador;
	}

	public void setAdministrador(JButton administrador) {
		Administrador = administrador;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	public JButton getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(JButton empleado) {
		Empleado = empleado;
	}



	public JLabel getNombre() {
		return Nombre;
	}

	public void setNombre(JLabel nombre) {
		Nombre = nombre;
	}

	public JLabel getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(JLabel descripcion) {
		Descripcion = descripcion;
	}

	public JLabel getLportada() {
		return Lportada;
	}

	public void setLportada(JLabel lportada) {
		Lportada = lportada;
	}

	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

	public Font getFuente1() {
		return fuente1;
	}

	public void setFuente1(Font fuente1) {
		this.fuente1 = fuente1;
	}

    
    
	
    
}
