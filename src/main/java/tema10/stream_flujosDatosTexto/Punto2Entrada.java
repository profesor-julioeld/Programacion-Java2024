package tema10.stream_flujosDatosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Punto2Entrada {
    public static void main(String[] args) {
        // Un entero ocupa 4 bytes. Un char ocupa 2 bytes
        // La constante SIZE devuelve bits que ocupa lo envuelto (int, char)
        System.out.println("Bytes que ocupa un int = " + Integer.SIZE/8);
        System.out.println("Bytes que ocupa un char = " + Character.SIZE/8);
        // El valor -1 en hexadecimal es FFFFFFFF
        System.out.println(Integer.toHexString(-1).toUpperCase());
        // Un caracter unicode se define como uXXXX en Java aunque el valor más
        // alto posible a 2-4-25 es u10FFFF . Java no lo admite, máximo uFFFF
        // Uso try-resource para garantizar el close del fichero
        // Crea un fichero ejemplo.txt en Diurno
        leoConFileReader("C:\\Diurno\\ejemplo.txt");
        leoConBufferedReader("c:/diurno/ejemplo.txt");
    }

    // Leo carácter a carácter incluido los \n y \r
    private static void leoConFileReader(String rutaFile){
        try (FileReader f=new FileReader(rutaFile)){
            int c;
            StringBuilder s=new StringBuilder();
            while ((c=f.read())!=-1) {
                System.out.printf("He leido el carácter %c %d\n",(char)c,c);
                s.append((char)c);
            }
            System.out.println("s1 = " + s);
        }
        catch (FileNotFoundException e){System.out.println("Problemas con el fichero");}
        catch (IOException e){System.out.println("Operación no se ha podido realizar");}
    }

    // Leo línea a línea
    private static void leoConBufferedReader(String rutaFile){
        try (BufferedReader in=new BufferedReader(new FileReader(rutaFile))){
            String cadena=null;
            StringBuilder s=new StringBuilder();
            // Leo línea a línea
            while ((cadena=in.readLine())!=null) {
                s.append(cadena);
                s.append('\n');
            }
            System.out.println("s2 = " + s);
        }
        catch (FileNotFoundException e){System.out.println("Problemas con el fichero");}
        catch (IOException e){System.out.println("Operación no se ha podido realizar");}
    }
}
