package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {
    //Método principal
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Selección de figura
        System.out.println("Por favor seleccione la figura:\n1.Triángulo \n2.Rectángulo \n3.Cuadrado, \n4.Circulo");
        int option = teclado.nextInt();
        double altura;
        double base;
        double radio;

        switch (option){//Swtich Calculo de figuras
            case 1:
                System.out.println("Ingrese la altura");
                altura= teclado.nextDouble();
                System.out.println("Ingrese la base");
                base= teclado.nextDouble();
                //Creación del objeto Tri
                Triangulo tri = new Triangulo();
                //envio de datos
                tri.setAltura(altura);
                tri.setBase(base);
                tri.setNombre("Triangulo");
                tri.calcularAreaTri();
                System.out.println("Figura: "+tri.getNombre()+"\nÁrea: "+ tri.getAreaTri());
                break;
            case 2:
                System.out.println("Ingrese la altura");
                altura = teclado.nextDouble();
                System.out.println("Ingrese la base");
                base = teclado.nextDouble();
                //Creación del objeto rec
                Rectangulo rec = new Rectangulo();
                //Envio de información
                rec.setAltura(altura);
                rec.setBase(base);
                rec.setNombre("rectángulo");
                rec.calcualrAreaRec();
                System.out.println("Figura: "+rec.getNombre()+"\nÁrea: "+ rec.getAreaRec());
                break;
            case 3:
                System.out.println("Ingrese el lado");
                base = teclado.nextDouble();
                //Creación del objeto cua
                Cuadrado cua = new Cuadrado();
                //Envio de datos
                cua.setLado(base);
                cua.setNombre("Cuadrado");
                cua.calcularAreaCua();
                System.out.println("Figura: "+cua.getNombre()+"\nÁrea: "+ cua.getAreaCua());
                break;
            case 4:
                System.out.println("Ingrese el rádio");
                radio = teclado.nextDouble();
                //Creación del objeto cir
                Circulo cir = new Circulo();
                //Envio de datos
                cir.setNombre("Circulo");
                cir.setRadio(radio);
                cir.cacluarAreaCirculo();
                System.out.println("Figura: "+cir.getNombre()+"\nÁrea: "+ cir.getAreaCir());
                break;
        }//Fin Switch

    }//Fin Método Principal
}//Fin Clase

