package tema9.Punto6ClasesAnonimas_Thread;
/** El propósito es conseguir la funcionalidad de "ejecutar un hilo" con el menor
grado de acoplamiento posible. Lo ideal sería poner el código directamente en esta clase
sin depender de otras clases a las que estaríamos acoplados.
Si además conseguimos no escribir código redundante, mejor que mejor */
public class Inicio {

	public static void main(String[] args) {
		// CASO 1: Acoplado a clase Hilo, hilo no puedo hacer extend de otros
		/* Cada vez que quieras un hilo tienes que instanciar Hilo (que hereda de Thread)*/
		Hilo h1=new Hilo("CASO 1");
		h1.start();
		// CASO 2: Tenemos el mismo acoplamiento pero la clase ya puede hacer extend de otra
		/* Thread queda oculto dentro de la clase, interacción a través de métodos */
		ContieneHilo ch2=new ContieneHilo("CASO 2");
		ch2.arranca();
		// CASO 3: Nos traemos Thread a esta clase.
		/* Seguimos acoplados a otra clase aunque tenemos mayor libertad de interacción con Thread */
		ImplementaRunnable ir=new ImplementaRunnable();
		Thread t3=new Thread(ir);
		t3.setName("CASO 3");
		t3.start();
		// CASO 4: Usamos una clase anónima con lo que no tenemos que escribir otras clases
		/* Como pega decir que sobra código porque queda claro que el new se debe hacer de Runnable y
		el método sólo se puede llamar run al ser un interfaz funcional */
		// MUY IMPORTANTE: Fíjate la forma en la que hemos pasado el código del método run del interfaz
		// al final lo hemos hecho instanciando un objeto de una clase anónima que implementa el método
		// del interfaz. Es la forma que vamos a usar a partir de ahora pero un poco más corta al usar
		// expresiones lambda.
		Thread t4=new Thread(new Runnable() {
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
		t4.setName("CASO 4");
		t4.start();
		// CASO 5: Este es para nota, se trata de caso 4 eliminando todo lo superfluo al usar una expresión lambda
		/* Podría añadir los hilos que quisiera sin tener que escribir otras clases y aquí mismo.*/
		Thread t5=new Thread(() -> {
			  int n=10;
			  for (int i=0;i<n;i++) {
				System.out.println(" Soy el hilo "+Thread.currentThread().getName()+ " escribo cada segundo valor="+i);
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			  }
		});
		t5.setName("CASO 5");
		t5.start();
	}

}
