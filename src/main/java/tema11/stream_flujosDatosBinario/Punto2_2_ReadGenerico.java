package tema11.stream_flujosDatosBinario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

// En esta ocasión vamos a realizar una lectura y obtendremos el tipo
// del objeto grabado en el fichero
public class Punto2_2_ReadGenerico {
    public static void main(String[] args) {
        String rutaFile="c:/diurno/Punto1_1_DeGolpe";
        Object leo=null;
        try(ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream(rutaFile))){
            // FORMA 2: Leo directamente el array, no necesita saber cuántos int hay
            leo=flujoEntrada.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El tipo del objeto leido es "+leo.getClass());
    }
}
