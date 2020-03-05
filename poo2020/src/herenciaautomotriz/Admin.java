package herenciaautomotriz;

public class Admin extends Sueldo{
    //declaración de variables
    private double sueldo;
    private double quincena;

    /**
     * Método para acceder a los datos de sueldo
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método para actualizar el valor de sueldo
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para acceder a los datos de quincena
     * @return quincena
     */
    public double getQuincena() {
        return quincena;
    }

    /**
     * Método para calcular la quincena
     */
    public void calcularQuincena(){
        quincena = sueldo/2;
    }


}
