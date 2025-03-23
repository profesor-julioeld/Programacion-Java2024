package tema9.importstatic.clases;

// Esta clase como tiene todo static se la considera static pero no
// se pone static, es es para otro tipo de clases (internas)
public class EstaticaDos {
    // Esto sería una constante
    public final static int MAX=2;
    // Método estático
    public static String giro(String a){
        return new StringBuilder(a).reverse().toString();
    }
}
