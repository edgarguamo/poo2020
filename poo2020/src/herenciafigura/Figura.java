package herenciafigura;

public class Figura {
    protected String nombre;

    /**
     * Método para accdener al valor de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar el valor de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
