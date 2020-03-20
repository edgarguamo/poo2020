package taller1;

public class Computadora {
    private String sisOpe;
    private String tarGra;
    private int cantidadRam;
    private String marca;
    private double tamanio;

    /**
     * Metodo para obtener el valor de la variable sisOpe
     * @return sisOpe
     */
    public String obtenerSisOpe() {
        return sisOpe;
    }


    /**
     * Metodo para obtener el valor de la variable tarGra
     * @return tarGra
     */
    public String obtenerTarGra() {
        return tarGra;
    }

    /**
     * Metodo pra obtener la cantidad de ram
     * @return cantidadRam
     */
    public int obtenerCantidadRam() {
        return cantidadRam;
    }

    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */
    public String obtenerMarca() {
        return marca;
    }

    /**
     * Metodo para obtener el valor de la variable tamanio
     * @return tamanio
     */
    public double obtenerTamanio() {
        return tamanio;
    }

    public String calcular(){
        String calcular = "Este metodo calculara los valores pediodos por el usuario";
        return calcular;
    }

    public String guardarInfo(){
        String info= "Este metodo almacenara la informacion del computador";
        return info;
    }

    /**
     * Metodo para actualizar la variable sisOpe
     * @param sisOpe
     */
    public void actualizarSisOpe(String sisOpe) {
        this.sisOpe = sisOpe;
    }

    /**
     * Metodo para actualizar la variable tarGra
     * @param tarGra
     */
    public void actualizarTarGra(String tarGra) {
        this.tarGra = tarGra;
    }
    /**
     * Metodo para actualizar la variable marca
     * @param cantidadRam
     */

    public void actualizarCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    /**
     * Metodo para actualizar la variable marca
     * @param marca
     */
    public void actualizarMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para actualizar la variable tamanio
     * @param tamanio
     */
    public void actualizarTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

}
