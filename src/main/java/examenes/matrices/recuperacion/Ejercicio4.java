package examenes.matrices.recuperacion;

public class Ejercicio4 {
    public static void main(String[] args) {
        char[][] matriz={   {'S','J',' '},
                            {'T','S',' '},
                            {' ',' ','S'},};
        System.out.println(tiraIgual(matriz));
    }
    private static boolean tiraIgual(char[][] c){
        return (c[0][0]==c[0][1] && c[0][1]==c[0][2]) ||
               (c[1][0]==c[1][1] && c[1][1]==c[1][2]) ||
               (c[2][0]==c[2][1] && c[2][1]==c[2][2]) ||
               (c[0][0]==c[1][0] && c[1][0]==c[2][0]) ||
               (c[0][1]==c[1][1] && c[1][1]==c[2][1]) ||
               (c[0][2]==c[1][2] && c[1][2]==c[2][2]) ||
               (c[0][0]==c[1][1] && c[1][1]==c[2][2]) ||
               (c[0][2]==c[1][1] && c[1][1]==c[2][0]);
    }
}
