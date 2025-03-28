package tema9.Punto9ComparableComparator.otrosAsuntosMetidosConCalzador;

import java.util.Arrays;
import java.util.List;

// Dispones de un documentos en Drive que explica el contenido de este fichero
public class MetodosReferenciados {
    public static void main(String[] args) {
        List<String> saludos= Arrays.asList("tontaina","Ehhh","campeón");
        // Ordenamos usando un método de un objeto no determinado
        // VERSIÓN: Expresión lambda
        saludos.sort((a,b)->a.compareTo(b));
        // VERSIÓN: Operador :: ponemos la clase y no el objeto al no estar determinado
        saludos.sort(String::compareTo);
        // Imprimir usando un método de un objeto conocido System.out
        // VERSIÓN: Expresión lambda
        // Ufff, aquí ya ni he puesto paréntesis a saludo, cada día mas vaguete
        saludos.forEach(saludo->System.out.println(saludo));
        // VERSIÓN: Operador :: (El mismo IDE te dice que no lo escribas de la manera anterior)
        saludos.forEach(System.out::println);
    }
}
