package tema10.stream_flujosDatosTexto.Punto4.Punto4Concepto3;

import java.io.FileReader;

// E
public class ExcepcionSuprimidaCaso2 {
    public static void main(String[] args) {
        try { suprimoExcepcion(); }
        catch (Exception e) {
            System.out.println("Pasado una excepción de tipo "+e.getClass());
            // Devuelve cero, entenderás el por qué de su uso un poco más adelante
            System.out.println(e.getSuppressed().length);
        }
    }

    private static void suprimoExcepcion() throws Exception {
        FileReader f=null;
        try { f=new FileReader("c:/Noexiste");}
        catch (Exception e) { throw e;}
        // Pero aquí también se produce una excepción ya que f vale null
        finally {f.close();}
    }
}
