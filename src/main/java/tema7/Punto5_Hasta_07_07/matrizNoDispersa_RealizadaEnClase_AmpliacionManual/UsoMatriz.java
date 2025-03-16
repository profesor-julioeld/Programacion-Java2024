package tema7.Punto5_Hasta_07_07.matrizNoDispersa_RealizadaEnClase_AmpliacionManual;

public class UsoMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz(7);
        m.asigno(3,12); //En el índice 3 colocamos el valor 12
        int leido = m.leo(3);
        m.amplio(3);
        m.asigno(10, -12);
        System.out.println("La longitud es " +m.length());
        System.out.println("m = " + m);

    }
}
