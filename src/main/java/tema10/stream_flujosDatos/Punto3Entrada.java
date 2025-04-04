package tema10.stream_flujosDatos;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Punto3Entrada {
    public static void main(String[] args) {
        leoConScanner("c:/diurno/ejemplo.txt");
        leoDecimalesConComa(System.in);
    }

    // leo por tokens
    private static void leoConScanner(String rutaFile){
        try (Scanner sc=new Scanner(new FileReader(rutaFile))){
            String cadena=null;
            StringBuilder s=new StringBuilder();
            // Cada token es una línea
            while (sc.hasNext()){
                cadena=sc.nextLine();
                s.append(cadena);
                s.append('\n');
            }
            System.out.println("s3 = " + s);
        }
        catch (FileNotFoundException e){System.out.println("Problemas con el fichero");}
        catch (IOException e){System.out.println("Operación no se ha podido realizar");}
    }

    // Leo decimales con el separador configurado en la JVM
    private static void leoDecimalesConComa(InputStream r){
        try (Scanner sc=new Scanner(r).useLocale(Locale.getDefault())){
            // Cada token es un decimal
            while (sc.hasNext()) {
                double d = sc.nextDouble();
                System.out.println(d);
            }
        }
        catch (Exception e2){System.out.println("Operación no se ha podido realizar");}
    }
}
