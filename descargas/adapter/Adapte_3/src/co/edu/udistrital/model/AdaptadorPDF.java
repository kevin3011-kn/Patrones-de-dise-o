package co.edu.udistrital.model;

public class AdaptadorPDF implements DocumentoPDF {
    private DocumentoWord word;

    public AdaptadorPDF(DocumentoWord word) {
        this.word = word;
    }

    public void abrirPDF() {
        System.out.println("Convirtiendo DOC a PDF...");
        word.abrirDoc();
    }
}
