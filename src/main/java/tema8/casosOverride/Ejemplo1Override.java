package tema8.casosOverride;

public class Ejemplo1Override implements Cloneable {
    // No podemos cambiar el modificador de acceso por otro más débil por
    // lo que se queda como public
    @Override
    public String toString() {
        return super.toString();
    }
    // En la superclase está como protected, lo podemos cambiar a public
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
