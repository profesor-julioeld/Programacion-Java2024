package tema7.Punto5_Hasta_07_07.prueba2;

public class UsoMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz(17);
        m.asigno(3,12); //En el índice 3 colocamos el valor 12
        int leido = m.leo(3);
        m.amplio(10);
        m.asigno(20, -12);
        System.out.println("La longitud es " +m.length());
        System.out.println("m = " + m);

    }
}
