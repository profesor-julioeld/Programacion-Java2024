package tema10.excepciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autobox2 {
    public static void main(String[] args) {
       List<Integer> lista= Arrays.asList(9,3,4,5);
       lista.add(4);
       System.out.println("lista = " + lista);
    }
}
