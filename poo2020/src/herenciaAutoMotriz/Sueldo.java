package herenciaAutoMotriz;

public class Sueldo {
    //Definición de variables
    protected String nombre;
    protected String depart;
    protected String puesto;
    protected String rfc;

    /**
     * Método para acceder a los datos de nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar los datos de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para acceder a los datos de depart
     * @return depart
     */
    public String getDepart() {
        return depart;
    }

    /**
     * Método para actualizar los datos de depart
     * @param depart
     */
    public void setDepart(String depart) {
        this.depart = depart;
    }

    /**
     * Métodos para acceder a los datos de puesto
     * @return puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Método para actualizar los datos del puesto
     * @param puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Método para acceder a los datos de rfc
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Método para actualizar los datos a rfc
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
