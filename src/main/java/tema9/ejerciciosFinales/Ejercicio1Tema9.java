package tema9.ejerciciosFinales;

public class Ejercicio1Tema9 {
    public static void main(String[] args) {
        Thread hilo=new Thread(()->{
            int i=0;
            while (true){
                // Si te molesta el warning Busy-waiting, puedes desactivarlo
                try {
                    Thread.sleep(1000);
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Transcurridos %d segundos\n",i);
            }
        });
        hilo.start();
    }
}
