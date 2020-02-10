package taller1;

public class EjecutaCelular {
    public static void main(String[] args) {
        Celular objCelular = new Celular();
        objCelular.establecerMarca("Xiaomi");
        objCelular.establecertModelo();
        objCelular.establecerPrecio();
        objCelular.establecerRam();
        objCelular.actualizarAlmacenamiento(64);

        String mostrarDatos = objCelular.estAlm();
        System.out.println(mostrarDatos);

    }


}
