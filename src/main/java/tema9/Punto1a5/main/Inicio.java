package tema9.Punto1a5.main;

import tema9.Punto1a5.animales.subclase.Leon;
import tema9.Punto1a5.animales.subclase.Perro;
import tema9.Punto1a5.instrumentos.subclase.Piano;
import tema9.Punto1a5.instrumentos.subclase.Violin;
import tema9.Punto1a5.motor.Nombrador;

import static java.lang.Thread.sleep;


public class Inicio {
    public static void main(String[] args) {
        Perro per1=new Perro("Manolo",12);
        Violin vio1=new Violin("Stradivarius");
        Leon leo1=new Leon(3);
        Piano pia1=new Piano("Casio",16);
        Nombrador n=new Nombrador(10);
        n.add(per1);
        // Una pregunta interesante: Por qué puedo llamar al método sleep
        // de Thread si no lo he heredado?
        // La respuesta la tienes en este mismo tema en el package importstatic
        try {sleep(2000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        n.add(vio1);
        n.add(leo1);
        n.add(pia1);
    }
}
