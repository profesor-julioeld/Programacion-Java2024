package tema10.stream_flujosDatosTexto.Punto4.Punto4Concepto2.subclases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Lo único que hace es asegurarse que que se muestre un mensaje
cuando alguien ejecute close */
public class FileJulioReader extends FileReader {
    private String filename=null;
    @Override
    public void close() throws IOException {
        super.close();
        System.out.println("Acabo de cerrar "+this.filename);
    }

    public FileJulioReader(String filename) throws FileNotFoundException {
        super(filename);
        System.out.println("Apertura de "+filename);
        this.filename=filename;
    }
}
