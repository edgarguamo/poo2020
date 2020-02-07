package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        objAnimal.actualizarFamilia ("Canino");
        objAnimal.actualizarRaza("French Poodle");
        objAnimal.actualizarespecie("Perro");
        objAnimal.actualizarTamanio("1.20");
        objAnimal.actualizarvDesplazamiento("25km/h");


        String impresion = objAnimal.obtenerDtos();
        System.out.printf(impresion);
    }


}
