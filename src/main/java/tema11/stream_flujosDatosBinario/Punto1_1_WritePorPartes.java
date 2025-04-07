package tema11.stream_flujosDatosBinario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Punto1_1_WritePorPartes {
    public static void main(String[] args) {
        int[] lista={0,1,2,3,4,5,6,7,8,9};
        String rutaFile="c:/diurno/Punto1_1_PorPartes";
        try(ObjectOutputStream flujoSalida=new ObjectOutputStream(new FileOutputStream(rutaFile))){
            // FORMA 1: Por partes pero al leerlo tenemos que saber qué se grabo
            for (int valor:lista)
                flujoSalida.writeInt(valor);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
