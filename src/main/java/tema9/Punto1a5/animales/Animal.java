package tema9.Punto1a5.animales;

import tema9.Punto1a5.interfaces.Sonoro;

// Se refiere a Animales con patas y que corren
public abstract class Animal implements Sonoro {
    // Las subclases podrán modificarlos
    protected int patas;
    protected int  velocidad;
    protected boolean domesticado=false;
    // Dejo la implementación de sonido en acción y en reposo
    // a cada animal (por eso pongo abstract)
    // NOTA: Recuerda que en este caso no es necesario
    @Override
    public abstract String sonidoEnAccion();

    // Este es el comportamiento por defecto aunque se puede
    // override
    @Override
    public String sonidoEnReposo(){
        return "grrrrrrrrr";
    };

    // No permite override de ninguno de éstos
    public final int getPatas(){
        return patas;
    }
    public final int getVelocidad(){
        return velocidad;
    }
    public final boolean getDomesticado(){
        return domesticado;
    }
}
