package tema7.Punto5_Hasta_07_07.matrizNoDispersa_RealizadaEnClase_AmpliacionAuto;

public class UsoMatriz {
    public static void main(String[] args) {
        Matriz m=new Matriz(15);
        Matriz m2=new Matriz(3);
        m.asigno(3,12);
        System.out.println(m.leo(3));
        for (int i=0;i<m.length();i++){
            System.out.println(m.leo(i));
        }
        if (m.equals(m2)) System.out.println("m = " + m);
        System.out.println(m);
    }
}
