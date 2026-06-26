package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import co.edu.udistrital.model.Producto;

public class PanelEmpleado extends JPanel{
	
	private JButton comprar;
    private JButton salir;
    private JButton atras;
    private JButton cargar;
    
    
    private JLabel Lportada;
    
   
    private JTable Descripcion;
    private DefaultTableModel tableModel;
    
    private JComboBox<String> opcionesAdicionales;

   
    
   
    
    
    Font fuente = new Font ("Arial",Font.BOLD,12);
Font fuente1 = new Font ("Broadway",Font.BOLD,18);
    
public PanelEmpleado() {
	
	setLayout(null);
	setBackground(Color.WHITE);
	setBorder(new TitledBorder("Estado de la factura"));
	inicializarComponentes();
	setVisible(false);
}

public void inicializarComponentes(){
            
            
            
            tableModel = new DefaultTableModel();
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Precio");
            tableModel.addColumn("Cantidad");
            tableModel.addColumn("Costo Produccion");
            tableModel.addColumn("Costo venta");
            

            Descripcion = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(Descripcion);
            scrollPane.setBounds(400, 150, 540, 280);
            add(scrollPane);
            
           

            salir = new JButton("SALIR");
            salir.setBounds(150, 350, 190, 70);
            salir.setForeground(Color.black);
            salir.setBackground(Color.red);
            salir.setBorder(null);
            salir.setActionCommand("SALIR1");
            add(salir);
            
            atras = new JButton("ATRAS");
            atras.setBounds(150, 250, 190, 70);
            atras.setForeground(Color.black);
            atras.setBackground(Color.red);
            atras.setBorder(null);
            atras.setActionCommand("ATRAS1");
            add(atras);
            
    
            
            comprar = new JButton("COMPRAR");
            comprar.setBounds(550, 500, 190, 70);
            comprar.setForeground(Color.black);
            comprar.setBackground(Color.red);
            comprar.setBorder(null);
            comprar.setActionCommand("COMPRAR");
            add(comprar);
            
            cargar = new JButton("CARGAR");
            cargar.setBounds(150, 150, 190, 70);
            cargar.setForeground(Color.black);
            cargar.setBackground(Color.red);
            cargar.setBorder(null);
            cargar.setActionCommand("CARGAR");
            add(cargar);
            
            opcionesAdicionales = new JComboBox<>();
            opcionesAdicionales.addItem("Ninguno");
            opcionesAdicionales.addItem("Queso");
            opcionesAdicionales.addItem("Chispas de chocolate");
            opcionesAdicionales.setBounds(550, 450, 200, 30);
            add(opcionesAdicionales);
            
            ImageIcon portada = new ImageIcon ("src\\imagenes\\portada2.jpg");
            ImageIcon logo = new ImageIcon(portada.getImage().getScaledInstance(1200,700,Image.SCALE_AREA_AVERAGING)); 
            Lportada = new JLabel(logo);
            Lportada.setBounds(0,0,1200,700);
            add(Lportada);
	
            
}

public void cargarTabla(ArrayList<Producto> productos) {
    DefaultTableModel modelo = (DefaultTableModel) Descripcion.getModel();
    modelo.setRowCount(0); 

    for(Producto p : productos) {
        modelo.addRow(new Object[]{p.getNombre(), p.getPrecio(), p.getCantidad()});
    }
}

public JButton getComprar() {
	return comprar;
}

public void setComprar(JButton comprar) {
	this.comprar = comprar;
}

public JButton getSalir() {
	return salir;
}

public void setSalir(JButton salir) {
	this.salir = salir;
}

public JButton getAtras() {
	return atras;
}

public void setAtras(JButton atras) {
	this.atras = atras;
}

public JButton getCargar() {
	return cargar;
}

public void setCargar(JButton cargar) {
	this.cargar = cargar;
}

public JLabel getLportada() {
	return Lportada;
}

public void setLportada(JLabel lportada) {
	Lportada = lportada;
}

public JTable getDescripcion() {
	return Descripcion;
}

public void setDescripcion(JTable descripcion) {
	Descripcion = descripcion;
}

public DefaultTableModel getTableModel() {
	return tableModel;
}

public void setTableModel(DefaultTableModel tableModel) {
	this.tableModel = tableModel;
}

public JComboBox<String> getOpcionesAdicionales() {
	return opcionesAdicionales;
}

public void setOpcionesAdicionales(JComboBox<String> opcionesAdicionales) {
	this.opcionesAdicionales = opcionesAdicionales;
}





}
