package herneciaDeudores;

public class PrestamoHipotecario extends ClienteDeudor {
    //Declaración de variables
    private double hipoteca;
    private double interesFrac;

    /**
     * Métood para acceder a los datos de hipoteca
     * @return hipoteca
     */
    public double getHipoteca() {
        return hipoteca;
    }

    /**
     * Métodp para actualizar el valor de hipoteca
     * @param hipoteca
     */
    public void setHipoteca(double hipoteca) {
        this.hipoteca = hipoteca;
    }

    /**
     * Método para acceder a los datos de interesFrac
     * @return interesFrac
     */
    public double getInteresFrac() {
        return interesFrac;
    }

    /**
     * Métood para actualizar el valor de interesFrac
     * @param interesFrac
     */
    public void setInteresFrac(double interesFrac) {
        this.interesFrac = interesFrac;
    }

    /**
     * Método para calcular hipoteca
     */
    public void generarHipoteca(){
        hipoteca = capitalPres*((Math.pow((1+tazaInt/100),plazoInv)*tazaInt/100)/ (Math.pow(1+tazaInt/100,plazoInv)-1));
    }


}
