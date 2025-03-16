package tema8.Punto5ClaseAbstracta.subclase;

import tema8.Punto5ClaseAbstracta.superclase.A;

public class B extends A {
    // En el menú del IDE saldrá en generate/Implementar
    // En este caso no sobreescribimos sino implementamos
    @Override
    public void metodo2() {
        System.out.println("Método 2 implementado en B");
    }
}
