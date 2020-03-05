package herenciavolumen;

public class Cubo extends Volumen{
    private double arista;
    private double volumenCubo;

    /**
     * Método para acceder al valor de arista
     * @return arista
     */
    public double getArista() {
        return arista;
    }

    /**
     * Método para actualizar el valor de arista
     * @param arista
     */
    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Métodp para acceder al valor de volumenCubo
     * @return volumenCubo
     */
    public double getVolumenCubo() {
        return volumenCubo;
    }

    /**
     * Método para calcular el valor de volumenCubo
     */
    public void calcularVolumenCubo(){
        volumenCubo = Math.pow(getArista(),3);
    }
}
