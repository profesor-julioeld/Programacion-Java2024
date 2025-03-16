package examenes.matrices.recuperacion;

import java.text.Normalizer;

public class Ejercicio2 {
    public static void main(String[] args) {
        if (args.length!=1){
            System.err.println("Atontao, tienes que poner un argumento y sólo uno");
            System.exit(-1);
        }
        System.out.println(quitoAcentos(args[0]));
    }

    private static String quitoAcentos(String original) {
        String normalizada= Normalizer.normalize(original, Normalizer.Form.NFD);
        return normalizada.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}
