package poliformismo_automotriz;

import java.util.Scanner;

public class EjecutaSueldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String mensaje = "Reporte de Nóminal Quincenal\nrfc\t \t \tNombre \t \t \tDepto \t \tPuesto \t \tSueldoQuincenal\n" +
                "_______________________________________________________________________";
        boolean bandera = true;
        boolean bandera2 = true;
        boolean bandera3 = true;
        while (bandera) {//While1: Repetidor de todo el ejecicio
            //Pretición de datos
            System.out.println("Seleccione el cargo que desenpeña:\n1.Administrativo,\n2.Vendedor,\n3.Mecánico");
            int select = teclado.nextInt();

            teclado.nextLine();

            System.out.println("Ingrese su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese su departamento");
            String dep = teclado.nextLine();
            System.out.println("Ingrese su cargo ");
            String cargo = teclado.nextLine();
            System.out.println("Ingrese su rfc");
            String rfc = teclado.nextLine();

            switch (select){
                case 1://Administrador
                    System.out.println("Ingrese su sueldo");
                    double sueldo = teclado.nextDouble();
                    //Creación del objeto admin
                    Admin admin = new Admin(sueldo, nombre,dep,cargo,rfc);
                    admin.calcularSueldo();
                    mensaje=String.format("%s\n%s\t \t %s\t \t %s\t \t \t%s\t \t \t %.2f",mensaje,admin.getRfc(),
                            admin.getNombre(),admin.getDepart(), admin.getPuesto(),admin.getQuincena());
                    teclado.nextLine();
                    break;

                case 2:
                    while (bandera2){
                        System.out.println("Ingrese el valor del auto vendido");
                        double precio = teclado.nextDouble();
                        System.out.println("Ingres el número de unidades vendidas");
                        double nVentas = teclado.nextDouble();

                        Vendedor ven = new Vendedor(precio,nVentas,nombre,dep,cargo,rfc);
                        ven.calcularSueldo();

                        teclado.nextLine();// Limpiardor de Scanner
                        System.out.println("Desea ingresar otro modelo vendido s/n");
                        String selecion2 = teclado.nextLine();
                        //Condiciónal para salir de la petición de vehículos
                        if (selecion2.equals("n")){
                            bandera2=false;
                        }
                        //Almacenamiento de información a imprimir
                        mensaje=String.format("%s\n%s\t \t %s\t \t %s\t \t \t%s\t \t \t %.2f",mensaje,ven.getRfc(),
                                ven.getNombre(),ven.getDepart(), ven.getPuesto(),ven.getQuincena());
                    }
                    break;
                case 3:
                    while (bandera3){
                        System.out.println("Ingrese el costo por el trabajo");
                        double precio = teclado.nextDouble();
                        System.out.println("Cuantas veces lo realizo??");
                        int nTrab = teclado.nextInt();

                        Mecanico mec = new Mecanico(nTrab,precio,nombre,dep,cargo,rfc);
                        mec.calcularSueldo();

                        teclado.nextLine();//Limpiador de Scanner
                        System.out.println("Desea ingresar otra transacción s/n");
                        String seleccion3 = teclado.nextLine();
                        if (seleccion3.equals("n")){//Condicional para salir del bucle
                            bandera3=false;
                            //Almacenamiento de la información a imprimir
                            mensaje=String.format("%s\n%s\t \t %s\t \t %s\t \t \t%s\t \t \t %.2f",mensaje,mec.getRfc(),
                                    mec.getNombre(),mec.getDepart(), mec.getPuesto(), mec.getQuincena());
                        }
                    }
                    break;
            }
            System.out.println("Desea ingresar otro empleado s/n");

            String seleccionFinal = teclado.nextLine();
            if (seleccionFinal.equals("n")){
                bandera=false;
            }
        }
        //Impresión de la variable que almacena información
        System.out.println(mensaje);
    }
}
