package task1;

public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.createDocument();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.createDocument();
    }
}