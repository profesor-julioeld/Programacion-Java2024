package tema9.Punto6ClasesAnonimas_Thread;

// Thread implementa Runnable
public class Hilo extends Thread{
	String name=null;
	public Hilo(String name) {
		this.name=name;
		setName(name);
	}
	@Override
	public void run() {
		int n=10;
		for (int i=0;i<n;i++) {
			System.out.println(" Soy el hilo "+getName()+ " escribo cada segundo valor="+i);
			try {sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
