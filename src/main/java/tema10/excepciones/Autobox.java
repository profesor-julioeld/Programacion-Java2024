package tema10.excepciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autobox {
    public static void main(String[] args) {
        Integer i=9; // Autobox
        int j=i; // Unbox
        // Esto crea una Array list de Integer
        // pero le paso int
        /* MUY IMPORTANTE: No crees la lista con el código
        List<Integer> lista= Arrays.asList(9,3,4,5);
        No funciona porque crea una lista de tamaño fijo */
        List<Integer> lista= new ArrayList<>(Arrays.asList(9,3,4,5));
        // Ahora quiero borrar el Integer 9, pruebo dos casos
        // NOTA: Descomenta uno de los remove y prueba
        System.out.println(i.getClass());
        //lista.remove(i);
        lista.remove(9); // Este produce un error ya que no existen 10 elementos
        System.out.println("lista = " + lista);
    }
}
