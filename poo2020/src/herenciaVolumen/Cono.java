package herenciaVolumen;

public class Cono extends Partes {
    private double volumenCono;

    /**
     * Método para acceder al valor de volumenCono
     * @return volumenCono
     */
    public double getVolumenCono() {
        return volumenCono;
    }

    /**
     * Método para calcular en valor de volumenCono
     */
    public void calcularVolumenCono(){
        volumenCono = (Math.PI*Math.pow(getRadio(),2)*getAltura())/3;
    }
}
