package poliformismoinversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        //Declaración de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        //Variable que almacenara la información
        System.out.println("Bienvenido a la calculadora electronica para inversionistas del Banco del Pacífico\n");
        boolean bandera = true;
        int c = 1;
        int tamanioMonto;
        String mensaje = "Reporte de Inversores\n" +
                "No.Cliente\t \tNombre\t \tNo.Cuenta \t \tInteres Ganado   " +
                "\n_________________________________________________________\n";
        while(bandera) {//While 1: Bucle central
            //Petición de información
            System.out.println("Ingrese su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese su número de cuenta");
            int numCuenta = teclado.nextInt();

            System.out.println("Por favor seleccione el tipo de cuenta que posee:" +
                    "\n1.Cuenta de Ahorros\n2.Cuenta Maestra\n3.Pagaré");
            int selecCuenta = teclado.nextInt();
            System.out.println("A continucación ingrese el monto inicial:");
            double capitalInv = teclado.nextDouble();
            System.out.println("Finalmente seleccione el tiempo que dejara el dinero:\n1.1 mes\n2.2meses\n3.3 meses" +
                    "\n4.6 Meses\n5.1Anio");
            int posicion = teclado.nextInt();
            posicion = posicion - 1;

            switch (selecCuenta) {
                case 1:
                    if (capitalInv > 1000 && capitalInv < 4000) {
                        tamanioMonto = 1;
                    } else if (capitalInv >= 4000 && capitalInv < 20000) {
                        tamanioMonto = 2;
                    } else if (capitalInv >= 20000 && capitalInv < 100000) {
                        tamanioMonto = 3;
                    } else if (capitalInv >= 100000 && capitalInv < 500000) {
                        tamanioMonto = 4;
                    } else tamanioMonto = 5;

                    CuentaAhorro cah = new CuentaAhorro(nombre,numCuenta,c
                            ,capitalInv,posicion,tamanioMonto);
                    cah.calcularGanacia();
                    //almacenamiento de información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t%d\t \t \t%.2f\n",
                            mensaje,cah.getNumCliente(),cah.getNombre(),cah.getNumCuenta(),cah.getGanancia());
                    break;
                case 2:
                    if (capitalInv>1000 && capitalInv<4000){
                        tamanioMonto = 1;
                    }else if (capitalInv>=4000 && capitalInv<20000){
                        tamanioMonto=2;
                    }else if (capitalInv>=20000 && capitalInv<100000) {
                        tamanioMonto = 3;
                    }else if (capitalInv>=100000 && capitalInv<500000){
                        tamanioMonto = 4;
                    }else tamanioMonto=5;

                    Pagare pag = new Pagare(nombre,numCuenta,c,capitalInv
                            ,posicion,tamanioMonto);
                    pag.calcularGanacia();
                    //alamacenamiento de la información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t%d\t \t \t%.2f\n",
                            mensaje,pag.getNumCliente(),pag.getNombre(),pag.getNumCuenta(),pag.getGanancia());
                    break;
                case 3:
                    if (capitalInv>=1000 && capitalInv<4000){
                        tamanioMonto = 1;
                    }else if (capitalInv>=4000 && capitalInv<20000){
                        tamanioMonto=2;
                    }else if (capitalInv>=20000 && capitalInv<100000) {
                        tamanioMonto = 3;
                    }else if (capitalInv>=100000 && capitalInv<500000){
                        tamanioMonto = 4;
                    }else tamanioMonto=5;

                    CuentaMaestra master = new CuentaMaestra(nombre,numCuenta,c,capitalInv
                            ,posicion,tamanioMonto);
                    master.calcularGanacia();
                    //almacenamiento de la información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t%d\t \t \t%.2f\n",
                            mensaje, master.getNumCliente(),master.getNombre(),master.getNumCuenta(),master.getGanancia());
                    break;
            }
            c=c+1;
            teclado.nextLine();
            //Petición para salir del bucle 1
            System.out.println("Desea ingresar otra cuenta? s/n");
            String salida=teclado.nextLine();
            if (salida.equals("n")){
                bandera=false;
            }
        }
        c = c-1;
        //Impresión de la información
        System.out.println(mensaje+"\nTotal: "+c+" Inversores");
    }
}
