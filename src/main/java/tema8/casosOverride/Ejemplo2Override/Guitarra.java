package tema8.casosOverride.Ejemplo2Override;

// La subclase hereda en este caso los métodos con modificador de acceso por defecto
public class Guitarra extends Instrumento {
    // No puedo extender un método estático, si lo descomentas da error
    /*@Override
    static void categoria(){};*/
    // Aquí podríamos cambiar el modificador de acceso por protected o public
    @Override
    protected void queSoy() {
        // Uso el método de la superclase
        super.queSoy();
        System.out.println(" de tipo Guitarra");
    }
}