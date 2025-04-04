package tema10.stream_flujosDatos.Punto4.Punto4Concepto2;

import tema10.stream_flujosDatos.Punto4.Punto4Concepto2.subclases.FileJulioReader;

import java.io.*;

// Este ejercicio pretende probar si se cierra correctamente tanto BufferedReader como
// el recurso que se pasa como parámetros (FileReader)
public class Punto4Concepto2 {
    public static void main(String[] args) {
        // En este caso lee de ejemplo.txt y escribe en ejemplo2.txt
        // al no usar el constructor con append, borra primero el contenido
        // de ejemplo2.txt
        escriboConBufferedWriter("c:/diurno/ejemplo.txt","c:/diurno/ejemplo2.txt");
    }

    // Se trata del Punto4Salida pero cambiando FileReader por FileJulioReader
    private static void escriboConBufferedWriter(String leo,String escribo){
        try (BufferedReader in=new BufferedReader(new FileJulioReader(leo));
             // Podemos usar el constructor FileWrite(escribo,true) para que haga append mejor que limpiar
             BufferedWriter out=new BufferedWriter(new FileWriter(escribo))){
            String cadena=null;
            // Leo y escribo línea a línea
            while ((cadena=in.readLine())!=null) {
                out.write(cadena);
                out.newLine();
                out.flush(); // En redes es muy importante su uso
            }
        }
        catch (FileNotFoundException e){System.out.println("Problemas con el fichero");}
        catch (IOException e){System.out.println("Operación no se ha podido realizar");}
    }
}
