package tema8.Punto5ClaseAbstracta.superclase;

public abstract class A {
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
