package tema8.Punto1a3.subclase;

import tema8.Punto1a3.superclase.Persona;

public class Cliente extends Persona {
    public String numCliente;

    public Cliente(String nombre,int edad,double estatura,String numCliente){
        super(nombre,edad,estatura);
        this.numCliente=numCliente;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("\tDatos de Cliente");
        System.out.println("\t\tnumero = " + numCliente);
    }
}
