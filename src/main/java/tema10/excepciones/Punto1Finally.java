package tema10.excepciones;

import java.util.Scanner;

public class Punto1Finally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escribe dos enteros? ");
        Integer a,b;
        a=sc.nextInt(); //Autobox: Tienes un documento en Drive explicando su uso
        b=sc.nextInt();
        System.out.println(" EL resultado de la división a/b es "+divido(a,b));
    }
    private static String divido(Integer a,Integer b){
        try { return a/b+""; }
        catch (Exception e){ return "∞";}
        finally { System.out.println(" Haga lo que haga se ejecuta esta parte");}
    }
}
