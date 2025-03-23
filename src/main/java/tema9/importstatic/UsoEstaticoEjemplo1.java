package tema9.importstatic;

// El IDE resuelve la referencia a MAX y giro con un import static
// es sólo para los miembros estáticos y no se necesita cualificar
// la llamada con el nombre de la clase (pondremos directamente MAX)
// Así problemas cero (recuerda que hay dos MAX)
import static tema9.importstatic.clases.EstaticaDos.giro;
import static tema9.importstatic.clases.EstaticaUno.MAX;

/* Este código tiene como único propósito recalcar que podemos usar
los miembros estáticos de una clase sin poner el nombre de la clase,
se introdujo en Java 1.5 para mejorar la legibilidad pero ten cuidado
porque te puedes encontrar con errores inesperados */
public class UsoEstaticoEjemplo1 {
    public static void main(String[] args) {
        System.out.println(MAX);
        System.out.println(giro("Hola"));
    }
}
