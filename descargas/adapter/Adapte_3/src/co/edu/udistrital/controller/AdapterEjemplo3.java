package co.edu.udistrital.controller;


import co.edu.udistrital.model.DocumentoWord;

import co.edu.udistrital.view.VistaDocumento;


public class AdapterEjemplo3 {
    public static void main(String[] args) {
        DocumentoWord word = new DocumentoWord();
        DocumentoPDF adaptador = new AdaptadorPDF(word);
        VistaDocumento vista = new VistaDocumento();
        ControladorDocumento controlador = new ControladorDocumento(adaptador, vista);
        controlador.abrir();
    }
}