package tema7.Punto8y9;

import java.util.Scanner;

public class UsoEnum {
    // Sólo necesarios para limitar los valores al dominio de
    // solución del problema cuando no existe otra alternativa
    enum DiaSemana {
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
    }

    public static void main(String[] args) {
        DiaSemana ds;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Escribe el día de la semana?");
            String lectura=sc.nextLine();
            // Escribe lunes y verás el problema
            ds=DiaSemana.valueOf(lectura);
            System.out.println("ds = " + ds);
        }
        ds=DiaSemana.SABADO;
        System.out.println("ds = " + ds);
    }
}
