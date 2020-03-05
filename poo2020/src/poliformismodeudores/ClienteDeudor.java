package poliformismodeudores;

public abstract class ClienteDeudor {
    //Declaración de variables
    protected String nombre;
    protected int numCuenta;
    protected int numCliente;
    protected double capitalPres;
    protected double tazaInt;
    protected int plazoInv;

    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public double getCapitalPres() {
        return capitalPres;
    }

    public double getTazaInt() {
        return tazaInt;
    }

    public int getPlazoInv() {
        return plazoInv;
    }

    public abstract void calcularDeuda();
}
