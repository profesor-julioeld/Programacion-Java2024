package tema11.stream_flujosDatosBinario;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Punto2_1_ReadPorPartes {
    public static void main(String[] args) {
        String rutaFile="c:/diurno/Punto1_1_PorPartes";
        int[] lista=new int[10]; // tengo que saber la dimensión para FORMA 1
        try(ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream(rutaFile))){
            // FORMA 1: Tengo que tener claro qué se ha grabado en el fichero
            for (int i=0;i<lista.length;i++)
                lista[i]=flujoEntrada.readInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lista = " + Arrays.toString(lista));
    }
}
