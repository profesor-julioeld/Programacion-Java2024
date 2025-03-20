package tema9.animales.subclase;

import tema9.animales.Animal;

// No dejo extend de esta clase
public final class Perro extends Animal {
    String nombre;
    // Aunque no paso parámetros, sí inicializo los
    // atributos de Animal
    public Perro(String nombre,int velocidad){
        this.nombre=nombre;
        patas=4;
        this.velocidad=48;
        domesticado=true;
    }
    @Override
    public String sonidoEnAccion() {
        return "!Guauuu-Guauuu!";
    }

    @Override
    public String sonidoEnReposo() {
        return "guauauauua-guauauauua";
    }

    @Override
    public String toString() {
        return  "Soy un perro, corro a "+velocidad+"km/h\n"+
                "tengo "+patas+" patas \n"+
                "me llamo "+nombre+"\n"+
                (domesticado?"Sí":"No")+" estoy domesticado\n"+
                "ladro así:"+sonidoEnAccion()+"\n"+
                "cuando duermo suena así:"+sonidoEnReposo()+"\n";
    }
}
