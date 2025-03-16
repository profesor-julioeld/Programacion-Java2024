package examenes.POO_encapsulacion;

import java.util.Arrays;

public class Dado {
    private static final int MAX=6; // Valor máx dado
    // Valor del dado tirado, 0 si no ha sido tirado, si ha sido de 1 a 6
    private int contenido; // valor del dado, 0 si no ha sido t
    // Cuantas veces ha salido cada cara va de 0 a 6 (corresponde a dado de 1 a 6)
    private static int[] estadistica=new int[MAX];
    public Dado(){
        // Coincide que se inicia a 0 por defecto
        contenido=0;
    }
    public void tirarDado(){
        contenido=Dado.aleatorio(); // No es necesario poner Dado.
        estadistica[contenido-1]++;
    }
    public int getValor() {
        if (contenido==0) throw new IllegalArgumentException("Dado no inicializado");
        return contenido;
    }

    public static void reset(){
        Arrays.fill(estadistica, 0);
    }

    // Función auxiliar para obtener un número aleatorio de 1 a 6
    private static int aleatorio(){
        int M=1;
        int N=MAX;
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }

    @Override
    public String toString() {
        return (contenido==0?"No se ha tirado aún":"Última tirada "+contenido)+"\n"+
               "Estadística="+ Arrays.toString(estadistica);
    }
}

