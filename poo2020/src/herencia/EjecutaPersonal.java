package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {
        //Creación de objeto de la clase estudiante

        //definición  de variables
        String nombre, identificacion, estado_civil,carrera, area, dependencia;
        String fecha_nac;
        int select;

        //Creación de la clase Scanner
        Scanner teclado = new Scanner(System.in);

        //Selección de cargo
        System.out.println("Eliga el cargo que cumple en la universidad:\n1. Estudiante\n2. Docente \n3.Administrativ");
        select= teclado.nextInt();
        switch (select){//Switch para acceder a la información
            case 1:
                System.out.println("Creación de objeto estudiante");
                teclado.nextLine();
                System.out.println("Ingrese su nombre");
                nombre = teclado.nextLine();
                System.out.println("Ingrese su identificación");
                identificacion = teclado.nextLine();
                System.out.println("Ingrese su carrera");
                carrera=teclado.nextLine();
                System.out.println("Ingrese estado civil");
                estado_civil = teclado.nextLine();
                System.out.println("Ïngrese Fecha de nacimiento");
                fecha_nac = teclado.nextLine();
                Estudiante est = new Estudiante(carrera,nombre,estado_civil,fecha_nac,identificacion);

                System.out.println("\n \n----------------------------------------");
                System.out.println("Datos de objeto estudiante");
                System.out.println("Nombre: "+est.getNombre());
                System.out.println("Identificación: "+est.getIdentificacion());
                System.out.println("Carrera: "+est.getCarrera());
                System.out.println("Estado Civil: "+est.getEstado_civil());
                System.out.println("Fecha de nacimiento: "+est.getFecha_nac());
                break;
            case 2:
                System.out.println("Creación de objeto Docente");
                teclado.nextLine();
                System.out.println("Ingrese su nombre");
                nombre = teclado.nextLine();
                System.out.println("Ingrese su identificación");
                identificacion = teclado.nextLine();
                System.out.println("Ingrese su área");
                area=teclado.nextLine();
                System.out.println("Ingrese estado civil");
                estado_civil = teclado.nextLine();
                System.out.println("Ïngrese Fecha de nacimiento");
                fecha_nac = teclado.nextLine();

                Docente doc = new Docente(nombre,identificacion,area,fecha_nac,estado_civil);

                System.out.println("\n \n----------------------------------------");
                System.out.println("Datos de objeto Docente");
                System.out.println("Nombre: "+doc.getNombre());
                System.out.println("Identificación: "+doc.getIdentificacion());
                System.out.println("Carrera: "+doc.getArea());
                System.out.println("Estado Civil: "+doc.getEstado_civil());
                System.out.println("Fecha de nacimiento: "+doc.getFecha_nac());
                break;
            case 3:
                System.out.println("Creación de objeto Administrativo");
                teclado.nextLine();
                System.out.println("Ingrese su nombre");
                nombre = teclado.nextLine();
                System.out.println("Ingrese su identificación");
                identificacion = teclado.nextLine();
                System.out.println("Ingrese su dependencia");
                dependencia=teclado.nextLine();
                System.out.println("Ingrese estado civil");
                estado_civil = teclado.nextLine();
                System.out.println("Ïngrese Fecha de nacimiento");
                fecha_nac = teclado.nextLine();

                Administrativo admin = new Administrativo(nombre,identificacion,dependencia,fecha_nac,estado_civil);
                System.out.println("\n \n----------------------------------------");
                System.out.println("Datos de objeto Administrativo");
                System.out.println("Nombre: "+admin.getNombre());
                System.out.println("Identificación: "+admin.getIdentificacion());
                System.out.println("Carrera: "+admin.getDependencia());
                System.out.println("Estado Civil: "+admin.getEstado_civil());
                System.out.println("Fecha de nacimiento: "+admin.getFecha_nac());
                break;
        }//Fin switch








    }
}
