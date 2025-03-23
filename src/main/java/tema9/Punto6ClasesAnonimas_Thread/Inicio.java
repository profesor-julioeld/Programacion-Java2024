package tema9.Punto6ClasesAnonimas_Thread;

public class Inicio {

	public static void main(String[] args) {
		// CASO 1
		ImplementaRunnable ir=new ImplementaRunnable();
		Thread t1=new Thread(ir);
		t1.start();
		// CASO 2
		Hilo h2=new Hilo("CASO 2");
		h2.start();
		// CASO 3
		Thread t3=new Thread(new Runnable() {
			@Override
			public void run() {
			  int n=10;
			  // En este caso no puedo usar sleep ni getName directamente porque pertence a Thread
			  for (int i=0;i<n;i++) {
				System.out.println(" Soy el hilo "+Thread.currentThread().getName()+ " escribo cada segundo valor="+i);
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			  }
			}
		});
		t3.start();
		// CASO 4: Ya es un poco avanzado ya que usamos una expresión Lambda
		Thread t4=new Thread(() -> {
			  int n=10;
			  for (int i=0;i<n;i++) {
				System.out.println(" Soy el hilo "+Thread.currentThread().getName()+ " escribo cada segundo valor="+i);
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			  }
		});
		t4.start();

	}

}
