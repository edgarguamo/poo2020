package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Estudiante> est = new ArrayList<Estudiante>();
        System.out.println("Sistema de ingreso de Estudiantes");
        boolean bandera = true;

        do {
            System.out.println("digite 1 para agregar otro estudiante");
            System.out.println("Digite 2 para presentar");
            System.out.println("Digite 3 para salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    Estudiante estud = new Estudiante();
                    System.out.println("Ingrese nombre");
                    estud.setNombre(teclado.nextLine());
                    System.out.println("Ingrese cedula");
                    estud.setCedula(teclado.nextLine());
                    System.out.println("Ingrese edad");
                    estud.setEdad(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Ingrese carrera");
                    estud.setCarrera(teclado.nextLine());
                    System.out.println("Ingrese correo");
                    estud.setCorreo(teclado.nextLine());

                    est.add(estud);
                    break;
                case 2:
                    for (Estudiante estudiant: est){
                        System.out.println("_________________________________");
                        System.out.println("Nombre: "+ estudiant.getNombre());
                        System.out.println("Cedula: "+ estudiant.getCedula());
                        System.out.println("Edad: "+ estudiant.getEdad());
                        System.out.println("Carrera: "+ estudiant.getCarrera());
                        System.out.println("Correo"+estudiant.getCorreo());
                        System.out.println("__________________________________");
                    }
                    break;
                case 3:
                    bandera=false;
                    break;
                default:
                    System.out.println("Opción incorrecta ");

            }
        }while (bandera);
    }
}
