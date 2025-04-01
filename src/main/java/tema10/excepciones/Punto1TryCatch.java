package tema10.excepciones;

import java.util.Scanner;

public class Punto1TryCatch {
    public static void main(String[] args) {
        // ENFOQUE 1: Capturo directamente donde se produce la excepción
        // No estoy obligado a poner el try (Tipo RuntimeException)
        // Si escribes 5 0 verás como generará un error
        Scanner sc=new Scanner(System.in);
        System.out.print("Escribe dos enteros? ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        // Uso la excepción más específica
        try { System.out.println("c1 = " + a/b); }
        catch (ArithmeticException e){ System.out.println("c1 = "+ "\u221E");} // Se puede sustituir por el carácter
        // Puedo usar también una más general
        try { System.out.println("c2 = " + a/b); }
        catch (Exception e){ System.out.println("c2 = "+ "∞");}
        // Pongo las dos pero primero siempre de más específica a más general
        try { System.out.println("c3 = " + a/b); }
        catch (ArithmeticException e){ System.out.println("c31 = "+ "∞");}
        catch (Exception e){ System.out.println("c32 = "+ "∞");}
        // Solo las puedo unir en un catch si son disjuntas. Ésto da error.
        /*try { System.out.println("c4 = " + a/b); }
        catch (ArithmeticException | Exception e){ System.out.println("c4 = "+ "∞");}*/
        System.out.println("Termino normalmente enfoque 1");
        // ENFOQUE 2: Paso la pelota a quien me llama
        // Recibe la pelota main y decide capturar y tratar
        try {pasoDeTodo(a,b);}
        catch (ArithmeticException e) { System.out.println("Harto de tó");}
        // Recibe main pero decide no capturar
        pasoDeTodo(a,b);
    }

    // Aunque le pase la pelota a main, no tiene por qué poner el try
    private static void pasoDeTodo(int a,int b) throws ArithmeticException {
        System.out.println("3 = " + a/b);
    }
}
