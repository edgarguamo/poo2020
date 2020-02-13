package deber_seleccion;

import java.util.Scanner;
// Método Principal
public class EjecutaEjercicio3 {
    public static void main(String[] args) {
        // Creacion de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        // Peticion de datos
        System.out.println("Ingrese el primer número");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        int num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto número");
        int num4 = teclado.nextInt();

        //Creación del objeto
        Ejercicio3 selectNum = new Ejercicio3();

        // Envio de datos al objeto
        selectNum.setNum1(num1);
        selectNum.setNum2(num2);
        selectNum.setNum3(num3);
        selectNum.setNum4(num4);
        selectNum.numMayor();

        //Impresion de los datos
        System.out.println(selectNum.getNumMayor());
    }
}
