package tema7.Punto8y9.ejercicioMatriz1DNoAcoplada;
// NOTA: La implementación de esta lista es ineficiente porque no enlazamos los nodos
// ordenados por índice por lo que siempre hay que recorrer la lista completa en
// cualquier búsqueda. La intención es simplificar el código para centrarnos en POO

/**
 * Matriz dinámica de una dimensión de enteros (realmente es dispersa)
 * cada elemento se identifica por su índice de valor entero
 * @author julio
 * @version 1
 */
public class Matriz {
    // En esta implementación uso una clase interna privada
    // MI: Una clase externa no puede ser privada pero una interna sí puede
    // podría haber declarado Nodo como una clase separada en el mismo paquete (es recomendable)

    private Nodo contenido;
    /**
     * Construye una matriz de enteros con sus elementos iniciados a cero
     */
    public Matriz() {
        this.contenido=null;
    }

    /**
     * Devuelve la referencia del nodo para ese índice y null si no lo encuentra
     * @param indice a buscar
     * @return devuelve referencia del nodo
     */
    private Nodo busco(int indice){
        Nodo aux=contenido;
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
        Nodo aux=busco(indice);
        if (aux!=null) {
            aux.valor = valor; // Sustituyo valor
        }
        else {
            // No está, lo inserto al principio que es lo más sencillo
            Nodo nuevoNodo=new Nodo();
            nuevoNodo.indice=indice;
            nuevoNodo.valor=valor;
            // Reconecto el nodo al principio de la lista enlazada
            nuevoNodo.siguiente=this.contenido;
            this.contenido=nuevoNodo;
        }
    }

    /**
     * Devuelve el valor en ese indice
     * @param indice
     * @return valor en ese indice
     */
    public int leo(int indice) {
        Nodo aux=busco(indice);
        if (aux==null) return 0; // No lo encuentro, por defecto es 0
        return aux.valor;
    }

    // No tiene mucho sentido toString si no creamos el concepto de longitud
    // Se puede proponer el mostrar sólo el contenido de los nodos

    @Override
    public String toString() {
        String res = "Matriz{";
        Nodo aux = contenido;
        while (aux != null) {
            res += "[" + aux.indice + "," + aux.valor + "]";
            aux=aux.siguiente;
        }
        res += '}';
        return res;
    }
}
