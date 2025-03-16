package tema7.EnteroGordo.versionString.main;

import tema7.EnteroGordo.versionString.EnteroGordo;

public class UsoEnteroGordo {
    public static void main(String[] args) {
        EnteroGordo e=factorial(100);
        System.out.println(e);
    }

    private static EnteroGordo factorial(int n) {
        if (n==0) return new EnteroGordo(1);
        return factorial(n-1).multiplica(n);
    }

}
