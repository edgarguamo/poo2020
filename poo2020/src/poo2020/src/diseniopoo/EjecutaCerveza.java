package diseniopoo;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de La Cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de Cerveza");
        String tipo = teclado.nextLine();
        System.out.println("Precio de la cerveza");
        Double precio = teclado.nextDouble();
        System.out.println("N'umero de unidades vendidas");
        Integer unidadesVendidas = teclado.nextInt();


        Cerveza c = new Cerveza(precio, unidadesVendidas, nombre, tipo);

        c.presentar();

        System.out.println("Total Ventas: $"+c.totalVentas(c.getPrecio(),c.getUnidadesVendidas()));

        /*
        Cerveza c2 = new Cerveza(1.50, 120, "Pilsener Tradicional", "Personal");

        Cerveza c3 = new Cerveza(1.00,50,"Pislener","Light");

        Double totalVentas = c.totalVentas(c.getPrecio(),c.getUnidadesVendidas())+
                c2.totalVentas(c2.getPrecio(),c2.getUnidadesVendidas())
                +c3.totalVentas(c3.getPrecio(),c3.getUnidadesVendidas());

        System.out.println("El costo total generado por ventas es de: "+totalVentas);
        */
    }
}
