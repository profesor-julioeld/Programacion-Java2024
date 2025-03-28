
package tema9.Punto9ComparableComparator.comparable.subclase;

import tema9.Punto1a5.animales.Animal;

import java.util.Objects;

/* Se trata de la misma clase que la del punto anterior a la que vamos a añadir
la funcionalidad de poder comparar objetos leon (Interfaz Comparable)
No va a ser tan sencillo como escribir implements y ya está ya que tiene ciertas peculiaridades
estudiémoslas:
  1) Se trata de una interfaz genérica por lo que hay que usar la notación Diamante <> para
  especificar el tipo de objeto con el que comparar (con el mismo que Leon), eso presenta ciertas
  ventajas:
            - Al no pasar Object no necesito hacer Cast para acceder a los atributos de un Leon
            - Compara Leon con Leon, si paso otro tipo se genera un error de compilación
  2) Muchas clases usan este Interfaz para tareas como sort (ejem: Arrays.sort) por lo que al definir
  como comparar también estamos diciendo cómo ordenar los objetos
  3) Si lees la documentación de la clase, verás que indica que si al comparar dos objetos obtienes un
  valor 0 (son iguales), tiene que ocurrir lo mismo con equals por lo que tendremos que override equals
  de Object
  4) Esto se complica porque se recomienda que dos objetos que los codifiques como iguales con equals,
  deberían devolver el mismo hashcode, sino habrá colecciones que no funcionen.
  5) Algunas colecciones usan hashcode para identificar rápidamente un objeto por lo que se recomienda
  que al codificar hashcode se obvien los atributos no identificadores centrándonos en elementos como
  el número de jaula
  6) El código de equals y hashcode lo he obtenido directamente con Generate/Equals & Hascode
  7) Si todavía no has vomitado, puedes ver cómo estoy usando la clase Objects (algo así como Arrays) y
  concretamente el método hashcode, si quieres ver algo curioso fíjate en los ... del método hash
  !!!! YA SABES QUE EN INFORMÁTICA TIRAS DE UN PADASTRO Y TE PELAS ENTERO ¡¡¡¡¡
 */
public class Leon extends Animal implements Comparable<Leon> {
    // ************************ AÑADIDO PARA COMPARABLE   **********************
    // Puede tener apodo pero no tiene por qué ser único
    // En cada jaula hay un solo León
    private String apodo;
    public Leon(int jaula,String apodo){
        this(jaula);
        this.apodo=apodo;
    }
    @Override
    public int compareTo(Leon o) {
        return this.jaula-o.jaula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Leon leon = (Leon) o;
        // Es lo mismo que usar hashcode pero con tolerancia a los nulos
        return Objects.hashCode(this)==Objects.hashCode(o);
        // return jaula == leon.jaula;
    }

    // Supongo que hay un sólo Leon por jaula
    @Override
    public int hashCode() {
        return jaula;
    }

    // ************************ CÓDIGO DEL PUNTO ANTERIOR **********************
    private int jaula;
    // Aunque no paso esos parámetros, sí inicializo los
    // atributos de Animal
    public Leon(int jaula){
        this.jaula=jaula;
        patas=4;
        velocidad=80; // Todos corren a la misma velocidad
        // Casi todos son salvajes
        domesticado=false;
    }

    public void setDomesticado(boolean domesticado){
        this.domesticado=domesticado;
    }
    @Override
    public String sonidoEnAccion() {
        return "!Grrrrr!";
    }
    // Me vale el sonido en reposo

    @Override
    public String toString() {
        return "Soy un León, corro a "+velocidad+"km/h\n"+
               "tengo "+patas+" patas \n"+
                // Añado esta línea para que salga el apodo
                (apodo==null?"":" Mi apodo es "+apodo+"\n")+
               "me puedes encontrar en la jaula "+jaula+"\n"+
                (domesticado?"Sí":"No")+" estoy domesticado\n"+
               "rugo así:"+sonidoEnAccion()+"\n"+
               "cuando duermo suena así:"+sonidoEnReposo()+"\n";
    }

}
