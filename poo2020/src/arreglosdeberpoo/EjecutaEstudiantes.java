package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaEstudiantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c = 1;
        String[] nombre= new String[5];
        int[] edad = new int[5];
        String[] uni = new String[5];
        String[] celular = new String[5];

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

        Estudiantes est = new Estudiantes();
        est.setNombre(nombre);
        est.setEdad(edad);
        est.setUni(uni);
        est.setCelular(celular);

        est.generarMensaje();


    }
}
