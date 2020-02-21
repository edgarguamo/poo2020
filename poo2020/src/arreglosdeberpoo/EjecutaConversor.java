package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaConversor {
    public static void main(String[] args) {

        String codigo;
        int c = 0;
        // Declaración de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        //Petición de información
        System.out.println("Ingrese el número binario a transformar");
        codigo = teclado.nextLine();
        //Proceso para transformar una cadena a un arreglo de enteros
        int longitud=codigo.length();
        char[] aux = codigo.toCharArray();

        int[] binario = new int [longitud];
        while (c < binario.length){
            binario[c] =  Character.getNumericValue(aux[c]);
            c++;
        }
        //Envio de información
        longitud = longitud-1;
        Conversor con = new Conversor();
        con.setLongitud(longitud);
        con.setCadena(codigo);
        con.setBinario(binario);
        con.generalDecimal();
        con.mensaje();
    }
}
