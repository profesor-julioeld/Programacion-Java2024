package tema7.Punto5_Hasta_07_07.ejercicioMatriz1DAcoplada;

import java.util.Arrays;

/**
 * Matriz dinámica no dispersa de una dimensión de enteros
 * cada elemento se identifica por su índice de 0 a longitud -1
 * Podemos ampliar la longitud inicial sin perder datos
 * pero no asignar en espacios no creados
 * @author julio
 * @version 1
 */
public class Matriz {

    private int[] contenido;
    private int longitud;

    /**
     * Contruye una matriz de entero de i elementos todos iniciados a 0
     * @param longitud número de elementos iniciales
     */
    public Matriz(int longitud) {
        this.longitud=longitud;
        contenido=new int[this.longitud];
    }

    /**
     * Asigno el valor al indice indicado
     * Si indice>=logitud produce error en tiempo de ejecución
     *  NOTA: Para poder usar la clase no sólo debemos indicar lo que hace y encabezado
     *  sino las excepciones que puede generar si no son de tipo RunTimeException
     * @param indice de 0 a longitud-1,
     * @param valor valor a asignar
     */
    public void asigno(int indice, int valor) {
        if (indice>=longitud) throw new IllegalArgumentException("indice de 0 a "+(longitud-1));
        contenido[indice]=valor;
    }

    /**
     * Devuelve el valor en ese indice
     * Si indice>=longitud genera un error en tiempo de ejecución
     * @param indice
     * @return valor en ese indice
     */
    public int leo(int indice) {
        if (indice>=longitud) throw new IllegalArgumentException("indice de 0 a "+(longitud-1));
        return contenido[indice];
    }

    /**
     * Devuelvo la longitud actual de la matriz
     * @return devuelve longitud
     */
    public int length() {
        return longitud;
    }

    /**
     * Amplio longitud cantidad elementos
     * @param cantidad valor a ampliar
     */
    public void amplio(int cantidad) {
        int longitudNueva=longitud+cantidad;
        int[] nuevo=new int[longitudNueva];
        System.arraycopy(contenido,0,nuevo,0,longitud);
        // Actualizo atributos
        longitud=longitudNueva;
        contenido=nuevo;
    }

    @Override
    public String toString() {
        return "Matriz{" +
                "contenido=" + Arrays.toString(contenido) +
                '}';
    }
}
