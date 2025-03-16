package tema7.EnteroGordo.versionStringBuilder;

/**
 * Es la creación de un entero capaz de almacenar 170 dígitos.
 * Con las operaciones multiplicar un entero.
 */
public class EnteroGordo {
    //Los números se almacenan en un StringBuilder al revés para hacer coincidir las unidades
    private StringBuilder contenido;
    /**
     * Crea un EnteroGordo con el entero pasado.
     * @param i Cualquier valor entero
     */
    public EnteroGordo(int i) {
        StringBuilder aux=new StringBuilder(i+"");
        contenido=aux.reverse();
    }

    public EnteroGordo(EnteroGordo e) {
        // Aquí claramente se ve que esta copia superficial no es solución ya que
        // ambos EnterosGordo tendrían el mismo contenido mutable y cuando se cambiase el de uno
        // se reflejaría el cambio en el otro
        //this.contenido=e.contenido;
        // Esta es una forma de hacer copia profunda
        this.contenido=new StringBuilder(e.contenido);
    }


    /**
     * Crea un nuevo entero gordo resultado de este EnteroGordo multiplicado por n.
     * @param n Valor a multiplicar
     * @return Resultado devuelto
     */
    public EnteroGordo multiplica(int n) {
        EnteroGordo aux=new EnteroGordo(0);
        for (int i=0; i<n; i++) {
            aux.suma(this);
        }
        return aux;
    }

    // segunda versión de multiplica

    /**
     * Segunda versión de multiplica, en este caso he añadido un segundo parámetro para
     * poder distinguir entre las dos versiones
     * @param n Valor por el que multiplicar
     * @param b Pasando true o false usamos la segunda versión
     */
    public void multiplica(int n,boolean b){
        // Uso sólo constructor y no clone
        EnteroGordo e=new EnteroGordo(this);
        for (int i = 1; i < n; i++) { //comienza en 1 porque si no suma una de más
            this.suma(e);
        }

    }

    /**
     * Suma este enteroGordo al pasado como parámetro
     * @param e enteroGordo a sumar
     */
    public void suma(EnteroGordo e) {
        // Podemos apreciar que la elección de String como contenido no fue muy buena
        // hubiera sido mejor usar un StringBuilder
        int acarreo=0,suma=0;
        for (int i=0;i<Math.max(e.contenido.length(),this.contenido.length());i++){
            int op1=i<this.contenido.length()?Character.getNumericValue(this.contenido.charAt(i)):0;
            int op2=i<e.contenido.length()?Character.getNumericValue(e.contenido.charAt(i)):0;
            suma=op1+op2+acarreo;
            acarreo=suma>9?1:0;
            suma=suma>9?suma-10:suma;
            if (i<this.contenido.length()) this.contenido.setCharAt(i,Character.forDigit(suma,10));
            else this.contenido.append(suma);
        }
        if (acarreo>0) this.contenido.append(acarreo);
    }

    @Override
    public String toString() {
        return "EnteroGordo{" +
                "contenido='" + new StringBuilder(contenido).reverse() + '\'' +
                '}';
    }
}
