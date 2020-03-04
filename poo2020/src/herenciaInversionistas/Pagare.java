package herenciaInversionistas;

public class Pagare extends Inversionista {
    /**
     * Declaración de variables
     */
    private double ganancia;
    private double[] interesP = {2.45,2.6,3.25,4.25,5};
    private double[] interesP2 = {2.85,3,3.65,4.65,5.15};
    private double[] interesp3 = {2.95,3.10,3.75,4.75,5.25};
    private double[] interesp4 = {3.05,3.25,3.90,5,5.50};
    private double[] interesp5 = {3.25,3.5,4,5.25,5.75};
    private int posicion;
    private int tamanioMonto;

    /**
     * Método para acceder a los datos de ganacia
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
     * Método para acceder los datos de tamanioMonto
     * @return tamanioMonto
     */
    public int getTamanioMonto() {
        return tamanioMonto;
    }

    /**
     * Método apra actualizar los datos de tamanioMonto
     * @param tamanioMonto
     */
    public void setTamanioMonto(int tamanioMonto) {
        this.tamanioMonto = tamanioMonto;
    }

    /**
     * Método para calcular la ganancia
     */
    public void calcularGanancia(){
        switch (getTamanioMonto()){
            case 1:
                ganancia=(interesP[plazoInv]*capitalInv)/100;
                break;
            case 2:
                ganancia=(interesP2[plazoInv]*capitalInv)/100;
                break;
            case 3:
                ganancia=(interesp3[plazoInv]*capitalInv)/100;
                break;
            case 4:
                ganancia=(interesp4[plazoInv]*capitalInv)/100;
                break;
            case 5:
                ganancia=(interesp5[plazoInv]*capitalInv)/100;
                break;
        }

    }

}
