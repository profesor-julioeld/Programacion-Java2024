package examenes.matrices.recuperacion;
// Este ejercicio no tiene control de errores
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] izda={1,3,4};
        int[] dcha={3,0,0,0};
        System.out.println(resta(izda,dcha));
    }
    private static int resta(int[] izda,int[] dcha){
        return toInt(izda)-toInt(dcha);
    }

    private static int toInt(int[] param){
        StringBuilder aux= new StringBuilder();
        for (int j : param) aux.append(j);
        return Integer.parseInt(aux.toString());
    }
}
