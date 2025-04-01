package tema10.excepciones;

import tema10.excepciones.subclases.ArgumentoInvalido;

public class Punto1ExcepcionUsuario {
    public static void main(String[] args) {
        // Usamos unchecked Exception
        de1a7_UC(5);
        // Usamos checked Exception de usuario
        // te obliga a poner try-catch
        try {
            de1a7_C(5);
        } catch (ArgumentoInvalido e) {
            e.printStackTrace();
        }

    }
    // Sólo admite que me pasen de 1 a 7
    private static void de1a7_UC (int a){
        if (a<1 || a>7)
            throw new IllegalArgumentException("a no está entre 1 y 7");

    }
    // O pasamos la pelota o ponemos try-catch
    private static void de1a7_C (int a) throws ArgumentoInvalido {
        if (a<1 || a>7)
            throw new ArgumentoInvalido("a no está entre 1 y 7");

    }
}
