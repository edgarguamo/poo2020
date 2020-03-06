package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        int contador;
        int opcion;
        Estudiante[]  estudiantes = new Estudiante[3];
        Estudiante estudiante;

        for (contador=0;contador<estudiantes.length;contador++){
                Estudiante est = new Estudiante();
                System.out.println("Ingrese nombre: ");
                est.setNombre(teclado.nextLine());
                System.out.println("Ingrese cédula: ");
                est.setCedula(teclado.nextLine());
                System.out.println("Ingrese edad: ");
                est.setEdad(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Ingrese carrera: ");
                est.setCarrera(teclado.nextLine());
                System.out.println("Ingrese correo: ");
                est.setCorreo(teclado.nextLine());
                //envio de información
                estudiantes[contador]=est;
                //obtención de los valores que contiene
                //el tipo de dato Estudiante
        }
        System.out.println("Lista de estudiantes");
        System.out.println("Cédula\tNombre");
        int edadacum=0;
        for (int i = 0; i<estudiantes.length; i++){
            System.out.println(estudiantes[i].getCedula()+"\t"+estudiantes[i].getNombre());
            edadacum=edadacum + estudiantes[i].getEdad();
        }
        System.out.println("Edad promedio Estudiantes "+(edadacum/estudiantes.length));

        System.out.println("Fin del programa");
    }
}
