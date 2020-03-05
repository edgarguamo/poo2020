package poliformismo_automotriz;

public abstract class Sueldo {
    protected String nombre;
    protected String depart;
    protected String puesto;
    protected String rfc;
    protected double calcularSueldo;

    public abstract void calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public String getDepart() {
        return depart;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getRfc() {
        return rfc;
    }
}
