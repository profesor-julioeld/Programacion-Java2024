package tema8.Punto1a3.superclase;
/* MUY IMPORTANTE: No hace falta crear un constructor si no vas a pasar parámetros.
Java crea lo que se llama un constructor por defecto pero si añades uno manualmente
con una serie de parámetros, se desactiva el constructor por defecto por lo que si
necesitas un contructor sin parámetros, tendrás que añadirlo a mano */
public class Persona {
    // Lo normal es que sean privadas y se accedan via setter/getter
    public String nombre;
    public int edad;
    public double estatura;
    public Persona(){
        System.out.println("Llamada al constructor sin parámetros de Persona");
    }
    public Persona(String nombre,int edad,double estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }
    public void mostrarDatos(){
        System.out.println("Datos de Persona:");
        System.out.println("\tnombre = " + nombre);
        System.out.println("\tedad = " + edad);
        System.out.println("\testatura = " + estatura);
    }
}
