package matrizpoo;

import java.util.Scanner;

public class EjecutaSumaMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] vectorA= new int[3][3];
        int[][] vectorB= new int[3][3];

        for (int i= 0; i<vectorA.length; i++){
            for (int j = 0; j<vectorA.length;j++){
                System.out.println("Por favor ingrese los valores para la matriz A ");
                vectorA[i][j]= teclado.nextInt();
            }
        }
        for (int i= 0; i<vectorB.length; i++){
            for (int j = 0; j<vectorB.length;j++){
                System.out.println("Por favor ingrese los valores para la matriz B ");
                vectorB[i][j]= teclado.nextInt();
            }
        }

        SumaMatrices suma = new SumaMatrices();

        suma.setMatrizA(vectorA);
        suma.setMatrizB(vectorB);
        suma.sumaMatriz();
        System.out.println("Matriz A");
        suma.impresion(suma.getMatrizA());
        System.out.println("Matriz B");
        suma.impresion(suma.getMatrizB());
        System.out.println("Matriz c");
        suma.impresion(suma.obtenerSuma());
    }
}
