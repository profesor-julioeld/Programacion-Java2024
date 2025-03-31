package tema9.ejerciciosFinales.Ejercicio3Tema9;

import tema9.ejerciciosFinales.Ejercicio3Tema9.clases.Factura;

import java.time.LocalDate;

public class UsoFactura {
    public static void main(String[] args) {
        Factura f1=new Factura("2025/A/00001");
        f1.setTotal(2345.56);
        // LocalDate usa patrón Factory, lo siguiente da error
        //LocalDate fecha=new LocalDate();
        // Su creación pasa por métodos estáticos de la clase
        f1.setFecha(LocalDate.now());
        // Creo la siguiente factura 5 días después
        Factura f2=new Factura("2025/A/00002");
        f2.setTotal(4555.33);
        f2.setFecha(f1.getFecha().plusDays(5));
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }
}
