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


    }
}
