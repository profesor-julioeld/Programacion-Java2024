package tema9.instrumentos.subclase;

import tema9.instrumentos.Instrumento;

public class Piano extends Instrumento {
    private final int teclas;
    public Piano(String fabricante,int teclas) {
        super(fabricante);
        this.teclas=teclas;
    }
    public int getTeclas(){
        return teclas;
    }

    // Implemento sonidoEnAccion
    @Override
    public String sonidoEnAccion() {
        return "plin-plin";
    }

    @Override
    public String queSoy() {
        return "Soy un piano";
    }
}