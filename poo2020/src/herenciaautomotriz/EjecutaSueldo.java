package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaSueldo {
    public static void main(String[] args) {//Método principal
        //Declaración de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        //Mensaje que se imprimira al final
        String mensaje = "Reporte de Nóminal Quincenal\nrfc\t \tNombre \t \tDepto \t \tPuesto \t \tSueldoQuincenal\n" +
                "______________________________________________________________";
        boolean bandera = true;
        boolean bandera2 = true;
        boolean bandera3 = true;
        while (bandera) {//While1: Repetidor de todo el ejecicio
            //Pretición de datos
            System.out.println("Seleccione el cargo que desenpeña:\n1.Administrativo,\n2.Vendedor,\n3.Mecánico");
            int select = teclado.nextInt();

            Sueldo su = new Sueldo();
            teclado.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese su departamento");
            String dep = teclado.nextLine();
            System.out.println("Ingrese su cargo ");
            String cargo = teclado.nextLine();
            System.out.println("Ingrese su rfc");
            String rfc = teclado.nextLine();

            switch (select) {
                case 1://Administrador
                    System.out.println("Ingrese su sueldo");
                    double sueldo = teclado.nextDouble();
                     //Creación del objeto admin
                    Admin admin = new Admin();
                    //Envio de información
                    admin.setNombre(nombre);
                    admin.setDepart(dep);
                    admin.setPuesto(cargo);
                    admin.setRfc(rfc);
                    admin.setSueldo(sueldo);
                    admin.calcularQuincena();
                    //Alamacenamiento de la información
                    mensaje=String.format("%s\n%s\t \t %s\t \t %s\t \t \t%s\t \t \t %.2f",mensaje,admin.getRfc(),
                            admin.getNombre(),admin.getDepart(), admin.getPuesto(),admin.getQuincena());
                    teclado.nextLine();
                    break;
                case 2://vendedor

                    while(bandera2) {//Para ingresar más vehículos e incrementar el sueldo
                        //Creación dol objeto vendedor
                        Vendedor ven = new Vendedor();
                        //Petición de información
                        System.out.println("Ingrese el valor del auto vendido");
                        ven.setPrecio(teclado.nextDouble());

                        System.out.println("Ingrese el número de unidades vendidas");
                        ven.setnVentas(teclado.nextInt());
                        //Envio de información al objeto
                        ven.setNombre(nombre);
                        ven.setDepart(dep);
                        ven.setPuesto(cargo);
                        ven.setRfc(rfc);
                        ven.calcularQuincena();

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
                case 3://Mecánico

                    while (bandera3){//Ciclo para ingresar más trabajos
                        //Creación del objeto mec
                        Mecanico mec = new Mecanico();
                        //Petición de variables
                        System.out.println("Cuántas veces ha realizado el trabajo?");
                        mec.setnTrab(teclado.nextInt());
                        System.out.println("Cuanto fue la cuota por trabajo?");
                        mec.setPrecio(teclado.nextDouble());
                        //Envio de información
                        mec.setNombre(nombre);
                        mec.setDepart(dep);
                        mec.setPuesto(cargo);
                        mec.setRfc(rfc);
                        mec.sueldoMec();

                        teclado.nextLine();//Limpiador de Scanner
                        System.out.println("Desea ingresar otra transacción s/n");
                        String seleccion3 = teclado.nextLine();
                        if (seleccion3.equals("n")){//Condicional para salir del bucle
                            bandera3=false;
                            //Almacenamiento de la información a imprimir
                            mensaje=String.format("%s\n%s\t \t %s\t \t %s\t \t \t%s\t \t \t %.2f",mensaje,mec.getRfc(),
                                    mec.getNombre(),mec.getDepart(), mec.getPuesto(), mec.getSueldo());
                        }

                    }
                break;
            }

            //condicional para salir del bucle principal
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
