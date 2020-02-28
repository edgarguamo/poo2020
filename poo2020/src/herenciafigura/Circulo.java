package herenciafigura;

public class Circulo extends Figura{
    private double radio;
    private double areaCir;

    /**
     * Método para acceder al valor de radio
     * @return
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
     * Método para accder al valor de areaCir
     * @return areaCir
     */
    public double getAreaCir() {
        return areaCir;
    }

    /**
     * Método para calcular el valor de areaCir
     */
    public void cacluarAreaCirculo(){
        areaCir = Math.PI* Math.pow(radio,2);
    }
}
