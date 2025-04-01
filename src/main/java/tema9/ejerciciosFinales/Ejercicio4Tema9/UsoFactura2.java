package tema9.ejerciciosFinales.Ejercicio4Tema9;
import tema9.ejerciciosFinales.Ejercicio4Tema9.clases.Factura2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class UsoFactura2 {
    // Para simplificar el código no voy a usar try-resources
    public static void main(String[] args) {
        List<Factura2> facturas=
          Arrays.asList(
                        new Factura2("2025/A/00002",toLD("03/03/2025"),234.34),
                        new Factura2("2025/A/00004",toLD("03/06/2025"),1456.23),
                        new Factura2("2025/A/00005",toLD("01/07/2025"),830.23),
                        new Factura2("2025/A/00001",toLD("01/02/2025"),234.34),
                        new Factura2("2025/A/00003",toLD("04/05/2025"),34.23));
        // Echa un vistazo a la codificación de este método y verás que te toca aprender todavía mucho
        // de Java. A ver cómo te explicas que si pones facturas.sort() no te funciona pero a Collections sí
        Collections.sort(facturas);
        System.out.println("En orden ascendente de id");
        facturas.forEach(System.out::println);
        System.out.println("En orden descendente de id");
        // Reversed no modifica la lista sino que la entrega al revés
        // si quieres dar la vuelta a facturas usa reverse Collections.reverse(facturas)
        // MUY IMPORTANTE: Fíjate como no es lo mismo sort (ordena) que sorted (devuelve ordenada)
        facturas.reversed().forEach(System.out::println);
        System.out.println("En orden ascendente de número de factura");
        facturas.sort((a, b) -> a.getNumFactura().compareTo(b.getNumFactura()));
        facturas.forEach(System.out::println);
        // Que bonito hubiera quedado si hubiese podido poner .forEach() pero eso se lo dejamos a Stream
        // Descomenta la siguiente sentencia si quieres entrar en otro mundo!!!
        facturas.stream()
                .sorted((a, b) -> a.getNumFactura().compareTo(b.getNumFactura()))
                .forEach(System.out::println);
        System.out.println("En orden descendente de total de factura");
        facturas.sort((a, b) -> (int)b.getTotal()*100-(int)a.getTotal()*100);
        facturas.forEach(System.out::println);
    }

    // Una forma posible de cargarlo desde String es parsearlo con un formateador
    // Si no cumple formato devuelve null
    // podemos usar locale o poner el formato directamente
    private static LocalDate toLD(String fecha){
        // ofPattern usa el formato español de fecha aunque podemos poner un formato concreto
        // de la forma ofPattern("d/M/YYYY",fecha)
        // Los patrones los puedes encontrar directamente en la clase
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/mm/YYYY",new Locale("es"));
        LocalDate localDate;
        try { localDate = LocalDate.parse(fecha, dateTimeFormatter);}
        catch (DateTimeParseException e) {return null;}
        return localDate;
    }
}
