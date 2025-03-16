package tema8.Punto1a3.subclase;

import tema8.Punto1a3.superclase.Persona;

public class Empleado extends Persona {
    public double salario;
    // CUIDADO: Cuando se instancia un empleado, antes lo hace una persona
    // si definimos este constructor, aunque no llamemos al constructor por defecto
    // (el que no tiene parámetros), el sistema lo hará por nosotros
    public Empleado(){
        System.out.println("Llamada al constructor sin parámetros de Empleado");
        // No pongo ninguna llamada tipo super() pero lo hará el sistema por nosotros
    }
    public Empleado(String nombre,int edad,double estatura,double salario){
        super(nombre,edad,estatura);
        this.salario=salario;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("\tDatos de Empleado");
        System.out.println("\t\tsalario = " + salario);
    }
    // Método específico de Empleado
    public void soyEmpleado(){
        System.out.println("Soy empleado");
    }
}
