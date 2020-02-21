package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        // Declaración de la clase scanner
        Scanner teclado = new Scanner(System.in);

        int[] cedula = new int[10];
        // Petición de datos
        System.out.println("Por favor inserte la cedula a certificar");
        String cedulaCad = teclado.nextLine();
        //Proceso para transformar una cadena en una lista de enteros
        char[] aux = cedulaCad.toCharArray();
        int c= 0;
        int limite = cedula.length-1;
        while (c<=limite){
            cedula[c] = Character.getNumericValue(aux[c]);
            c++;
        }
        //Creación de l objeto ced
        Cedula ced = new Cedula();

        //Llamada de métodos
        ced.setCedula(cedula);
        ced.validarCedula();
        ced.generarMensaje();

    }
}
