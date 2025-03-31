package tema9.Punto6ClasesAnonimas_Thread;

public class ImplementaRunnable implements Runnable{
	@Override
	public void run() {
	  int n=10;
	  // En este caso no puedo usar sleep ni getName directamente porque pertenece a Thread
	  for (int i=0;i<n;i++) {
		  // MUY IMPORTANTE: Desde aquí no tengo acceso a Thread pero si se que este código lo
		  // ejecutará un hilo por ello uso Thread.currentThread para obtener la referencia del hilo
		  // que ejecutará este run
		  System.out.println(" Soy el hilo "+Thread.currentThread().getName()+ " escribo cada segundo valor="+i);
		  try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
	  }
	}

}
