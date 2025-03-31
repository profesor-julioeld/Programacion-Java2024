package tema9.ejerciciosFinales.Ejercicio3Tema9.clases;

import java.time.LocalDate;
//import java.util.Date; No usaremos más Date salvo que nos obliguen

// Se trata de un copiar/pegar de la factura del tema7 pero cambiando el campo fecha
// de Date a LocalDate (tienes un documento en Drive que explica el por qué)

public class Factura implements AutoCloseable{

    private static int cuantas=0;
    private static int idMax=0;

    private final int id;

    private char serie;
    private int numero;
    private String year;
    // CAMBIO: De Date a LocalDate
    private LocalDate fecha;
    private double total;

    public Factura(){
        Factura.cuantas++; // Creo una factura más
        Factura.idMax++; // id que le toca
        this.id=Factura.idMax; // MI: Aunque es final, en el constructor se puede inicializar
    }

    public Factura(String numFactura){
        this();
        this.setNumFactura(numFactura);
    }

    public int getId() {
        return id;
    }


    public String getNumFactura() {
        return year+"/"+serie+"/"+String.format("%05d",numero);
    }

    /**
     * El formato de la factura tiene que ser
     * 2025/A/00001
     * @param numFactura factura a cargar
     */
    public void setNumFactura(String numFactura) {
        // No hago por ahora control de errores
        String[] trozitos=numFactura.split("/");
        year=trozitos[0];
        serie=trozitos[1].charAt(0);
        numero=Integer.parseInt(trozitos[2]);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static int getCuantas() {
        return cuantas;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", numFactura=" + year+"/"+serie+"/"+numero +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }

    @Override
    public void close() throws Exception {
        Factura.cuantas--;
    }
}
