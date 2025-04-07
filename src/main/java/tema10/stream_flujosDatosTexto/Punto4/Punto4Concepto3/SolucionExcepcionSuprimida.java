package tema10.stream_flujosDatosTexto.Punto4.Punto4Concepto3;

import java.io.FileReader;

// E
public class SolucionExcepcionSuprimida {
    public static void main(String[] args) {
        try { suprimoExcepcion(); }
        catch (Exception e) {
            System.out.println("Pasada excepción de tipo "+e.getClass());
            for (Throwable suprimida:e.getSuppressed())
                System.out.println("Y otra de tipo"+suprimida.getClass());
        }
    }

    private static void suprimoExcepcion() throws Exception {
        Throwable primeraExcepcion=null;
        FileReader f=null;
        try { f=new FileReader("c:/Noexiste");}
        catch (Exception e) {
            primeraExcepcion=e;
            throw e;}
        // Pero aquí también se produce una excepción ya que f vale null
        // junta las dos y las mando
        finally {
            try {f.close();}
            catch (Exception compuesta){
                if (primeraExcepcion!=null){
                    compuesta.addSuppressed(primeraExcepcion);
                    throw compuesta;
                }
            }
        }
    }
}
