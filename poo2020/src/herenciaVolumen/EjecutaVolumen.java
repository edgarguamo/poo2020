package herenciaVolumen;

import java.util.Scanner;

public class EjecutaVolumen {
    public static void main(String[] args) {//Método principal
        /**
         * Declaración de variables
         */
        //Creación de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        boolean bandera=true;
        double altura;
        double radio;
        double arista;
        while (bandera){//Bucle1 que permite repetir todo el ejercicio
            System.out.println("Seleccione la figura a calcular:\n1.Cilindro\n2.Cono\n3.Cubo\n4.Esfera\n5.Salir");
            int select = teclado.nextInt();
            switch (select){
                case 1:
                    //Petición de la información
                    System.out.println("Ingrese el radio");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura");
                    altura = teclado.nextDouble();
                    //Creación del objeto cil
                    Cilindro cil = new Cilindro();
                    //Envio de información
                    cil.setAltura(altura);
                    cil.setRadio(radio);
                    cil.setNombre("Cilindro");
                    cil.calcularVolumenCil();
                    //Almacenamiento de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", cil.getNombre(), cil.getVolumenCil());
                    System.out.println("_______________________________________________");
                    break;

                case 2:
                    //Petición de la información
                    System.out.println("Ingrese el el radio:");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    altura = teclado.nextDouble();
                    //Creación del objeto cono
                    Cono cono = new Cono();
                    //Envio de la información
                    cono.setAltura(altura);
                    cono.setRadio(radio);
                    cono.setNombre("Cono");
                    cono.calcularVolumenCono();
                    //Impresion de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", cono.getNombre(), cono.getVolumenCono());
                    System.out.println("_______________________________________________");
                    break;
                case 3:
                    //Petición de la información
                    System.out.println("Ingrese la arista:");
                    arista = teclado.nextDouble();
                    //Creación del objeto cubo
                    Cubo cubo = new Cubo();
                    //Emvio de la iformación
                    cubo.setArista(arista);
                    cubo.calcularVolumenCubo();
                    cubo.setNombre("Cono");
                    //Impresion de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", cubo.getNombre(), cubo.getVolumenCubo());
                    System.out.println("_______________________________________________");
                    break;
                case 4:
                    //Petición de datos
                    System.out.println("Ingrese el radio");
                    radio = teclado.nextDouble();
                    //Creación del objeto esf
                    Esfera esf = new Esfera();
                    //Envio de información
                    esf.setRadio(radio);
                    esf.setNombre("Esfera");
                    esf.calcularVolumenEsf();
                    //Impresion de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", esf.getNombre(), esf.getVolumenRad());
                    System.out.println("_______________________________________________");
                    break;
                case 5:
                    //Forma para salir del bucle
                    bandera=false;
                    break;
            }
        }

    }
}
