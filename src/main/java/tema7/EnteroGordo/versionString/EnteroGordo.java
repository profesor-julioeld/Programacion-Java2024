package tema7.EnteroGordo.versionString;

/**
 * Es la creación de un entero capaz de almacenar 170 dígitos.
 * Con las operaciones multiplicar un entero.
 */
public class EnteroGordo implements Cloneable{
    //Los números se almacenan en un String al revés para hacer coincidir las unidades
    private String contenido;
    /**
     * Crea un EnteroGordo con el entero pasado.
     * @param i Cualquier valor entero
     */
    public EnteroGordo(int i) {
        StringBuilder aux=new StringBuilder(i+"");
        contenido=aux.reverse().toString();
    }

    public EnteroGordo(EnteroGordo e) {
        // Aunque todo el mundo se ha quedado muy agusto con esta solución realmente
        // puede darnos problemas ya que hemos hecho una copia superficial del objeto (mala idea)
        this.contenido=e.contenido;
        // Como se trata de un objeto inmutable no tiene mayor importancia pero en caso mutable sí
        // una copia profunda podría ser (aunque no tiene mucho sentido)
        // this.contenido=new String(e.contenido);
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
        // Aquí me planteo clonar el objeto this, plateo varias opciones
        // descomenta la que quieras probar
        // Opción A)
        //EnteroGordo e=new EnteroGordo(this);
        // Opción B)
        EnteroGordo e= null;
        try {
            e = (EnteroGordo) this.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
        for (int i = 1; i < n; i++) { //comienza en 1 porque si no suma una de más
            this.suma(e);
        }

    }

    /**
     * @return Objeto clonado
     * @throws CloneNotSupportedException En caso de que no se implemente Cloneable
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Suma este enteroGordo al pasado como parámetro
     * @param e enteroGordo a sumar
     */
    public void suma(EnteroGordo e) {
        // Podemos apreciar que la elección de String como contenido no fue muy buena
        // hubiera sido mejor usar un StringBuilder
        String res="";
        int acarreo=0,suma=0;
        for (int i=0;i<Math.max(e.contenido.length(),this.contenido.length());i++){
            int op1=i<this.contenido.length()?Character.getNumericValue(this.contenido.charAt(i)):0;
            int op2=i<e.contenido.length()?Character.getNumericValue(e.contenido.charAt(i)):0;
            suma=op1+op2+acarreo;
            acarreo=suma>9?1:0;
            suma=suma>9?suma-10:suma;
            res+=suma;
        }
        if (acarreo>0) res+=acarreo;
        // Cambio el contenido del objeto
        this.contenido=res;
    }

    @Override
    public String toString() {
        return "EnteroGordo{" +
                "contenido='" + new StringBuilder(contenido).reverse() + '\'' +
                '}';
    }
}
