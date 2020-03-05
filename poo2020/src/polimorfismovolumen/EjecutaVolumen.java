package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaVolumen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        double altura;
        double radio;
        double arista;
        while (bandera) {//Bucle1 que permite repetir todo el ejercicio
            System.out.println("Seleccione la figura a calcular:\n1.Cilindro\n2.Cono\n3.Cubo\n4.Esfera\n5.Salir");
            int select = teclado.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Ingrese radio");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese altura");
                    altura = teclado.nextDouble();

                    Cilindro cil = new Cilindro(radio,altura,"Cilindro");
                    cil.calcularVolumen();
                    //Almacenamiento de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", cil.getNombre(), cil.getVolumenCil());
                    System.out.println("_______________________________________________");
                    break;
                case 2:
                    System.out.println("ingrese el radio:");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();
                    Cono cono = new Cono(altura,radio,"Cono");
                    cono.calcularVolumen();
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", cono.getNombre(), cono.getVolumenCono());
                    System.out.println("_______________________________________________");
                    break;
                case 3:
                    System.out.println("Ingrese Arista: ");
                    arista = teclado.nextDouble();
                    Cubo cubo = new Cubo(arista,"Cubo");
                    cubo.calcularVolumen();
                    //Impresion de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", cubo.getNombre(), cubo.getVolumenCubo());
                    System.out.println("_______________________________________________");
                    break;
                case 4:
                    System.out.println("Ingrese radio");
                    radio=teclado.nextDouble();

                    Esfera esf = new Esfera(radio,"Esfera");
                    esf.calcularVolumen();
                    //Impresion de la información
                    System.out.println("_______________________________________________");
                    System.out.printf("Figura: %s\nFigura %.2f\n", esf.getNombre(), esf.getVolumenRad());
                    System.out.println("_______________________________________________");
                    break;
                case 5:
                    bandera = false;
                    break;
            }
        }
    }
}
