package herenciaVolumen;

public class Cilindro extends  Partes{
    /**
     * Declaración de variables
     */
    private double volumenCil;

    /**
     * Método para acceder al valor de volumenCil
     * @return volumenCil
     */
    public double getVolumenCil() {
        return volumenCil;
    }

    /**
     * Método para calcular el valor de volumenCil
     */
    public void calcularVolumenCil(){
        volumenCil = Math.PI*Math.pow(getRadio(),2)*getAltura();
    }
}
