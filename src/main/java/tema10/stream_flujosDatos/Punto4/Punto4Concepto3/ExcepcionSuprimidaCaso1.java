package tema10.stream_flujosDatos.Punto4.Punto4Concepto3;

// E
public class ExcepcionSuprimidaCaso1 {
    public static void main(String[] args) {
        try { suprimoExcepcion(); }
        catch (Exception e) { System.out.println("Pasado una excepción de tipo "+e.getClass());}
    }

    private static void suprimoExcepcion() throws Exception {
        int v[] = new int[3];
        try {v[10] = 4;} // v[10] no existe por lo que lanzará una excepción
        catch (Exception e) { throw e;}
        // Pero aquí también se produce una excepción
        finally {int c=3/0;}
    }
}
