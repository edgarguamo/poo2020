package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el número del día");
        int num = teclado.nextInt();

        Dia dia = new Dia();
        dia.setNum(num);

        System.out.println(dia.calcularDia());
    }
}
