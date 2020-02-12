package disenio_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el número de horas trabajadas");
        int horas = teclado.nextInt();
        System.out.println("Ingresel el valor por hora");
        double cuota = teclado.nextDouble();

        Empleado sueldo = new Empleado(nombre,horas,cuota,0);

        sueldo.impresion();
    }
}
