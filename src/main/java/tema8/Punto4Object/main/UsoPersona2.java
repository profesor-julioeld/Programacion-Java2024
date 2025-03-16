package tema8.Punto4Object.main;

import tema8.Punto1a3.subclase.Empleado;
import tema8.Punto4Object.Persona2;

public class UsoPersona2 {
    public static void main(String[] args) {
        Persona2 p2= new Persona2("Sancho",25,1.80);
        // Uso de la versión sobreescrita de toString
        System.out.println("p2 = " + p2);
        // Uso de equals
        Persona2 p3=new Persona2("Sancho",25,1.60);
        System.out.println(p3.equals(p2));
    }
}
