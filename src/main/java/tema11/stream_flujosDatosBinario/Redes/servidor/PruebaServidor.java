
package tema11.stream_flujosDatosBinario.Redes.servidor;
public class PruebaServidor {
	public static void main(String[] args) {
		// Tienes que pasar la IP local del equipo que recibirá los mensajes
		// Y el puerto TCP para el que añadiremos una excepción en el cortafuegos
		Servidor s=new Servidor("127.0.0.7",5000);
	}
}
