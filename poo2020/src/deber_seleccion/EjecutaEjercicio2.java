package deber_seleccion;

import disenio_seleccion.Empleado;

import java.util.Scanner;

public class EjecutaEjercicio2 {
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
        Ejercicio2 sueldo = new Ejercicio2();

        sueldo.setNombre(nombre);
        sueldo.setHoras(horas);
        sueldo.setCuota(cuota);


        //Llamada del método impresion del objeto sueldo
        sueldo.impresion();
    }
}
