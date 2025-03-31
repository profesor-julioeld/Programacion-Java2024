package tema9.Punto9ComparableComparator.otrosAsuntosMetidosConCalzador.patronSingleton;

// No deja de ser un boceto, para que fuese funcional tendría que devolver una instancia
// de la factoria que protege ante la creación de varias instancias diferentes
public class Singleton {
    // Al ser static tendré una única copia
    private static Singleton INSTANCE=null;
    // Atributos propios de la instancia
    private static int valor=0;
    // Al ser privado no puedo usarlo por otra vía
    private Singleton() {
        System.out.println(" Creo la instancia del objeto");
    }
    private static void creaInstance() {
        INSTANCE=new Singleton();
        // Hay una sola copia de valor
        valor++;
    }
    public synchronized static Singleton getInstance() {
        if (INSTANCE==null) creaInstance();
        return INSTANCE;
    }
    // otros métodos de la clase
    @Override
    public String toString() {
        return "Objeto creado con valor "+valor;
    }

}