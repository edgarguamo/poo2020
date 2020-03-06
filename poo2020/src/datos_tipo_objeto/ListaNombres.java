package datos_tipo_objeto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        List<String> nombres = new ArrayList<String>();
        while (bandera){
            System.out.println("Seleccione una opción \n1.Agregar un nombre\n2. Presentar Lista\n3. Salir");
            int select = teclado.nextInt();
            teclado.nextLine();
            switch (select){
                case 1:
                    System.out.println("Ingrese el nombre");
                    String nombre = teclado.nextLine();

                    nombres.add(nombre);
                    break;
                case 2:
                    System.out.println("Lisa de nombrea");
                    for (int i = 0; i<nombres.size();i++){
                        System.out.println(nombres.get(i));
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
            }
        }

    }
}
