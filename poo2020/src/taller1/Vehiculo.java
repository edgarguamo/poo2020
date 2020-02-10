package taller1;

public class Vehiculo {
    private String marca;
    private String color;
    private String motor;
    private String modelo;
    private double kilometraje;

    /**
     * Método para obtener la cadena de la marca
     * @return marca
     */
    public String obtenerMarca() {
        return marca;
    }

    /**
     * Método para obtener el color del vehículo
     * @return color
     */
    public String obtenerColor() {
        return color;
    }

    /**
     * Método para obtener el tipo de motor
     * @return motor
     */
    public String obtenerMotor() {
        return motor;
    }

    /**
     * Método para obtener el modelo del vehículo
     * @return
     */
    public String obtenerModelo() {
        return modelo;
    }

    /**
     * Método para obtener el kilometraje
     * @return kilometraje
     */
    public double obtenerKilometraje() {
        return kilometraje;
    }

    //<--------------------------------------------------------

    /**
     * Método que calcula la cantidad de gasolina consumida
     * @return gasConsumida
     */
    public String gasConsumida(){
        String gasConsumida = "Este método hará el cálculo para obtener el consumo de gasolina";
        return kmRecorridos();
    }

    /**
     * Método que calcula la cantidad de km recorridos
     * @return kmRecorridos
     */
    public String kmRecorridos(){
        String kmRecorridos = "Este método mostrará la cantidad de km que realizó el vehículo";
        return kmRecorridos;
    }

    //<---------------------------------------------------------


    /**
     * Método para actualizar la variable marca
     * @param marca
     */
    public void actualizarMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para actualizar la variable color
     * @param color
     */
    public void actualizarColor(String color) {
        this.color = color;
    }

    /**
     * Método para actualizar la variable motor
     * @param motor
     */
    public void actualizarMotor(String motor) {
        this.motor = motor;
    }

    /**
     * Método para actualizar la variable modelo
     * @param modelo
     */
    public void actualizarModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para actualizar la variable kilometraje;
     * @param kilometraje
     */
    public void actualizarKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
}
