package co.edu.udistrital.controller;

import co.edu.udistrital.model.DocumentoPDF;



import co.edu.udistrital.view.VistaDocumento;


public class ControladorDocumento {
    private DocumentoPDF documento;
    private VistaDocumento vista;

    public ControladorDocumento(DocumentoPDF documento, VistaDocumento vista) {
        this.documento = documento;
        this.vista = vista;
    }

    public void abrir() {
        vista.mostrar();
        documento.abrirPDF();
    }
}
