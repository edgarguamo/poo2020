package herneciaDeudores;

public class PrestamoPersonal extends ClienteDeudor{
    //Declaración de variables
    private double prestamoPer;
    private double interesFracPP;

    /**
     * Método para acceder a los datos de prestamoPer
     * @return prestamoPer
     */
    public double getPrestamoPer() {
        return prestamoPer;
    }

    /**
     * Método para actualizar los datos de prestamoPer
     * @param prestamoPer
     */
    public void setPrestamoPer(double prestamoPer) {
        this.prestamoPer = prestamoPer;
    }

    /**
     * Método para acceder a los datos de interesFracPP
     * @return interesFracPP
     */
    public double getInteresFrac() {
        return interesFracPP;
    }

    /**
     * Método para actualizar los datos de interesFraccPP
     * @param interesFrac
     */
    public void setInteresFrac(double interesFrac) {
        this.interesFracPP = interesFrac;
    }

    /**
     * Método para calcular el valor de interesFracPP
     */
    public void calcularInteresFracPP(){
        interesFracPP = tazaInt / 12;

    }

    /**
     * Método para calcular el valor de prestamoPer
     */
    public void calcularPrestamoPer(){
        prestamoPer = ((Math.pow(1+tazaInt/100,1/12))-1)*capitalPres*12;
        System.out.println((Math.pow(1+tazaInt/100,1/12))-1);
    }
}
