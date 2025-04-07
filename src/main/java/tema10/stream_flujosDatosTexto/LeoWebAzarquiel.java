package tema10.stream_flujosDatosTexto;

import java.io.*;
import java.net.*;
public class LeoWebAzarquiel {
  public static void main(String[] args) {
    URL url=null;
    try {
      url=new URL("http://www.ies-azarquiel.es");
    } catch (MalformedURLException e) {System.out.println(e);}
    
    BufferedReader in;
    try {
      InputStream inputStream= url.openStream();
      in = new BufferedReader (new InputStreamReader(inputStream));
      String inputLine;
      int i=1;
      while ((inputLine=in.readLine())!=null)
    	  System.out.println("linea recibida nº "+i+++"->"+inputLine);
      in.close();
    } catch (IOException e) {System.out.println(e); }
  }
}
