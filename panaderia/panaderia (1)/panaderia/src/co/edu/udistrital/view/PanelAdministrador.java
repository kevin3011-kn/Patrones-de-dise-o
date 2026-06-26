package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import co.edu.udistrital.model.Producto;

public class PanelAdministrador extends JPanel {
	

	
	    
			private JButton agregar;
	        private JButton salir;
	        private JButton atras;
	        private JButton eliminar;
	        private JButton editar;
	        private JButton actualizar;
	        private JTextArea Resultados;
	        private JTextField nombre;
	        private JTextField precio;
	        private JTextField cantidad;
	        private JTextField costoProduccion;
	        private JTextField costoVenta;
	        private JTable Descripcion;
	        private DefaultTableModel tableModel;
	        private JLabel Lportada;
	        private JLabel nombre1;
	        private JLabel precio1;
	        private JLabel cantidad1;
	        private JLabel costoProduccion1;
	        private JLabel costoVenta1;
	        
	        
	        Font fuente = new Font ("Arial",Font.BOLD,12);
		Font fuente1 = new Font ("Broadway",Font.BOLD,18);
	        
	    public PanelAdministrador() {
			
			setLayout(null);
			setBackground(Color.WHITE);
			setBorder(new TitledBorder("Estado de la factura"));
			inicializarComponentes();
			setVisible(false);
		}
		
	    public void inicializarComponentes(){
	        
	        nombre1 = new JLabel("Nombre: ");
	        nombre1.setBounds(100, 190, 100, 30);
	        nombre1.setForeground(Color.blue);
	        nombre1.setFont(fuente);
			add(nombre1);
			
			precio1 = new JLabel("Precio: ");
			precio1.setBounds(100, 260,100, 30);
			precio1.setForeground(Color.black);
			precio1.setFont(fuente);
			add(precio1);
	                
	        cantidad1 = new JLabel("Cantidad: ");
	        cantidad1.setBounds(100, 330,100, 30);
	        cantidad1.setForeground(Color.black);
	        cantidad1.setFont(fuente);
			add(cantidad1);
	                
	        costoProduccion1 = new JLabel("Costo Produccion: ");
	        costoProduccion1.setBounds(100, 400,110, 30);
	        costoProduccion1.setForeground(Color.black);
	        costoProduccion1.setFont(fuente);
			add(costoProduccion1);
	                
	        costoVenta1 = new JLabel("Costo Venta: ");
	        costoVenta1.setBounds(100, 470 ,100, 30);
	        costoVenta1.setForeground(Color.black);
	        costoVenta1.setFont(fuente);
			add(costoVenta1);
	        
	                
	                
	                nombre= new JTextField();
	                nombre.setBounds(210, 190, 100, 30);
	                nombre.setEditable(true);
	                add(nombre);
	                
	                precio = new JTextField();
	                precio.setBounds(210, 260, 100, 30);
	                precio.setEditable(true);
	                add(precio);
	                
	                cantidad = new JTextField();
	                cantidad.setBounds(210, 330, 100, 30);
	                cantidad.setEditable(true);
	                add(cantidad);
	                
	                costoProduccion = new JTextField();
	                costoProduccion.setBounds(210, 400, 100, 30);
	                costoProduccion.setEditable(true);
	                add(costoProduccion);
	                
	                costoVenta = new JTextField();
	                costoVenta.setBounds(210, 470, 100, 30);
	                costoVenta.setEditable(true);
	                add(costoVenta);
	                
	                
	                
	                tableModel = new DefaultTableModel();
	                tableModel.addColumn("Nombre");
	                tableModel.addColumn("Precio");
	                tableModel.addColumn("Cantidad");
	                tableModel.addColumn("Costo Produccion");
	                tableModel.addColumn("Costo venta");
	                

	                Descripcion = new JTable(tableModel);
	                JScrollPane scrollPane = new JScrollPane(Descripcion);
	                scrollPane.setBounds(400, 250, 540, 280);
	                add(scrollPane);
	                
	                
	                
	        agregar = new JButton("AGREGAR");
			agregar.setBounds(400, 70, 190, 70);
			agregar.setForeground(Color.black);
			agregar.setBackground(Color.red);
			agregar.setBorder(null);
			agregar.setActionCommand("AGREGAR");
			add(agregar);

			salir = new JButton("SALIR");
			salir.setBounds(800, 70, 190, 70);
			salir.setForeground(Color.black);
			salir.setBackground(Color.red);
			salir.setBorder(null);
			salir.setActionCommand("SALIR2");
			add(salir);
	                
	         atras = new JButton("ATRAS");
			atras.setBounds(600, 70, 190, 70);
			atras.setForeground(Color.black);
			atras.setBackground(Color.red);
			atras.setBorder(null);
			atras.setActionCommand("ATRAS");
			add(atras);
	                
	                eliminar = new JButton("ELIMINAR");
			eliminar.setBounds(600, 150, 190, 70);
			eliminar.setForeground(Color.black);
			eliminar.setBackground(Color.red);
			eliminar.setBorder(null);
			eliminar.setActionCommand("ELIMINAR");
			add(eliminar);
	                
	                editar = new JButton("EDITAR");
			editar.setBounds(400, 150, 190, 70);
			editar.setForeground(Color.black);
			editar.setBackground(Color.red);
			editar.setBorder(null);
			editar.setActionCommand("EDITAR");
			add(editar);
	                
	                actualizar = new JButton("ACTUALIZAR");
			actualizar.setBounds(800, 150, 190, 70);
			actualizar.setForeground(Color.black);
			actualizar.setBackground(Color.red);
			actualizar.setBorder(null);
			actualizar.setActionCommand("ACTUALIZAR");
			add(actualizar);
	                
	                ImageIcon portada = new ImageIcon ("src\\imagenes\\portada2.jpg");
			ImageIcon logo = new ImageIcon(portada.getImage().getScaledInstance(1200,700,Image.SCALE_AREA_AVERAGING)); 
			Lportada = new JLabel(logo);
			Lportada.setBounds(0,0,1200,700);
			add(Lportada);
			
	                
	    }
	    
	    public void cargarTabla(ArrayList<Producto> productos) {
	        tableModel.setRowCount(0); // Limpia la tabla

	        for (Producto p : productos) {
	            Object[] fila = {
	                p.getNombre(),
	                p.getPrecio(),
	                p.getCantidad(),
	                p.getPrecioProduccion(),
	                p.getPrecioVenta()
	            };
	            tableModel.addRow(fila);
	        }
	    }

		public JButton getAgregar() {
			return agregar;
		}

		public void setAgregar(JButton agregar) {
			this.agregar = agregar;
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

		public JButton getEliminar() {
			return eliminar;
		}

		public void setEliminar(JButton eliminar) {
			this.eliminar = eliminar;
		}

		public JButton getEditar() {
			return editar;
		}

		public void setEditar(JButton editar) {
			this.editar = editar;
		}

		public JButton getActualizar() {
			return actualizar;
		}

		public void setActualizar(JButton actualizar) {
			this.actualizar = actualizar;
		}

		public JTextField getNombre() {
			return nombre;
		}

		public void setNombre(JTextField nombre) {
			this.nombre = nombre;
		}

		public JTextField getPrecio() {
			return precio;
		}

		public void setPrecio(JTextField precio) {
			this.precio = precio;
		}

		public JTextField getCantidad() {
			return cantidad;
		}

		public void setCantidad(JTextField cantidad) {
			this.cantidad = cantidad;
		}

		public JTextField getCostoProduccion() {
			return costoProduccion;
		}

		public void setCostoProduccion(JTextField costoProduccion) {
			this.costoProduccion = costoProduccion;
		}

		public JTextField getCostoVenta() {
			return costoVenta;
		}

		public void setCostoVenta(JTextField costoVenta) {
			this.costoVenta = costoVenta;
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

		public JLabel getLportada() {
			return Lportada;
		}

		public void setLportada(JLabel lportada) {
			Lportada = lportada;
		}

		public JLabel getNombre1() {
			return nombre1;
		}

		public void setNombre1(JLabel nombre1) {
			this.nombre1 = nombre1;
		}

		public JLabel getPrecio1() {
			return precio1;
		}

		public void setPrecio1(JLabel precio1) {
			this.precio1 = precio1;
		}

		public JLabel getCantidad1() {
			return cantidad1;
		}

		public void setCantidad1(JLabel cantidad1) {
			this.cantidad1 = cantidad1;
		}

		public JLabel getCostoProduccion1() {
			return costoProduccion1;
		}

		public void setCostoProduccion1(JLabel costoProduccion1) {
			this.costoProduccion1 = costoProduccion1;
		}

		public JLabel getCostoVenta1() {
			return costoVenta1;
		}

		public void setCostoVenta1(JLabel costoVenta1) {
			this.costoVenta1 = costoVenta1;
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
