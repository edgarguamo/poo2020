package herenciavolumen;

public class Partes extends Volumen{
    protected double radio;
    protected double altura;

    /**
     * Métodp apra acceder al valor de radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método para actualizar el valor de radio
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Métido para accder al valor de altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Métido para actualizar el valor de altura
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
