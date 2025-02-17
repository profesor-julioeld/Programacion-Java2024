package tema7.Punto5_Hasta_07_07.ejercicioMatriz1DAcoplada;

public class UsoMatriz {
    public static void main(String[] args) {
        // Si creo una versión acoplada con su implementación con array, necesitaré indicar tamaño inicial
        Matriz m=new Matriz(7);
        m.asigno(3,16);  // En el índice 3 cargo el valor 16
        System.out.println(m.leo(3));
        System.out.println(m.length());
        m.amplio(3); // amplio de 17 a 27 sin pérdida de datos
        m.asigno(8,-13);
        System.out.println("m = " + m); // Añado toString
    }

}
