package herneciaDeudores;

public class PrestamoAuto extends ClienteDeudor{
    //Declaración de variables
    private double interesBP = 11.23;
    private double totalPagar;

    /**
     * Método para acceder a los datos de interesBp
     * @return interesBp
     */
    public double getInteresBP() {
        return interesBP;
    }

    /**
     * Método para actualizar los datos de interesBP
     * @param interesBP
     */
    public void setInteresBP(double interesBP) {
        this.interesBP = interesBP;
    }

    /**
     * Método para acceder a los datos de totalPagar
     * @return totalPagar
     */
    public double getTotalPagar() {
        return totalPagar;
    }

    /**
     * Método para actualizar los datos de totalPagar
     * @param totalPagar
     */
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    /**
     * Método para calculcar el valor de totalPagar
     */
    public void calculartotalPagar(){
        totalPagar = capitalPres * tazaInt*plazoInv/1200;
    }

}
