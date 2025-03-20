package tema9.instrumentos.subclase;

import tema9.instrumentos.Instrumento;

public class Violin extends Instrumento {
    public Violin(String fabricante) {
        super(fabricante);
    }
    // Implemento sonidoEnAccion de Sonoro
    @Override
    public String sonidoEnAccion() {
        return "ñiii-ñiii";
    }
    // Implemento queSoy de Instrumento
    @Override
    public String queSoy() {
        return "Soy un Violín";
    }
}
