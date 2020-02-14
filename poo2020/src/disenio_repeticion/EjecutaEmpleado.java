package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de hora:");
        double pph = teclado.nextDouble();
        boolean bandera = true;
        do {
            teclado.nextLine();
            System.out.println("Ingrese el nombre del empleado");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el número de horas trabajadas");
            int horasTra = teclado.nextInt();

            Empleado sueldo = new Empleado(nombre, horasTra);
            sueldo.setPph(pph);
            sueldo.calculaSueldo();
            System.out.println("Nombre:"+nombre+"\nSueldo: "+sueldo.getSueldo());
            System.out.println("Si desea calcular otro sueldo presione s caso contrario" +
                    "presione n");
            teclado.nextLine();
            String repeticion = teclado.nextLine();
            if (repeticion.equals("n")){
                bandera = false;
            }
        }while (bandera);

    }
}
