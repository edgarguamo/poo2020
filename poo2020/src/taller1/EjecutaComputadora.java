package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora objComputadora = new Computadora();
        objComputadora.actualizarSisOpe ("Windows");
        objComputadora.actualizarTarGra("Nvidia 1060");
        objComputadora.actualizarCantidadRam(16);
        objComputadora.actualizarTamanio(80.12);
        objComputadora.actualizarMarca("Lenovo");


        String guardarInfo = objComputadora.guardarInfo();
        String calcular = objComputadora.calcular();
        System.out.printf(guardarInfo);
        System.out.println(calcular);
    }


}
