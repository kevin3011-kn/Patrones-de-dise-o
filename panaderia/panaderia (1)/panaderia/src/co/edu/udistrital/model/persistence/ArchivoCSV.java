package co.edu.udistrital.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import co.edu.udistrital.model.Producto;

public class ArchivoCSV {
	
	 private File archivoCSV = new File("data/compras.csv");

	 public void escribirCompra(Producto producto, String adicional) {
		    try (FileWriter writer = new FileWriter("compras.csv", true)) {
		        writer.write(producto.getNombre() + "," + producto.getPrecio() + "," + adicional + "\n");
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

}
