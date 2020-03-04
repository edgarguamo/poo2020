package polimorfismo_poo;

import herencia_empleado.EmpleadoPorHora;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        double horas;
        double cuota;

        EmpleadoPorHoras2 empHora = new EmpleadoPorHoras2();

        Scanner teclado =new Scanner(System.in);

        System.out.println("Calculo sueldo quincenal empelado por horas");
        System.out.println("Ingrese horas trabajadas: ");
        empHora.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("Ingrese cuota por hora");
        empHora.setCuota_por_hora(teclado.nextDouble());

        empHora.calcularSueldoQna();

        EmpleadoAsalariados2 empA = new EmpleadoAsalariados2();

        System.out.println("Su sueldo es de: "+empHora.getSueldo());
        System.out.println("Cálculo de sueldo quincenal empleado asalariado");
        System.out.println("Ingrese su sueldo mensual: ");

        empA.setSueldo_mensual(teclado.nextDouble());
        empA.calcularSueldoQna();

        System.out.println("Su sueldo quincenal es: "+empA.getSueldo());
    }
}
