package polimorfismo_poo;

public abstract class Empleado12 {
    //definicion de atributos protegidos a heredar
    protected String nombre;
    protected String departamente;
    protected String puesto;
    protected double sueldo;

    /**
     * Mëtodo abstracto, que sera implementado
     * dentro de las clases hijas
     */
    public abstract void calcularSueldoQna();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamente() {
        return departamente;
    }

    public void setDepartamente(String departamente) {
        this.departamente = departamente;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }


}
