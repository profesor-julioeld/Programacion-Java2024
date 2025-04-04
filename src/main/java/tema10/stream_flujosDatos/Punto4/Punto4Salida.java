package tema10.stream_flujosDatos.Punto4;

import java.io.*;

/* En este ejercicio vamos a ver unos conceptos adicionales sobre try-with-resources:
   - CONCEPTO 1) Se pueden poner varios recursos dentro del try ()
   - CONCEPTO 2) Hay que tener cuidado cuando uno de los recursos abre otro
   - CONCEPTO 3) Explicar concepto de Excepciones suprimidas y como solucionarlo
 */
public class Punto4Salida {
    public static void main(String[] args) {
        // En este caso lee de ejemplo.txt y escribe en ejemplo2.txt
        // al no usar el constructor con append, borra primero el contenido
        // de ejemplo2.txt
        escriboConBufferedWriter("c:/diurno/ejemplo.txt","c:/diurno/ejemplo2.txt");
    }

    // Leo línea a línea
    private static void escriboConBufferedWriter(String leo,String escribo){
        // CONCEPTO 1) Aquí dejamos a try-with-resources que controle el close de 2 recursos
        // CONCEPTO 2) Estás seguro que se cerrarán de forma correcta FileReader y FileWriter?
        // eso lo puedes descubrir leyendo el código de BufferedReader o probando el programa que
        // he puesto en Punto4Concepto2
        try (BufferedReader in=new BufferedReader(new FileReader(leo));
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
