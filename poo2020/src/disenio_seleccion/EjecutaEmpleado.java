package disenio_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    //Método Principal
    public static void main(String[] args) {
        //Declaración del Scannaer
        Scanner teclado = new Scanner(System.in);
        //Petición de variables
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el número de horas trabajadas");
        int horas = teclado.nextInt();
        System.out.println("Ingresel el valor por hora");
        double cuota = teclado.nextDouble();

        //Creación objeto
        Empleado sueldo = new Empleado(nombre,horas,cuota);

        //Llamada del método impresion del objeto sueldo
        sueldo.impresion();
    }
}
