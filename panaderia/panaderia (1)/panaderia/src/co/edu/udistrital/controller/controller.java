package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import co.edu.udistrital.model.Panaderia;
import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.persistence.ArchivoCSV;
import co.edu.udistrital.model.persistence.MapHandler;
import co.edu.udistrital.model.persistence.ProductoDTO;
import co.edu.udistrital.view.VentanaPrincipal;
import co.edu.udistrital.view.VistaVentanasEmergentes;

public class controller implements ActionListener {
	

	private VentanaPrincipal ventana;
	private Panaderia panaderia;
	private VistaVentanasEmergentes vista;
	private ArchivoCSV archivoCSV;
	
	public controller () {
		
		ventana = new VentanaPrincipal();
		panaderia = new Panaderia();
		panaderia.actualizarBD();
		vista= new VistaVentanasEmergentes();
		archivoCSV = new ArchivoCSV();
		ventana.getPa().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
		//ventana.getPe().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
		asignarOyentes();
		
        }
	
        
    public void asignarOyentes() {
    	
    	ventana.getPp().getAdministrador().addActionListener(this);
        ventana.getPp().getEmpleado().addActionListener(this);
        ventana.getPp().getSalir().addActionListener(this);
        
        ventana.getPe().getComprar().addActionListener(this);
        ventana.getPe().getAtras().addActionListener(this);
        ventana.getPe().getSalir().addActionListener(this);
        ventana.getPe().getCargar().addActionListener(this);
        
        ventana.getPa().getAgregar().addActionListener(this);
        ventana.getPa().getSalir().addActionListener(this);
        ventana.getPa().getAtras().addActionListener(this);
        ventana.getPa().getEliminar().addActionListener(this);
        ventana.getPa().getEditar().addActionListener(this);
        ventana.getPa().getActualizar().addActionListener(this);
        
        
       
				
     }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		
		 if(comando.equals("ADMIN")) {
				
				ventana.getPp().setVisible(false);
				ventana.getPa().setVisible(true);
		}
		 if(comando.equals("EMPLEADO")) {
						
				ventana.getPp().setVisible(false);
				ventana.getPe().setVisible(true);
				
				//ventana.getPe().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
		}    
			    	    
		 if(comando.equals("SALIR")) {
					
			 System.exit(0);
		 }
		 
		 //------------------------------------------------------------------------------------------------------
		 if(comando.equals("CARGAR")) {
			 
			 panaderia.actualizarBD(); 
			 ventana.getPe().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
			 vista.mostrarInformacion("Datos cargados correctamente.");
				
				
		}
		 
		 if(comando.equals("COMPRAR")) {
			 
			 int filaSeleccionada = ventana.getPe().getDescripcion().getSelectedRow();

			 if (filaSeleccionada != -1) {
			     String nombre = ventana.getPe().getDescripcion().getValueAt(filaSeleccionada, 0).toString();
			     int cantidad = Integer.parseInt(ventana.getPe().getDescripcion().getValueAt(filaSeleccionada, 1).toString());

			     if (cantidad > 0) {
			         ProductoDTO buscarDTO = new ProductoDTO();
			         buscarDTO.setNombre(nombre);
			         Producto encontrado = panaderia.getPanaderiaDAO().find(MapHandler.convertirProductoDTOaProducto(buscarDTO));

			         ProductoDTO actualizado = MapHandler.convertirProductoaProductoDTO(encontrado);
			         actualizado.setCantidad(encontrado.getCantidad() - 1);

			         panaderia.actualizarProducto(buscarDTO, actualizado);

			         // 🔽 Aquí obtienes el adicional seleccionado del JComboBox
			         String adicional = ventana.getPe().getOpcionesAdicionales().getSelectedItem().toString(); 

			         // 🔽 Y lo pasas al método de escritura en el archivo CSV
			         archivoCSV.escribirCompra(MapHandler.convertirProductoDTOaProducto(actualizado), adicional);

			         vista.mostrarInformacion("Compra realizada con éxito.");
			         ventana.getPe().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());

			     } else {
			         vista.mostrarInformacion("Sin producto");
			     }
			 } else {
			     vista.mostrarInformacion("Seleccione un producto.");
			 }
				
		}
		 
		 if(comando.equals("ATRAS1")) {
				
				ventana.getPe().setVisible(false);
				ventana.getPp().setVisible(true);
		}
		 
		 if(comando.equals("SALIR1")) {
				
				System.exit(0);
		}
		 
		 //-------------------------------------------------------------------------------------------------------
		 
		 if(comando.equals("AGREGAR")) {
			 
			 String nombre = "";
			 int precio = 0;
			 int cantidad =0;
			 int costoProduccion = 0;
			 int costoVenta =0;
			 
			 nombre = ventana.getPa().getNombre().getText();
			 precio = Integer.parseInt(ventana.getPa().getPrecio().getText());
			 cantidad = Integer.parseInt(ventana.getPa().getCantidad().getText());
			 costoProduccion = Integer.parseInt(ventana.getPa().getCostoProduccion().getText());
			 costoVenta = Integer.parseInt(ventana.getPa().getCostoVenta().getText());
				
			 ProductoDTO x = new ProductoDTO();
				x.setNombre(nombre);
				x.setPrecio(precio);
				x.setCantidad(cantidad);
				x.setPrecioProduccion(costoProduccion);
				x.setPrecioVenta(costoVenta);
				
				if(panaderia.adicionarProducto(x)) {
					vista.mostrarInformacion("Se ingreso con exito el registro :)");
					 ventana.getPa().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
				}else {
					vista.mostrarInformacion("No fue posible el registro :(");
				}
		}
		 
		 if(comando.equals("SALIR2")) {
				
				System.exit(0);
		}
		 
		 if(comando.equals("ATRAS")) {
				
				ventana.getPa().setVisible(false);
				ventana.getPp().setVisible(true);
		}
		 
		 if(comando.equals("ELIMINAR")) {
			 
			 int fila = ventana.getPa().getDescripcion().getSelectedRow();

			    if (fila != -1) {
			        String nombre = (String) ventana.getPa().getDescripcion().getValueAt(fila, 0);

			        ProductoDTO pDTO = new ProductoDTO();
			        pDTO.setNombre(nombre);

			        if (panaderia.eliminarProducto(pDTO)) {
			            vista.mostrarInformacion("Producto eliminado correctamente.");
			            ventana.getPa().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
			        } else {
			            vista.mostrarInformacion("No se pudo eliminar el producto.");
			        }
			    } else {
			        vista.mostrarInformacion("Seleccione un producto para eliminar.");
			    }
				
				
		}
		 
		 if(comando.equals("EDITAR")) {
			 
			 int fila = ventana.getPa().getDescripcion().getSelectedRow();

			    if (fila != -1) {
			        ventana.getPa().getNombre().setText((String) ventana.getPa().getDescripcion().getValueAt(fila, 0));
			        ventana.getPa().getPrecio().setText(String.valueOf(ventana.getPa().getDescripcion().getValueAt(fila, 1)));
			        ventana.getPa().getCantidad().setText(String.valueOf(ventana.getPa().getDescripcion().getValueAt(fila, 2)));
			        ventana.getPa().getCostoProduccion().setText(String.valueOf(ventana.getPa().getDescripcion().getValueAt(fila, 3)));
			        ventana.getPa().getCostoVenta().setText(String.valueOf(ventana.getPa().getDescripcion().getValueAt(fila, 4)));
			    } else {
			        vista.mostrarInformacion("Seleccione un producto para editar.");
			    }
				
				
		}
		 
		 if(comando.equals("ACTUALIZAR")) {
			 
			 int fila = ventana.getPa().getDescripcion().getSelectedRow();

			    if (fila != -1) {
			        // Producto original
			        String nombreOriginal = (String) ventana.getPa().getDescripcion().getValueAt(fila, 0);
			        ProductoDTO original = new ProductoDTO();
			        original.setNombre(nombreOriginal);

			        // Producto actualizado
			        ProductoDTO actualizado = new ProductoDTO();
			        actualizado.setNombre(ventana.getPa().getNombre().getText());
			        actualizado.setPrecio(Integer.parseInt(ventana.getPa().getPrecio().getText()));
			        actualizado.setCantidad(Integer.parseInt(ventana.getPa().getCantidad().getText()));
			        actualizado.setPrecioProduccion(Integer.parseInt(ventana.getPa().getCostoProduccion().getText()));
			        actualizado.setPrecioVenta(Integer.parseInt(ventana.getPa().getCostoVenta().getText()));

			        if (panaderia.actualizarProducto(original, actualizado)) {
			            vista.mostrarInformacion("Producto actualizado correctamente.");
			            ventana.getPa().cargarTabla(panaderia.getPanaderiaDAO().leerTodos());
			        } else {
			            vista.mostrarInformacion("No se pudo actualizar el producto.");
			        }
			    } else {
			        vista.mostrarInformacion("Seleccione un producto para actualizar.");
			    }
				
			
		}
			
		
	}    
	
	


}
