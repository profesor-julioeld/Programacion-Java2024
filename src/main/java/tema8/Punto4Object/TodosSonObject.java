package tema8.Punto4Object;

public class TodosSonObject {
    public static void main(String[] args) {
        String s="Hola";
        Integer i=1;
        StringBuilder sb=new StringBuilder("Adios");
        int[] array={1,2,3,4,5};
        // Como todos los objetos son de tipo object, puedes poner como tipo Parámetro Object
        // y pasar lo que quieras
        imprimo(s);
        imprimo(i);
        imprimo(sb);
        imprimo(array);
    }

    // Este método recibe un object e imprimo su contenido
    // para el caso del array no saldría bien ya que no dispone de toString
    // podríamos poner un case para que se imprimiera bien
    private static void imprimo(Object o){
        Class subclase=o.getClass();
        // Obtiene la clase de la que hereda con un extends si no pone ninguna sería Object
        Class superclase=subclase.getSuperclass();
        System.out.println(" Clase actual :"+subclase.getName());
        System.out.println(" SuperClase   :"+superclase.getName());
        System.out.println(o);
    }

}
