package herencia_empleado;

public class EmpleadoPorHora extends Empleado {
    private int hora;
    private double valorHora;
    private double sueldo;

    /**
     * Creación del constructor
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param hora
     * @param valorHora
     */
    public EmpleadoPorHora(String nombre, String cargo, String dependencia, int hora, double valorHora){
        this.nombre =nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    /**
     * Método para establecer el valor de hora
     * @return hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Métood para actualizar el valor de hora
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Métood para obtener el valor de valorHora
     * @return
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * Método para actualizar el valor de valorHora
     * @param valorHora
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Métood para calcular el sueldo
     * @return sueldo
     */
    public double  calcualrSueldoPorHora(){
        sueldo = hora* valorHora;
        return sueldo;
    }

    /**
     * Método para actualozar el valor de sueldo
     * @param sueldo
     */
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }


}
