package tema8.Punto5ClaseAbstracta.main;

import tema8.Punto5ClaseAbstracta.superclase.A;
import tema8.Punto5ClaseAbstracta.subclase.B;
import tema8.Punto5ClaseAbstracta.subclase.C;

public class UsoABC {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        System.out.println("Valor de x en la clase B"+b.getX());
        b.metodo1();
        b.metodo2();
        c.metodo1();
        c.metodo2();
        A a=b;
        a.metodo2(); // Dice que es B
        a=c;
        a.metodo2(); // Dice que es C
    }
}
