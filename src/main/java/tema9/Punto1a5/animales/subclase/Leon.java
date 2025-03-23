
package tema9.Punto1a5.animales.subclase;

import tema9.Punto1a5.animales.Animal;

// Están en un Zoológico
public class Leon extends Animal {
    private int jaula;
    // Aunque no paso esos parámetros, sí inicializo los
    // atributos de Animal
    public Leon(int jaula){
        this.jaula=jaula;
        patas=4;
        velocidad=80; // Todos corren a la misma velocidad
        // Casi todos son salvajes
        domesticado=false;
    }

    public void setDomesticado(boolean domesticado){
        this.domesticado=domesticado;
    }
    @Override
    public String sonidoEnAccion() {
        return "!Grrrrr!";
    }
    // Me vale el sonido en reposo

    @Override
    public String toString() {
        return "Soy un León, corro a "+velocidad+"km/h\n"+
               "tengo "+patas+" patas \n"+
               "me puedes encontrar en la jaula "+jaula+"\n"+
                (domesticado?"Sí":"No")+" estoy domesticado\n"+
               "rugo así:"+sonidoEnAccion()+"\n"+
               "cuando duermo suena así:"+sonidoEnReposo()+"\n";
    }
}
