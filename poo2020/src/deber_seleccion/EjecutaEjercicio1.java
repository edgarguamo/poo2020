package deber_seleccion;

import java.util.Scanner;

public class EjecutaEjercicio1 {
    //Método Principal
    public static void main(String[] args) {
        // Creación de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        // Petición de datos
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

        //Creación del objeto
        Ejercicio1 promedio = new Ejercicio1();

        // Envio de información
        promedio.setNombre(nombre);
        promedio.setNota1(nota1);
        promedio.setNota2(nota2);
        promedio.setNota3(nota3);
        promedio.setNota4(nota4);

        //Llamada al método impresión del objeto promedio
        promedio.impresion();



    }
}
