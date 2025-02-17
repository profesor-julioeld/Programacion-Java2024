package tema7.Punto5_Hasta_07_07.ejercicioMatriz1DNoAcoplada;

public class UsoMatriz {
    public static void main(String[] args) {
        // Versión "supuestamente" no acoplada. Siempre existe parte de acoplamiento
        Matriz m=new Matriz(); // No necesito indicar longitud
        m.asigno(3,16);
        m.asigno(-13,134);
        m.asigno(12345,239);
        System.out.println(m.leo(3));
        System.out.println(m.leo(-13));
        System.out.println(m.leo(12345));
        System.out.println(m.leo(33000));
        // System.out.println("m = " + m); Sólo podría mostrar los ya asignados a mano
    }

}
