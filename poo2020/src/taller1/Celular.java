package taller1;

public class Celular {
    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private int precio;

    /**
     * Metodo para obtener la cadena de marca
     * @return marca
     */
    public String establecerMarca() {
        return marca;
    }

    /**
     * Metodo para obtener la cadena de modelo
     * @return marca
     */
    public String establecertModelo() {
        return modelo;
    }

    /**
     * Metodo para obtener  el valor de precio
     * @return precio
     */
    public int establecerPrecio() {
        return precio;
    }

    /**
     * Metodo para obtener la cantiad de ram
     * @return ram
     */
    public int establecerRam() {
        return ram;
    }

    /**
     * Metodo para obtener la cantidad de alamacenamiento0
     * @return almacenamiento
     */
    public String estAlm() {
        String almacenamiento = "Esta variable enviara la cantidad de almacenamiento sobrante";
        return almacenamiento;
    }

    public String instruciones() {
        String seguirInstrucciones = "Esta varaible almacenara las funciones basicas del celular";
        return seguirInstrucciones;
    }

    public String infoAlm(){
        String info = "Este celular tiene "+almacenamiento+" gigas de almacenamiento";
        return info;
    }

    /**
     * Metodo para actualizar la variable marca
     * @param marca
     */
    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    /**
     * MEtodo para actualizar la variable modelo
     * @param modelo
     */
    public void actualizarModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo pra actualizar la variable precio
     * @param precio
     */
    public void actualizarPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Metodo para actualizar la variable ram
     * @param ram
     */
    public void actualizarRam(int ram) {
        this.ram = ram;
    }

    /**
     * Metodo para actualizar la variable almacenamiento
     * @param almacenamiento
     */
    public void actualizarAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
