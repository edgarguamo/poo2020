package intropoo;

public class EjecutaPersona {

    public static void main(String[] args) {
        //Creación de objeto persona, con inicializacion de variables
       Persona persona = new Persona ( "Masculino", "Catolico", 23, "Edgar Guamo M.");

        System.out.println(persona.getNombre());
        System.out.println("edad:"+persona.getEdad());
        System.out.println("religion: "+ persona.getReligion());
        System.out.println("genero"+persona.getGenero());

        //Creacion de objeto con constructor 2
        Persona persona2 = new Persona("masculino", "catolico", 20);
        Persona persona3 = new Persona("femenino", "protestante", 28);

        System.out.println("Edad Persona2: "+persona2.getEdad());
        System.out.println("Edad Persona2: "+persona2.getNombre());
        System.out.println("Edad Persona3: "+persona3.getEdad());


    }

}
