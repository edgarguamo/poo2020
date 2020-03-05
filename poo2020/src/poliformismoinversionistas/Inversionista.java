package poliformismoinversionistas;

public abstract class Inversionista {
    protected String nombre;
    protected int numCuenta;
    protected int numCliente;
    protected double capitalInv;
    protected double tInteres;
    protected int plazoInv;

    /**
     * Declaración de variables
     */
    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public double getCapitalInv() {
        return capitalInv;
    }

    public double gettInteres() {
        return tInteres;
    }

    public int getPlazoInv() {
        return plazoInv;
    }

    public abstract void calcularGanacia();
}
