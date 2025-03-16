package examenes.matrices.recuperacion;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] enteros={12,45,23,45,12};
        System.out.println(capicua(enteros));
    }
    private static boolean capicua(int[] enteros){
        for (int i=0,j=enteros.length-1;i<j;i++,j--){
            if (enteros[i]!=enteros[j]) return false;
        }
        return true;
    }
}
