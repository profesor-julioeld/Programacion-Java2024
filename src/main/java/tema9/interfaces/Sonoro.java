package tema9.interfaces;
// Para crear un Interface desde este IDE seleccionamos Java Class y
// desde allí Interface
// No se pueden instanciar al igual que pasa con las clases abstractas
// Definen funcionalidades comunes, en este caso "que pueden generar sonido"
public interface Sonoro {
    // Un atributo es de tipo public, static y final por defecto
    // Prueba a ponerlos y verás como el IDE te dice que son redundantes
    int version=1;
    // NOTA: Aquí no se pueden poner constructor como en la clase abstracta
    // MÉTODOS ABSTRACTOS: Los no implementados
    // - Son public por defecto (si lo pones te dice que es redundante)
    // - Sólo pueden ser public
    // - Son abstractos por defecto (si lo pones te dice que es redundante)
    // - Se tiene que implementar por obligación en las subclases
    String sonidoEnAccion();
    // MÉTODOS DE EXTENSIÓN: Los que sí están implementados
    // - pueden ser static (no se permite override) o no (se permite override)
    // - pueden ser public (para todo el mundo) o private (sólo para la clase)
    // - SUBTIPOS:
    //      METODO POR DEFECTO: son dinámicos (se pueden override), y públicos aunque no lo ponga
    //      defino un comportamiento que se puede override o reutilizar
    default String sonidoEnReposo(){
        // No emiten sonido en reposo por defecto
        return "No hay sonido";
    }
    //      METODO ESTÁTICO PUBLICO: son estáticos (no se pueden override),
    //      No hace falta poner public, es redundante
    //      Definen comportamiento común no override
    static boolean generasSonido(){
        // Usa un metodo de apoyo para su codificación
        return respuestaCierta();
    }
    //      METODO PRIVADO: Son métodos auxiliares de apoyo al resto de métodos con código de
    //      la interfaz, pueden ser static o no. Si pongo static sólo se puede usar desde otro static
    //      Borra static y verás que te da error la llamada a este metodo desde generasSonido
    private static boolean respuestaCierta(){
        return true;
    }
}
