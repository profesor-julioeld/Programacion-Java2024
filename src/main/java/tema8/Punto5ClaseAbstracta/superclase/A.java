package tema8.Punto5ClaseAbstracta.superclase;

public abstract class A {
    // Aunque una clase abstracta no se puede instanciar tiene su constructor
    // por defecto e incluso se puede codificar.
    public A(){
        System.out.println("Clase abstracta A");
    }
    private int x=1;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void metodo1(){
        System.out.println("método 1 definido en A");
    }

    // Cambia a protected y fíjate en el error en UsoABC
    public abstract void metodo2();

}
