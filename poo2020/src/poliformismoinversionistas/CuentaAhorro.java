package poliformismoinversionistas;

public class CuentaAhorro extends Inversionista{
    private double ganancia;
    private double[] interesCA = {1.5,1.75,2.25,2.75,3.75};
    private double[] interesCA2 = {1.54,2.80,2.32,2.93,3.86};
    private double[] interesCA3 = {1.60,2.90,2.40,3.05,4};
    private double[] interesCA4 = {1.66,3,2.50,3.15,4.15};
    private double[] interesCA5 = {1.72,3.11,2.59,3.26,4.30};
    private int tamanioMonto;

    public CuentaAhorro(String nombre, int numCuenta
            , int numCliente,double capitalInv
            , double plazoInv, int tamanioMonto){
        this.nombre = nombre;
        this. numCuenta = numCuenta;
        this.numCliente = numCliente;
        this.capitalInv = capitalInv;
        this.tamanioMonto = tamanioMonto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public int getTamanioMonto() {
        return tamanioMonto;
    }

    @Override
    public void calcularGanacia() {
        switch (tamanioMonto) {
            case 1:
                ganancia = (interesCA[plazoInv] * capitalInv) / 100;
                break;
            case 2:
                ganancia = (interesCA2[plazoInv] * capitalInv) / 100;
                break;
            case 3:
                ganancia = (interesCA3[plazoInv] * capitalInv) / 100;
                break;
            case 4:
                ganancia = (interesCA4[plazoInv] * capitalInv) / 100;
                break;
            case 5:
                ganancia = (interesCA5[plazoInv] * capitalInv) / 100;
                break;
        }
    }
}
