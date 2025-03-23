package tema9.importstatic;

import static java.lang.Math.PI;

// Voy a usar constantes de Math, importado por el import
// implícito a java.lang
public class UsoEstaticoEjemplo3 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        // Si comentar el import static no funciona la línea
        // siguiente
        System.out.println(PI);
    }
}