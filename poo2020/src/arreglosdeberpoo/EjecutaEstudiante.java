package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        //Declaración de la clase scanner
        Scanner teclado = new Scanner(System.in);
        //Declaración de variables
        int c = 1;
        String[] nombre= new String[5];
        int[] edad = new int[5];
        String[] uni = new String[5];
        String[] celular = new String[5];
        //Bucle para ingresar la información
        while (c<nombre.length){
            System.out.println("Ingrese su nombre:");
            nombre[c] = teclado.nextLine();
            System.out.println("Ingrese su edad");
            edad[c] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese las iniciales de la universidad que asiste");
            uni[c] = teclado.nextLine();
            System.out.println("Ingrese su número de celular");
            celular[c] = teclado.nextLine();
            c++;
        }
        // Creación del objeto est
        Estudiante est = new Estudiante();

        //Llamada de los métodos
        est.setNombre(nombre);
        est.setEdad(edad);
        est.setUni(uni);
        est.setCelular(celular);
        est.generarMensaje();


    }
}
