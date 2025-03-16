package tema8.casosOverride.Ejemplo2Override;

public class Instrumento {
    // Es un método estático por lo que no se puede Override
    public static void categoria(){
        System.out.println("Pertenezco a los instrumentos");
    }
    // Al marcar como final un método dinámico no se puede Override
    public final void noHagoNada(){
        System.out.println("No hago nada");
    }
    // Modificador de acceso por defecto, sólo para clases vecinas
    void queSoy(){
        System.out.print("Soy un instrumento ");
    }
}


