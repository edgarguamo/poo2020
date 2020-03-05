package herenciainversionistas;

import java.util.Scanner;

public class EjecutaInversionsta {
    public static void main(String[] args) {//Método principal
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
            posicion =posicion-1;
            //Creación del objeto inv
            Inversionista inv = new Inversionista();

            switch (selecCuenta) {
                case 1://Cuenta de ahorros
                    //emvio de información
                    CuentaAhorro cah = new CuentaAhorro();
                    cah.setNombre(nombre);
                    cah.setNumCuenta(numCuenta);
                    cah.setNumCliente(c);
                    cah.setCapitalInv(capitalInv);
                    cah.setPlazoInv(posicion);
                    //Condicional para seleccionar el arreglo con los intereses
                    if (capitalInv>1000 && capitalInv<4000){
                        tamanioMonto = 1;
                    }else if (capitalInv>=4000 && capitalInv<20000){
                        tamanioMonto=2;
                    }else if (capitalInv>=20000 && capitalInv<100000) {
                        tamanioMonto = 3;
                    }else if (capitalInv>=100000 && capitalInv<500000){
                        tamanioMonto = 4;
                    }else tamanioMonto=5;

                    cah.setTamanioMonto(tamanioMonto);

                    cah.calcularGanancia();
                    //almacenamiento de información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t%d\t \t \t%.2f\n",
                            mensaje,cah.getNumCliente(),cah.getNombre(),cah.getNumCuenta(),cah.getGanancia());
                    break;
                case 2://Pagares
                    //Creación de la clase pag
                    Pagare pag = new Pagare();
                    //envio de información
                    pag.setNombre(nombre);
                    pag.setNumCuenta(numCuenta);
                    pag.setNumCliente(c);
                    pag.setCapitalInv(capitalInv);
                    pag.setPlazoInv(posicion);
                    //Condicional para selecionar el arreglo con los intereses
                    if (capitalInv>1000 && capitalInv<4000){
                        tamanioMonto = 1;
                    }else if (capitalInv>=4000 && capitalInv<20000){
                        tamanioMonto=2;
                    }else if (capitalInv>=20000 && capitalInv<100000) {
                        tamanioMonto = 3;
                    }else if (capitalInv>=100000 && capitalInv<500000){
                        tamanioMonto = 4;
                    }else tamanioMonto=5;

                    pag.setTamanioMonto(tamanioMonto);
                    pag.calcularGanancia();
                    //alamacenamiento de la información
                    mensaje = String.format("%s\t \t%d\t \t%s\t \t%d\t \t \t%.2f\n",
                            mensaje,pag.getNumCliente(),pag.getNombre(),pag.getNumCuenta(),pag.getGanancia());
                    break;

                case 3://Cuenta Maestra
                    //Creación del objeto master
                    CuentaMaestra master = new CuentaMaestra();
                    //Envio de la información
                    master.setNombre(nombre);
                    master.setNumCuenta(numCuenta);
                    master.setNumCliente(c);
                    master.setCapitalInv(capitalInv);
                    master.setPlazoInv(posicion);
                    if (capitalInv>=1000 && capitalInv<4000){
                        tamanioMonto = 1;
                    }else if (capitalInv>=4000 && capitalInv<20000){
                        tamanioMonto=2;
                    }else if (capitalInv>=20000 && capitalInv<100000) {
                        tamanioMonto = 3;
                    }else if (capitalInv>=100000 && capitalInv<500000){
                        tamanioMonto = 4;
                    }else tamanioMonto=5;

                    master.setTamanioMonto(tamanioMonto);
                    master.calcularGanancia();
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
        //Impresión de la información
        System.out.println(mensaje+"\nTotal"+c+"Inversores");

    }
}
