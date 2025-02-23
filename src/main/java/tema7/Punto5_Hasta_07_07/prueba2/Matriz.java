package tema7.Punto5_Hasta_07_07.prueba2;

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
        this.longitud=longitud;
        this.contenido=new int[this.longitud];
    }

    /**
     * Asigna en el índice el valor dado
     * @param indice valor de 1 a longitud, en caso contrario generará una excepción >>>> poner excepción
     * @param valor entero a asignar
     */
    public void asigno(int indice, int valor) {
        this.contenido[indice-1]=valor;
        if(this.indice<0){

        }
    }

    /**
     * Devuelve el elemento almacenado en ese índice
     * @param indice valor de 1 a longitud >>>> controlar excepción
     * @return  devuelve el elemento almacenado
     */
    public int leo(int indice) {

    }

    /**
     * Devuelve la longitud del array
     * @return valor devuelto
     */
    public int length() {

    }

    /**
     * Representación del contenido de la matriz en cadena
     * @return cadena
     */
    @Override
    public String toString() {
        return "Matriz{}";
    }

    /**
     * Amplías la matriz desde longitud actual cantidad elementos con valor 0
     * @param cantidad valor de 1 que es mayor que 0 >>>> excepción
     */
    public void amplio(int cantidad) {
    }
}
