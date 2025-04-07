package tema11.stream_flujosDatosBinario.Redes.servidor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
// Si quieres que te funcione este programa tendrás que añadir una excepción al cortafuegos
public class Servidor {
  private ServerSocket servidor;
  private Socket conexion;
  private BufferedReader entrada,consola;
  private BufferedWriter salida;
  private InetAddress remoto;
  public Servidor(String equipo,int puerto) {
    String mensaje;
	try {
	  // esperando a ser atendidos máximo 10
	  //servidor=new ServerSocket(PUERTO,10);
	  servidor = new ServerSocket(puerto,10,InetAddress.getByName(equipo));
	  // Puede haber varios accept 
	  System.out.println("acepto llamadas 2");
	  conexion=servidor.accept();
	  remoto=conexion.getInetAddress();
	  System.out.println(" conexión realizada con "+remoto.getHostAddress());
	  // Creo stream de comunicacion del socket
	  entrada=new BufferedReader(new InputStreamReader(conexion.getInputStream()));
	  salida=new BufferedWriter(new OutputStreamWriter(conexion.getOutputStream()));	
	  // Creo Stream de lectura de entrada estandar
	  consola=new BufferedReader(new InputStreamReader(System.in));
	  // Saludo inicial al cliente
 	  salida.write("Hola cliente con IP "+remoto.getHostAddress()+"\r\n");
	  salida.flush();
	  // Esto mejor desde un hilo
	  do {
		// Leo mensaje del cliente
		mensaje=entrada.readLine();
		// actúo en función del mensaje
		System.out.println(" El mensaje recibido fue " + mensaje);
		// Mando feedback
		salida.write("OK"+"\r\n");
		salida.flush();
	  } while(!mensaje.equals("FIN"));
	  System.out.println(" Adiosssss");
	  conexion.close();
	  servidor.close();
	} catch (Exception e){System.out.println("cagada");}
  }
  
  
  
  
  
}
 
