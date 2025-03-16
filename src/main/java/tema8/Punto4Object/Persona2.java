package tema8.Punto4Object;

import java.util.Objects;

// Ejemplo de uso/implementación toString y equals
public class Persona2 {

    private String nombre;
    private int edad;
    private double estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Persona2(String nombre, int edad, double estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }

    // Sobreescribo toString de Object
    @Override
    public String toString() {
        return "Persona2{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
    // No puedo cambiar el tipo de parámetro de Object a Persona2
    // porque de hacerlo no sería Override sino sobrecarga
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        // Tengo que hacer cast para poder acceder a los atributos y métodos de Persona2
        Persona2 persona2 = (Persona2) o;
        return edad == persona2.edad && Double.compare(estatura, persona2.estatura) == 0 && Objects.equals(nombre, persona2.nombre);
    }

}

