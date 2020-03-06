package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        List<String> universidades = new ArrayList<String>();
        universidades.add("Utpl");
        System.out.println("Tamanio de la Lista: "+ universidades.size());
        universidades.add("espol");
        System.out.println("Tamanio de la Lsita: "+ universidades.size());
        universidades.add("unl");
        System.out.println("Tamanio de la Lsita: "+ universidades.size());
        //Eliminación del elemento en la posición 1
        universidades.remove(1);
        System.out.println("Tamanio de la lista luego de eleminar elemento: "+ universidades.size());
        System.out.println("Valores de la Lista");
        for (int i= 0; i<universidades.size();i++){
            System.out.println(universidades.get(i));
        }
        //reemplazar valores
        universidades.set(1,"uide");
        System.out.println("Valores de la Lista");
        for (int i= 0; i<universidades.size();i++){
            System.out.println(universidades.get(i));
        }
        //Agregar nuevos valores en una posición intermedia

        universidades.add(1,"unl");
        System.out.println("Valores de la Lista");
        for (int i= 0; i<universidades.size();i++){
            System.out.println(universidades.get(i));
        }
        for (String univ:universidades){
            System.out.println(univ);
        }
    }
}
