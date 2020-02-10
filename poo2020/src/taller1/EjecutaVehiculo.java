package taller1;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo objVehiculo = new Vehiculo();
        objVehiculo.actualizarMarca ("Windows");
        objVehiculo.actualizarColor("Nvidia 1060");
        objVehiculo.actualizarMotor("g400");
        objVehiculo.actualizarModelo("Munstang");
        objVehiculo.actualizarKilometraje(140.8);


        String kmRecorridos = objVehiculo.kmRecorridos();
        String gasConsumida = objVehiculo.gasConsumida();
        System.out.printf(kmRecorridos);
        System.out.println(gasConsumida);

    }


}
