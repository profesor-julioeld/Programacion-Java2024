package tema9.Punto1a5.motor;

import tema9.Punto1a5.interfaces.Sonoro;

import java.util.ArrayList;
import java.util.List;

public class Nombrador extends Thread{
    private int segundos;
    private List<Sonoro> lista=new ArrayList<Sonoro>();
    public Nombrador(int segundos){
        this.segundos=segundos;
        start();
    }
    public void add(Sonoro s){
        lista.add(s);
    }

    @Override
    public void run() {
        for (int i=1;i<segundos;i++){
            try {sleep(1000);} catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" VUELTA Nº "+i);
            // Uso de foreach y expresion lambda
            //lista.forEach(System.out::println);
            for(Sonoro s:lista)
                System.out.println(s);
        }
    }
}
