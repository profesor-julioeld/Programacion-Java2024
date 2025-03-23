package tema9.importstatic;


import tema9.importstatic.clases.EstaticaUno;
import tema9.importstatic.clases.EstaticaDos;

// Al no usar import static, me toca cualificar el miembro a usar
public class UsoEstaticoEjemplo2 {
    public static void main(String[] args) {
        System.out.println(EstaticaUno.MAX);
        System.out.println(EstaticaDos.giro("Hola"));
    }
}