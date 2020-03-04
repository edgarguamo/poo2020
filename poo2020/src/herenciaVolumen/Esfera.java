package herenciaVolumen;

public class Esfera extends Volumen{
    private double radio;
    private double volumenRad;

    /**
     * Método para acceder al valor de radio
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
     * Método para accder al valor de volumenRad
     * @return volumenRad
     */
    public double getVolumenRad() {
        return volumenRad;
    }

    /**
     * Método para calcular el vlaor de volumenRad
     */
    public void calcularVolumenEsf(){
        volumenRad = (4/3)*(Math.PI*Math.pow(getRadio(),3));
    }
}
