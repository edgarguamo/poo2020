package taller1;

public class Universidad {
    private  String nombre;
    private String tipo;
    private String nEstudainte;
    private String modalidad;
    private String telefono;

    /**
     * Metodo para obtener el valor de nombre
     * @return nombre
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el valor de tipo
     * @return tipo
     */
    public String obtenerTipo() {
        return tipo;
    }

    /**
     * Metodo para obtener el valor de nEstudiante
     * @return nEstudiante
     */
    public String obtenernEstudiante(){
        return  nEstudainte;
    }

    /**
     * Metodo para obtener el valor de modalidad
     * @return modalidad
     */
    public String obtenerModalidad() {
        return modalidad;
    }

    /**
     * Metodo para obtener el valor de telefono
     * @return telefono
     */
    public String obtenerTelefono() {
        return telefono;
    }

    public void  contratarDocentes(){

    }

    public void capacitar(){

    }
//<-------------------------------------------------------------------------------------------------->
    /**
     * Metodo que actualizar el valor de la variable nombre
     * @param nombre
     */
    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que actualiza el valor de la variable tipo
     * @param tipo
     */
    public void actualizarTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que actualiza el valor de la variable nEstudiante
     * @param nEstudainte
     */
    public void actualizarnEstudainte(String nEstudainte) {
        this.nEstudainte = nEstudainte;
    }

    /**
     * Metodo para actualizar el valor de la varuable modalidad
     * @param modalidad
     */
    public void actualizarModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    /**
     * Metodo para actualizar el valor de la variable telefno
     * @param telefono
     */
    public void actualizarTelefono(String telefono) {
        this.telefono = telefono;
    }
}
