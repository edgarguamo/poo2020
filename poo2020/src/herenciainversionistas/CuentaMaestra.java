package herenciainversionistas;

public class CuentaMaestra extends Inversionista {
    //Declaració de variables
    private double ganancia;
    private double[] interesCM = {2.45,2.6,3.25,4.25,5};
    private double[] interesCM2 = {2.85,3,3.65,4.65,5.15};
    private double[] interesCM3 = {2.95,3.10,3.75,4.75,5.25};
    private double[] interesCM4 = {3.05,3.25,3.90,5,5.50,5,63};
    private double[] interesCM5 = {3.25,3.5,4,5.25,5.75};
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
     * Método para acceder a los datos de tamanioMonto
     * @return tamanioMonto
     */
    public int getTamanioMonto() {
        return tamanioMonto;
    }

    /**
     * Método para actualizar los datos de tamanioMonto
     * @param tamanioMonto
     */
    public void setTamanioMonto(int tamanioMonto) {
        this.tamanioMonto = tamanioMonto;
    }

    /**
     * Método para calcular la variable ganancia
     */
    public void calcularGanancia(){
        switch (tamanioMonto){
            case 1:
                ganancia=(interesCM[plazoInv]*capitalInv)/100;
                break;
            case 2:
                ganancia=(interesCM2[plazoInv]*capitalInv)/100;
                break;
            case 3:
                ganancia=(interesCM3[plazoInv]*capitalInv)/100;
                break;
            case 4:
                ganancia=(interesCM4[plazoInv]*capitalInv)/100;
                break;
            case 5:
                ganancia=(interesCM5[plazoInv]*capitalInv)/100;
                break;
        }

    }
}
