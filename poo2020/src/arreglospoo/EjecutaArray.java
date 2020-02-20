package arreglospoo;

import java.util.Scanner;

public class EjecutaArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=1;
        int vectorB[] = new int[10];
        int vectorA[] = new int[10];
        String mensaje = "";
        mensaje = String.format("%s La sumatoria entre los productos de los vector A ", mensaje);
        while (c<=vectorA.length){
            System.out.println("Ingrese el valor "+ c+" del vector A");
            vectorA[c] = teclado.nextInt();
            mensaje = String.format("%s" + vectorA[c]+", ", mensaje);
            c++;
        }
        c= 1;
        mensaje= String.format("%s y vector B ", mensaje);
        while (c<=vectorB.length){
            System.out.println("Ingrese el valor "+ c+"del vector B");
            vectorB[c] = teclado.nextInt();
            mensaje = String.format("%s" + vectorB[c]+", ", mensaje);
            c++;
        }

        Array array = new Array();
        array.setVectorA(vectorA);
        array.setVectorB(vectorB);
        array.calcularSumatoria();

        System.out.println(mensaje+" es :"+array.getSumatoria_producto());



    }
}
