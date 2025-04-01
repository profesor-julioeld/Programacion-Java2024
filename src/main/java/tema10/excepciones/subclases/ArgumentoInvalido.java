package tema10.excepciones.subclases;

// Hasta ahora hemos lanzado estas excepciones usando otras de tipo
// RuntimeError (Tablero del tema5) , en esta ocasión usaremos
// Check Exception de usuario
public class ArgumentoInvalido extends Exception{
    public ArgumentoInvalido(String message) {
        super(message);
    }
    public ArgumentoInvalido(){
        super();
    }
}
