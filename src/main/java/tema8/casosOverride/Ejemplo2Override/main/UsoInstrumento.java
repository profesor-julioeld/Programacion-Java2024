package tema8.casosOverride.Ejemplo2Override.main;

import tema8.casosOverride.Ejemplo2Override.Guitarra;
import tema8.casosOverride.Ejemplo2Override.Instrumento;
import tema8.casosOverride.Ejemplo2Override.Violin;

public class UsoInstrumento {
    public static void main(String[] args) {
        Guitarra g=new Guitarra();
        Violin v=new Violin();
        // Uso correcto de método estático
        Instrumento.categoria();
        // g.queSoy();  // No se puede usar porque es protected
        v.queSoy();
    }
}
