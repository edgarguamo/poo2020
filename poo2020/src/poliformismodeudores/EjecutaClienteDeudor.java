package poliformismodeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variable que contebdra la información a imprimir
        System.out.println("Bienvenido a la calculadora electronica para inversionistas del Banco del Pacífico\n");
        boolean bandera = true;
        int c = 1;
        int tamanioMonto;
        String mensaje = "Reporte de Deudores\n" +
                "No.Cliente\t \tNombre\t \tNo.Cuenta \t \tInteres a pagar" +
                "\n_________________________________________________________\n";
        while(bandera) {//Bucle 1
            //Petición de datos
            System.out.println("Ingrese su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese su número de cuenta");
            int numCuenta = teclado.nextInt();

            System.out.println("Por favor seleccione el tipo de cuenta que posee:" +
                    "\n1.Prestamo automotriz de\n2.Prestamo Hipotecario\n3.Prestamo Personal");
            int selecCuenta = teclado.nextInt();
            System.out.println("A continucación ingrese el monto inicial:");
            double capitalPres = teclado.nextDouble();
            System.out.println("Posteriormente, ingrese el interes anual");
            double tazaInt = teclado.nextDouble();
            System.out.println("Finalmente Ingrese la cantidad de meses que tiene el prestamo:");
            int meses = teclado.nextInt();

            switch (selecCuenta){
                case 1:
                    PrestamoAuto pa = new PrestamoAuto(nombre,numCuenta,c,capitalPres,tazaInt,meses);
                    pa.calcularDeuda();
                    //Almacenamiento de información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t \t%d\t \t \t \t%.2f\n",
                            mensaje,pa.getNumCliente(),pa.getNombre(),pa.getNumCuenta(),pa.getTotalPagar());
                    break;
                case 2:
                    PrestamoHipotecario ph = new PrestamoHipotecario(nombre,numCuenta,c,capitalPres,tazaInt,meses);
                    ph.calcularDeuda();
                    //Almacenamiento de la información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t \t%d\t \t \t \t%.2f\n",
                            mensaje,ph.getNumCliente(),ph.getNombre(),ph.getNumCuenta(),ph.getDeuda());
                    break;
                case 3:
                    PrestamoPersonal pp = new PrestamoPersonal(nombre,numCuenta,c,capitalPres,tazaInt,meses);
                    pp.calcularDeuda();
                    //almacenamiento de información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t \t%d\t \t \t \t%.2f\n",
                            mensaje,pp.getNumCliente(),pp.getNombre(),pp.getNumCuenta(),pp.getDeuda());
                    break;
            }
            c=c+1;
            teclado.nextLine();
            //Petición para salir del bucle 1
            System.out.println("Desea ingresar otra cuenta? s/n");
            String salida=teclado.nextLine();
            if (salida.equals("n")) {
                bandera = false;
            }
        }
        c = c-1;
        //Impresión de la infomración
        System.out.println(mensaje+"\nTotal "+c+" Deudores");
    }

}
