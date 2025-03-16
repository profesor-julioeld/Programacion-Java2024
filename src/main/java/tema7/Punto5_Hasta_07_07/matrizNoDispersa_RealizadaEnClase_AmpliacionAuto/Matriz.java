package tema7.Punto5_Hasta_07_07.matrizNoDispersa_RealizadaEnClase_AmpliacionAuto;

/**
 * Matriz de una dimensión dinámica no dispersa
 */
public class Matriz {
    private int[] contenido;
    private int longitud;
    /**
     * Crea una matriz de longitud rellena con ceros en todos sus elementos
     * se accede a un indice desde valor 0 hasta longitud-1
     * @param longitud valor del tamaño
     */
    public Matriz(int longitud) {
        this.longitud=longitud;
        int[] contenido= new int[this.longitud];
    }

    /**
     * Asigno valor al indice
     * @param indice en caso de ser >=longitud se amplía longitud al valor del indice+1
     * @param valor entero a almacenar en ese índice
     */
    public void asigno(int indice, int valor) {
        if (indice>=longitud){
            //Ampliar array a nueva longitud = indice+1
            int nuevaLongitud=indice+1;
            int[] destino=new int[nuevaLongitud];
            System.arraycopy(contenido,0,destino,0,longitud);
            //Actualizar atributos
            this.longitud=nuevaLongitud;
            this.contenido=destino;
        }
        //Asignar valor en indice
        this.contenido[indice]=valor;
    }

    /**
     * devuelve valor del indice dado
     * @param indice si índice>=longitud genera una exception tipo RunTimeError
     * @return valor devuelve
     */
    public int leo(int indice) {
        if (indice>=longitud) throw new IllegalArgumentException("Indice debe ser menor a " + longitud);
        return contenido[indice];
    }

    /**
     * Devuelve longitud de la matriz
     * @return valor devuelto entero
     */
    public int length() {
        return longitud;
    }

    /**
     * Devuelve una representación de la Matriz con sus valores en una sola línea
     * @return un String
     */
    @Override
    public String toString() {
        return "Matriz{}";
    }

}
