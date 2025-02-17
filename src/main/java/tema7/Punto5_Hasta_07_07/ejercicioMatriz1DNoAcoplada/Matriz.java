package tema7.Punto5_Hasta_07_07.ejercicioMatriz1DNoAcoplada;
// NOTA: La implementación de esta lista es ineficiente porque no enlazamos los nodos
// ordenador por índice por lo que siempre hay que recorrer la lista completa en
// cualquier búsqueda

import java.util.Arrays;

/**
 * Matriz dinámica de una dimensión de enteros (realmente es dispersa)
 * cada elemento se identifica por su índice de valor entero
 * @author julio
 * @version 1
 */
public class Matriz {
    private int indice;
    private int valor;
    private Matriz siguiente;
    /**
     * Contruye una matriz de enteros, sus elementos iniciados a cero
     */
    public Matriz() {
        this.siguiente=null;
    }

    /**
     * Devuelve la referencia del nodo para ese indice y null si no lo encuentra
     * @param indice a buscar
     * @return devuelve referencia del nodo
     */
    private Matriz busco(int indice){
        Matriz aux=this;
        while (aux!=null){
            if (aux.indice==indice) return aux; // Encontrado
            aux=aux.siguiente;
        }
        return aux; // Llegué al final sin encontrarlo
    }

    /**
     * Asigno el valor al indice indicado
     * @param indice valor entero,
     * @param valor valor a asignar
     */
    public void asigno(int indice, int valor) {
        Matriz aux=busco(indice);
        if (aux!=null) {
            aux.valor = valor; // Sustituyo valor
        }
        else {
            // No está, lo inserto al principio que es lo más sencillo
            Matriz nuevoNodo=new Matriz();
            nuevoNodo.indice=indice;
            nuevoNodo.valor=valor;
            nuevoNodo.siguiente=this.siguiente;
            this.siguiente=nuevoNodo;
        }
    }

    /**
     * Devuelve el valor en ese indice
     * @param indice
     * @return valor en ese indice
     */
    public int leo(int indice) {
        Matriz aux=busco(indice);
        if (aux==null) return 0; // No lo encuentro, por defecto es 0
        return aux.valor;
    }

    // No tiene mucho sentido toString si no creamos el concepto de longitud
}
