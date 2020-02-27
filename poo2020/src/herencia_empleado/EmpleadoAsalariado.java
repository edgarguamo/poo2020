package herencia_empleado;

public class EmpleadoAsalariado extends Empleado{
    private double valor_mensual;

    /**
     * Constructor
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param valor_mensual
     */
    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double valor_mensual){
        this.nombre =nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valor_mensual = valor_mensual;
    }

    /**
     * Método para obtener el valor de valor_mensual
     * @return valor_mensual
     */
    public double getValor_mensual() {
        return valor_mensual;
    }

    /**
     * Método para actualizar el valor de valor_mensual
     * @param valor_mensual
     */
    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

}
