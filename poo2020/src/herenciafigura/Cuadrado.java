package herenciafigura;

public class Cuadrado extends Figura{
    private double lado;
    private double areaCua;

    /**
     * Método para acceder al valor de lado
     * @return lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Método para actualizar el valor de lado
     * @param lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Método para acceder al valor areaCua
     * @return areaCua
     */
    public double getAreaCua() {
        return areaCua;
    }

    /**
     * Método para calcular el valor de areaCua
     */
    public void calcularAreaCua(){
        areaCua = Math.pow(lado,2);
    }

}
