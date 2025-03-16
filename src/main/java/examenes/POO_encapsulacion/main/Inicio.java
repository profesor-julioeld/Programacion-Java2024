package examenes.POO_encapsulacion.main;

import examenes.POO_encapsulacion.Dado;

public class Inicio {
    private static final int MAX=5;
    public static void main(String[] args) {
        Dado d=new Dado();
        for (int i=0;i<MAX;i++)
            d.tirarDado();
        System.out.println(d);
    }
}
