package tema9.Punto9ComparableComparator.otrosAsuntosMetidosConCalzador;

/* Ya que ha surgido un caso en el que aparecía un caso de argumento variable
( caso Objects.has ) hacemos esta clase para probarlo */
public class EjemploArgumentosVariables {
    public static void main(String[] args) {
        System.out.println("El máximo es "+maximo(3,2,5,6,8));
    }
    // Si hubiera más argumentos, tiene que ser el último
    public static int maximo(int... valores){
        int aux =Integer.MIN_VALUE;
        for (int valor:valores)
            aux =valor>aux?valor:aux;
        return aux;
    }
}
