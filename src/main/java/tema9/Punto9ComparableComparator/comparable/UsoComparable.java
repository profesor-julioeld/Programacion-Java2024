package tema9.Punto9ComparableComparator.comparable;

import tema9.Punto1a5.animales.Animal;
// CUIDADO: Tienes que importa el León del Punto9
import tema9.Punto9ComparableComparator.comparable.subclase.Leon;

// El IDE no se complica, como estamos haciendo varios import del mismo sitio, pone * y listo
import java.util.*;

public class UsoComparable {
    public static void main(String[] args) {
        Animal a1=new Leon(3,"Tigretón");
        Animal a2=new Leon(3);
        Animal a3=new Leon(6);
        // SI DESCOMENTAS ESTA LÍNEA Y LA DE ADD DA ERROR
        // sólo hemos definido comparación de leones
        // Animal a4=new Perro("mimoso",30);
        // PRIMERO: Con un array simplón
        Animal animales1[]=new Animal[3];
        animales1[0]=a1;
        animales1[1]=a2;
        animales1[2]=a3;
        // animales1[3]=a4;
        Arrays.sort(animales1);
        System.out.println(" LISTA 1 ");
        for (Animal a:animales1){
            System.out.println("******* LEON *******");
            System.out.println(a);
        }
        // Si te encuentras con ganas, sólo un pincelada del tema de Colecciones
        // SEGUNDO: Con algo más evolucionado, un Array List de Leones
        List<Leon> leones = new ArrayList<>();
        leones.add((Leon)a1);
        leones.add((Leon)a2);
        leones.add((Leon)a3);
        // Aquí uso un Comparator para decir que ordene normal
        // MUY IMPORTANTE: Fíjate cómo he obviado las llaves ya que no hacen falta, total no
        // he escrito mas que ese método
        leones.sort((a,b)->a.compareTo(b));
        // Con éste sería al reves
        //leones.sort((a,b)->(-a.compareTo(b)));
        // Y esté es para nota, como en el cuerpo estamos llamando a un único método
        // podemos simplificar el código anterior con un Method Reference de la siguiente forma
        //leones.sort(Leon::compareTo);
        System.out.println(" LISTA 2 ");
        for (Animal a:leones){
            System.out.println("******* LEON *******");
            System.out.println(a);
        }
        // TERCERO: Y por último con un Set (conjunto)
        Set<Animal> animales3 = new HashSet<>();
        animales3.add(a1);
        animales3.add(a2);
        animales3.add(a3);
        System.out.println(" LISTA 3 ");
        // NOTA: Fíjate que sólo sale una vez para jaula 3
        // Es el efecto de la codificación de hashcode y equals
        for (Animal a:animales3){
            System.out.println("******* LEON *******");
            System.out.println(a);
        }
    }

}
