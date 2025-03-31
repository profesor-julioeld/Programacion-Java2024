package tema9.ejerciciosFinales;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// Hacer el ejercicio de la Bonoloto conociendo los set está tirado
public class Ejercicio5Tema9 {
    private static final int CUANTOS=6;
    private static final int MAXVALUE=49;
    public static void main(String[] args) {
        Random r=new Random();
        Set<Integer> bonoloto=new HashSet<>();
        while (bonoloto.size()<CUANTOS)
            bonoloto.add(r.nextInt(MAXVALUE)+1);
        bonoloto.stream().sorted().forEach(System.out::println);
    }

}
