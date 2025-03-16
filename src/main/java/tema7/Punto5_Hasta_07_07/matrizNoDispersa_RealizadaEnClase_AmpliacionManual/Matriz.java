package tema7.Punto5_Hasta_07_07.matrizNoDispersa_RealizadaEnClase_AmpliacionManual;

import java.util.Arrays;

/**
 * Matriz es un array de una dimensión de enteros
 * Es un array no disperso y es dinámico
 * Se puede acceder a sus elementos con un índice de 1 a longitud
 */
public class Matriz {
    private int[] contenido;
    private int longitud;

    /**
     * Crea una matriz de longitud elementos enteros inicializados a 0
     * @param longitud tiene que ser entero y mayor que 0 >>>> excepciones
     */
    public Matriz(int longitud) {
        if (longitud<0)
            throw new IllegalArgumentException("No se admite una longitud negativa");
        this.longitud=longitud;
        this.contenido=new int[this.longitud];
    }

    /**
     * Asigna en el índice el valor dado
     * @param indice valor de 1 a longitud, en caso contrario generará una excepción IllegalArgumentException
     * @param valor entero a asignar
     */
    public void asigno(int indice, int valor) {
        if (indice<1 || indice>longitud)
            throw new IllegalArgumentException("Fuera de límites");
        this.contenido[indice-1]=valor;
    }

    /**
     * Devuelve el elemento almacenado en ese índice
     * @param indice valor de 1 a longitud
     * @return  devuelve el elemento almacenado
     */
    public int leo(int indice) {
        if (indice<1 || indice>longitud)
            throw new IllegalArgumentException("Fuera de límites");
        return this.contenido[indice-1];
    }

    /**
     * Devuelve la longitud del array
     * @return valor devuelto
     */
    public int length() {
        return this.longitud;
    }

    /**
     * Representación del contenido de la matriz en cadena
     * @return cadena
     */
    @Override
    public String toString() {
        return "Matriz{" +
                "contenido=" + Arrays.toString(contenido) +
                ", longitud=" + longitud +
                '}';
    }

    /**
     * Amplías la matriz desde longitud actual cantidad elementos con valor 0
     * @param cantidad valor de 1 que es mayor que 0 >>>> excepción
     */
    public void amplio(int cantidad) {
        int nuevaL = longitud+cantidad;
        int destino[] = new int[nuevaL];
        System.arraycopy(contenido,0,destino,0,longitud);
        //Actualizo atributos
        longitud = nuevaL;
        contenido = destino;
    }
}
