package tema9.Punto6ClasesAnonimas_Thread;

public class ImplementaRunnable implements Runnable{
	@Override
	public void run() {
	  int n=10;
	  // En este caso no puedo usar sleep ni getName directamente porque pertence a Thread
	  for (int i=0;i<n;i++) {
		System.out.println(" Soy el hilo "+Thread.currentThread().getName()+ " escribo cada segundo valor="+i);
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
	  }
	}

}
