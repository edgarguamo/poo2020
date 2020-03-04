package polimorfismo_figura;

public class Rectangulo3 extends Figura3{
    //Declaración de variables
    private double baseRecta;
    private double alturaRecta;

    /**
     * Método para actualizar los datos de baseREcta
     * @param baseRecta
     */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    /**
     * Métodp para actualizar los datos de alturaRecta
     * @param alturaRecta
     */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public void calcularArea() {
        area = baseRecta*alturaRecta;
    }
}
