package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12 {
    private  double horas_trabajadas;
    private double cuota_por_hora;

    /**
     * Método para calcular el
     * @return
     */
    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getCuota_por_hora() {
        return cuota_por_hora;
    }

    public void setCuota_por_hora(double cuota_por_hora) {
        this.cuota_por_hora = cuota_por_hora;
    }

    @Override
    public  void calcularSueldoQna(){
        sueldo = horas_trabajadas * cuota_por_hora;

    }

}
