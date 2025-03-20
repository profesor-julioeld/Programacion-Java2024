package tema8.Punto1a3.main;

import tema8.Punto1a3.subclase.Cliente;
import tema8.Punto1a3.subclase.Empleado;
import tema8.Punto1a3.superclase.Persona;

public class UsoPersonaEmpleado {
    public static void main(String[] args) {
        Empleado e=new Empleado("Sancho",25,1.80,1725.49);
        Cliente c=new Cliente("Pedro",50,1.60,"C0001");
        System.out.println(e.nombre); // Muestra atributo heredado
        System.out.println(e.salario); // Muestra atributo propio
        Persona p=e; // Un empleado es también una persona
        // PREGUNTA: Es lo mismo usar p o e?
        // RESPUESTA: La respuesta es NO (pero tiene sorpresa)
        // Sólo serán accesibles los miembros visibles en Persona
        System.out.println("PROBAMOS: Miembros específicos de Empleado desde p");
        //p.soyEmpleado(); // Da error al ser de empleado
        ((Empleado)p).soyEmpleado(); // Este sí funciona, ¿Por qué?
        //System.out.println(p.salario); // Da error al ser de empleado
        System.out.println("PROBAMOS: Miembros específicos de Empleado desde e");
        e.soyEmpleado();
        System.out.println(e.salario);
        // Obviamos el uso de atributos ocultados en subclases
        System.out.println("PROBAMOS: Métodos sobreescritos desde p");
        // Misma forma p.mostrarDatos(), distinto comportamiento
        p.mostrarDatos();
        p=c; // Un Cliente también es una persona
        p.mostrarDatos();
        System.out.println("PROBAMOS: Métodos sobreescritos desde e");
        e.mostrarDatos();
        c.mostrarDatos();
        // Pueden Observar que en los dos casos se ejecuta el sobreescrito
        // se denomina selección dinámica de método y es una de las bases del
        // polimorfismo

        Empleado e2=new Empleado(); // Llamo al constructor sin parámetros
    }
}
