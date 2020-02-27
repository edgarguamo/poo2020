package herencia_empleado;

public class Empleado {
    //declaración de variables
    protected String nombre;
    protected String cargo;
    protected String dependencia;

    /**
     * Método para acceder a la info de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Métood para actualizar la info de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para establecer el valor de cargo
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Métodp para actualizar el valor de cargo
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método para acceder al valor de dependencia
     * @return dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * Método para actualizar el valor de dependencia
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
