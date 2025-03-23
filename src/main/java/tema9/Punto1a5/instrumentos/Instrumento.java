package tema9.Punto1a5.instrumentos;

import tema9.Punto1a5.interfaces.Sonoro;

public abstract class Instrumento implements Sonoro {
    // Sólo lo voy a cambiar en el constructor
    private final String fabricante;
    // Una clase abstracta puede tener un constructor
    // esto obliga a que los hijos llamen a ese constructor en caso de tener parámetros
    public Instrumento(String fabricante){
        this.fabricante=fabricante;
    }
    // No dejo que mis hijos lo override
    public final String getFabricante(){
        return fabricante;
    }
    // Dejo la implementación de sonido en acción a cada instrumento
    // por eso pongo abstract
    // NOTA: No es necesario, lo pongo por entender mejor lo que pasa
    @Override
    public abstract String sonidoEnAccion();
    // Como no hay sonido en reposo, no sobreescribo el metodo sonidoEnReposo
    // pero no quiero que lo override mis hijos por eso pongo final
    // NOTA: Un metodo final no se puede override
    @Override
    public final String sonidoEnReposo() {
        return Sonoro.super.sonidoEnReposo();
    }

    // Es un método estático por lo que no se puede Override
    public static String categoria(){
        return "Pertenezco a los instrumentos";
    }

    // Que cada instrumento diga qué es
    public abstract String queSoy();

    @Override
    public String toString() {
        return  queSoy()+"\n"+
                "me fabricó " + getFabricante()+"\n"+
                "cuando me tocan sueno "+sonidoEnAccion()+"\n";
    }
}


