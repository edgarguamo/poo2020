package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        System.out.println("Sistema de ingreso de vehículos");
        boolean bandera = true;
        do {
            System.out.println("Digite 1 para alamacenar nuevo ");
            System.out.println("Digite 2 para presentar ");
            System.out.println("Digite 3 para salir ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    Vehiculo veh = new Vehiculo();
                    System.out.println("Ingrese placa: ");
                    veh.setPlaca(teclado.nextLine());
                    System.out.println("Ingrese Marca: ");
                    veh.setMarca(teclado.nextLine());
                    System.out.println("Ingrese Modelo");
                    veh.setModelo(teclado.nextLine());
                    System.out.println("Ingrese Color: ");
                    veh.setColor(teclado.nextLine());
                    System.out.println("Ingrese Año: ");
                    veh.setAnio(teclado.nextLine());
                    System.out.println("Ingrese Cilindraje: ");
                    //agregamos objeto vehículo a la lista
                    vehiculos.add(veh);
                    break;

                case 2:
                    //recorremos lista con foreach
                    //System.out.println("Placa \tMarca\tcilondraje");
                    for (Vehiculo v: vehiculos){
                        System.out.println("_________________________________");
                        System.out.println("Placa: "+ v.getPlaca());
                        System.out.println("Marca: "+v.getMarca());
                        System.out.println("Modelo: "+v.getModelo());
                        System.out.println("Año"+v.getAnio());
                        System.out.println("Cilindraje"+ v.getCilindraje());
                        System.out.println("Color: "+v.getColor());
                        System.out.println("__________________________________");
                        //System.out.println(v.getPlaca()+"\t"+v.getMarca()+"\t"+v.getCilindraje());
                    }
                    break;

                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción incorrecta ");
            }
        }while (bandera);
    }
}
