package tema8.casosOverride.Ejemplo2Override;

public class Violin extends Instrumento {
    // Si descomentas te da error, un método final no se puede override
    /*@Override
    void noHagoNada(){
        System.out.println();
    }*/
    // Aquí cambiamos el modificador a public
    @Override
    public void queSoy() {
        // Uso el método de la superclase
        super.queSoy();
        System.out.println(" de tipo Violin");
    }
}
