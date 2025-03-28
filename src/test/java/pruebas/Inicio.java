package pruebas;

import java.util.Arrays;

public class Inicio {
    public static void main(String[] args) {
        int a=2;
        System.out.println("Antes de inc   a = " + a);
        inc(a);
        System.out.println("Despues de inc a = " + a);
    }

    private static void inc(int b){
        b=b+1;
    }
}
