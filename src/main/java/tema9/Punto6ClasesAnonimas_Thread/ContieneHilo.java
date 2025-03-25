package tema9.Punto6ClasesAnonimas_Thread;

// Thread implementa Runnable
public class ContieneHilo implements Runnable{
	private String name=null;
	private Thread hilo;
	public ContieneHilo(String name) {
		this.name=name;
		hilo=new Thread(this);
		hilo.setName(name);
	}
	public void arranca(){
		hilo.start();
	}
	@Override
	public void run() {
		int n=10;
		for (int i=0;i<n;i++) {
			System.out.println(" Soy el hilo "+hilo.getName()+ " escribo cada segundo valor="+i);
			try {hilo.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
