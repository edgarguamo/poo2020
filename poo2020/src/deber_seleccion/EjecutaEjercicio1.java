package deber_seleccion;

import java.util.Scanner;

public class EjecutaEjercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la primera nota:");
        double nota1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota:");
        double nota2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera nota:");
        double nota3 = teclado.nextDouble();
        System.out.println("Ingrese la cuarta nota:");
        double nota4 = teclado.nextDouble();

        Ejercicio1 promedio = new Ejercicio1();
        promedio.setNombre(nombre);
        promedio.setNota1(nota1);
        promedio.setNota2(nota2);
        promedio.setNota3(nota3);
        promedio.setNota4(nota4);

        promedio.impresion();



    }
}
