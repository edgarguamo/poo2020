package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    //Método principal
    public static void main(String[] args) {
        //Declaración de variables
        int select;
        String nom;
        String cargo;
        String depen;
        Scanner teclado = new Scanner(System.in);
        //Petición de datos
        System.out.println("Generador del suedo\nIngrese su nombre:");
        nom = teclado.nextLine();
        System.out.println("Ingrese su cargo:");
        cargo = teclado.nextLine();
        System.out.println("Ingrese su dependencia: ");
        depen = teclado.nextLine();
        //Selección para el swtich
        System.out.println("Por favor selecione una opció:\n1.Sueldo por hora" +
                "\n2.Sueldo asalariado");
        select = teclado.nextInt();
        teclado.nextLine();
        switch (select){//Switch para calcular el sueldo
            case 1:
                System.out.println("Ingrese el número de horas trabajadas");
                int horas= teclado.nextInt();
                System.out.println("Ingrese el valor por hora");
                double valorHora = teclado.nextDouble();

                EmpleadoPorHora emp = new EmpleadoPorHora(nom,cargo,depen,horas,valorHora);

                System.out.println("-------------------------------------------------");
                System.out.println("Nombre:" +emp.getNombre());
                System.out.println("Cargo: "+ emp.getCargo());
                System.out.println("Dependencia: " + emp.getDependencia());
                System.out.println("Sueldo: "+ emp.calcualrSueldoPorHora());
                break;
            case 2:
                System.out.println("Ingrese el valor de su sueldo");
                double sueldo = teclado.nextDouble();
                EmpleadoAsalariado empA = new EmpleadoAsalariado(nom,cargo,depen,sueldo);
                System.out.println("-------------------------------------------------");
                System.out.println("Nombre:" +empA.getNombre());
                System.out.println("Cargo: "+ empA.getCargo());
                System.out.println("Dependencia: " + empA.getDependencia());
                System.out.println("Sueldo: "+ empA.getValor_mensual());
                break;
        }//Fin Swtich
    }
}
