package tema9.ejerciciosFinales;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ejercicio6Tema9 {
    public static void main(String[] args) {
        Collator comparador = Collator.getInstance(new Locale("es"));
        comparador.setStrength(Collator.TERTIARY);
        List<String> strings= Arrays.asList("ñoño","nono","Ono");
        strings.sort(comparador);
        System.out.println(strings);
    }
}
