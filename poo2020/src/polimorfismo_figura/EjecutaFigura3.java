package polimorfismo_figura;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {//Método principal
        //Clase Scanner
        Scanner teclado =new Scanner(System.in);

        boolean bandera = true;
        while (bandera){//Bucle 1
            //Petición de datos
            System.out.println("Calcuadora de areas para figura geometricas\nSeleccione una de las figuras:\n" +
                    "1.Círculo\n2.Cuadrado\n3.Rectángulo\n4.Triángulo\n5.Fin\n");
            int seleccion = teclado.nextInt();
            switch (seleccion){
                case 1:
                    //Creación del objeto
                    Circulo3 cir = new Circulo3();
                    //envio de datos
                    cir.setNomFigura("Círculo");
                    System.out.println("A continuación ingrese su radio");
                    cir.setRadioCir(teclado.nextDouble());
                    cir.calcularArea();
                    System.out.println("Figura: "+cir.getNomFigura()+"\nArea: "+cir.getArea());
                    break;
                case 2:
                    //Creación del objeto
                    Cuadrado3 cuad3 = new Cuadrado3();
                    //envio de datos
                    cuad3.setNomFigura("Cuadrado");
                    System.out.println("Ingrese la longitud del lado");
                    cuad3.setLadoCuad(teclado.nextDouble());
                    cuad3.calcularArea();
                    System.out.println("Figura: "+cuad3.getNomFigura()+"\nArea: "+cuad3.getArea());
                    break;
                case 3:
                    //Creación del objeto
                    Rectangulo3 rect3 = new Rectangulo3();
                    //Envio de datos
                    rect3.setNomFigura("Rectángulo");
                    System.out.println("Ingrese la altura");
                    rect3.setAlturaRecta(teclado.nextDouble());
                    System.out.println("ingrese la base");
                    rect3.setBaseRecta(teclado.nextDouble());
                    rect3.calcularArea();
                    System.out.println("Figura: "+rect3.getNomFigura()+"\nArea: "+rect3.getArea());
                    break;
                case 4:
                    //Creación del objeto
                    Triangulo3 tri3 = new Triangulo3();
                    //Envio de datos
                    tri3.setNomFigura("Triángulo");
                    System.out.println("Ingrese la altura del triángulo");
                    tri3.setAlturaTri(teclado.nextDouble());
                    System.out.println("Ingrese la base del triángulo");
                    tri3.setBaseTri(teclado.nextDouble());
                    tri3.calcularArea();
                    System.out.println("Figura: "+tri3.getNomFigura()+"\nArea: "+tri3.getArea());
                    break;
                case 5:
                    //Salida de datos
                    bandera=false;
            }

        }
    }
}
