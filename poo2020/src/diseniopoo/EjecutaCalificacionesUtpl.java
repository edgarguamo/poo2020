package diseniopoo;

import java.util.Scanner;

public class EjecutaCalificacionesUtpl {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Estudiante: ");
        String nombre = teclado.nextLine();
        System.out.println("Nombre de la Asignatura");
        String asig = teclado.nextLine();
        System.out.println("Calificación Bimestre Uno: ");
        double cali1 = teclado.nextDouble();
        System.out.println("Calificiación Bimestre Dos: ");
        double cali2 = teclado.nextDouble();

         CalifcacionesUtpl cali = new CalifcacionesUtpl(nombre,asig,cali1,cali2,"");

        cali.caliMensaje();
    }
}
