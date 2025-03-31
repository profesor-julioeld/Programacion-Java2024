package tema9.Punto9ComparableComparator.otrosAsuntosMetidosConCalzador.patronSingleton.test;
// MUY IMPORTANTE: Esta clase no debería estar aquí sino en test
// de esa forma no afectará al proyecto ni siquiera si está mal codificado
// es lo que deberíamos hacer desde ahora que lo sabemos

import tema9.Punto9ComparableComparator.otrosAsuntosMetidosConCalzador.patronSingleton.Singleton;

public class TestSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Esto generá error
        // Singleton s=new Singleton();
        // Éste es el uso correcto, s1 y s2 referencian al mismo objeto
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        // No podemos hacer una copia con Clone
        //Singleton s3=s2.clone();
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2);
        System.out.println(s2.hashCode());
    }
}
