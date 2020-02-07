package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora objComputadora = new Computadora();
        objComputadora.actualizarSisOpe ("Windows");
        objComputadora.actualizarTagGra("Nvidia 1060");
        objComputadora.actualizarCantidadRam(16);
        objComputadora.actualizarTamanio(80.12);
        objComputadora.actualizarvMarca("Lenovo");


        String guardarInfo = objComputadora.guardarInfo;
        String calcular = objComputadora.calcular;
        System.out.printf(impresion);
        System.out.println(calcular);
    }


}
