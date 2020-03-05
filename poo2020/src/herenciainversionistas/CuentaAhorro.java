package herenciainversionistas;

public class CuentaAhorro extends Inversionista {
    //Declaración de variables
    private double ganancia;
    private double[] interesCA = {1.5,1.75,2.25,2.75,3.75};
    private double[] interesCA2 = {1.54,2.80,2.32,2.93,3.86};
    private double[] interesCA3 = {1.60,2.90,2.40,3.05,4};
    private double[] interesCA4 = {1.66,3,2.50,3.15,4.15};
    private double[] interesCA5 = {1.72,3.11,2.59,3.26,4.30};
    private int tamanioMonto;

    /**
     * Método para acceder a los datos de ganancia
     * @return ganancia
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * Método para actualizar los datos de ganancia
     * @param ganancia
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * Método para acceder a los datos de interesCA
     * @return interesCA
     */
    public double[] getInteresCA() {
        return interesCA;
    }

    /**
     * Método para acceder a los datos de tamanioMonto
     * @return tamanioMonto
     */
    public int getTamanioMonto() {
        return tamanioMonto;
    }

    /**
     * Método para actualizar losdatos de tamanioMonto
     * @param tamanioMonto
     */
    public void setTamanioMonto(int tamanioMonto) {
        this.tamanioMonto = tamanioMonto;
    }

    /**
     * Método para actializar los datos de interesCA
     * @param interesCA
     */
    public void setInteresCA(double[] interesCA) {
        this.interesCA = interesCA;
    }

    /**
     * Método para calcular el valor de ganancia
     */
    public void calcularGanancia(){
        switch (tamanioMonto){
            case 1:
                ganancia=(interesCA[plazoInv]*capitalInv)/100;
                break;
            case 2:
                ganancia=(interesCA2[plazoInv]*capitalInv)/100;
                break;
            case 3:
                ganancia=(interesCA3[plazoInv]*capitalInv)/100;
                break;
            case 4:
                ganancia=(interesCA4[plazoInv]*capitalInv)/100;
                break;
            case 5:
                ganancia=(interesCA5[plazoInv]*capitalInv)/100;
                break;
        }
    }

}

