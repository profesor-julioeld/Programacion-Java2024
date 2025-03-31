package tema9.ejerciciosFinales;

public class Ejercicio2Tema9 {
    private static final int VECES=5;
    private static void saluda(String s,int veces){
        for (int i=1;i<=veces;i++){
            int espera=aleatorio(1,10);
            try {Thread.sleep(espera*1000);}
            catch (InterruptedException e) { e.printStackTrace();}
            System.out.printf("Ronda %d Espera %02d:%s\n",i,espera,s);
        }
    }

    private static int aleatorio(int n,int m){
        return (int)(Math.floor(Math.random()*(n-m+1)+m));
    }

    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            // CUIDADO: Dentro de la expresión lambda no existe hilo por ello recurrimos a
            // "Dame el nombre del hilo que ejecutará ésto"
            Thread hilo=new Thread(()->saluda(Thread.currentThread().getName(),VECES));
            hilo.setName("Soy Hilo "+i);
            hilo.start();
        }
    }
}
