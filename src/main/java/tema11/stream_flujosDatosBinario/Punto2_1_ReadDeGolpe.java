package tema11.stream_flujosDatosBinario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Punto2_1_ReadDeGolpe {
    public static void main(String[] args) {
        String rutaFile="c:/diurno/Punto1_1_DeGolpe";
        int[] lista=null; // tengo que saber la dimensión para FORMA 1
        try(ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream(rutaFile))){
            // FORMA 2: Leo directamente el array, no necesita saber cuántos int hay
            lista= (int[]) flujoEntrada.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lista = " + Arrays.toString(lista));
    }
}
