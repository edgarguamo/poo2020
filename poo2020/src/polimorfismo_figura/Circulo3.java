package polimorfismo_figura;

public class Circulo3 extends Figura3{
    //Declaración de variables
    private double radioCir;

    /**
     * Método para actualizar los datos de radioCir
     * @param radioCir
     */
    public void setRadioCir(double radioCir) {
        this.radioCir = radioCir;
    }

    @Override
    public void calcularArea() {
        area = Math.PI*Math.pow(radioCir,2);
    }
}
