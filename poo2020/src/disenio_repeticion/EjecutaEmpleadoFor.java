package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de empleados que se va a calcular");
        int nEmpleados = teclado.nextInt();
        System.out.println("Ingrese el valor de hora:");
        double pph = teclado.nextDouble();
        String mensaje = "";
        for (int i= 0; i< nEmpleados; i =i+1) {
            teclado.nextLine();
            System.out.println("Ingrese el nombre del empleado");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el número de horas trabajadas");
            int horasTra = teclado.nextInt();

            Empleado sueldo = new Empleado(nombre, horasTra);
            sueldo.setPph(pph);
            sueldo.calculaSueldo();
            mensaje = String.format(("%sNombre:"+nombre+"\nSueldo: "+sueldo.getSueldo()+("\n\n")), mensaje);
        }
        System.out.println(mensaje);

    }
}
