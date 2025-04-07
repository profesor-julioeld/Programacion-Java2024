package tema11.stream_flujosDatosBinario.Redes.cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Cliente {
  private Socket conexion;
  private BufferedReader entrada,consola;
  private BufferedWriter salida;
  public Cliente(String servidor,int puerto) {
    String mensaje,feedback;
	try {
	  System.out.println(" Intento conectarme al servidor");
	  conexion=new Socket(servidor,puerto);
	  System.out.println(" Estoy conectado ");
	  // Creo stream de comunicacion del socket
	  entrada=new BufferedReader(new InputStreamReader(conexion.getInputStream()));
	  consola=new BufferedReader(new InputStreamReader(System.in));
	  // Creo Stream de lectura de entrada estandar
	  salida=new BufferedWriter(new OutputStreamWriter(conexion.getOutputStream()));	
	  // Esto mejor desde un hilo
	  // Leo saludo
	  mensaje=entrada.readLine();
	  System.out.println(mensaje);
	  do {
		// Leo orden de entrada estandar
		mensaje=consola.readLine();
		// Mando orden a servidor
		salida.write(mensaje+"\n");
		salida.flush();
		// Recibo feedback
		feedback=entrada.readLine();
		System.out.println(feedback);
	  } while(!mensaje.equals("FIN"));
	  System.out.println(" Adiosssss");
	  conexion.close();
	} catch (Exception e){System.out.println("cagada");}
  }
}  
 
 