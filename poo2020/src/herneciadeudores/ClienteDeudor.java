package herneciadeudores;

public class ClienteDeudor {
    //Declaración de variables
    protected String nombre;
    protected int numCuenta;
    protected int numCliente;
    protected double capitalPres;
    protected double tazaInt;
    protected int plazoInv;

    /**
     * Métodp para acceder a los datos de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método apra actualizar los datos de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para acceder a los datos de  numCuenta
     * @return numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Método para actualizar los datos de numCuenta
     * @param numCuenta
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Método para acceder a los datos de numCliente
     * @return numCliente
     */
    public int getNumCliente() {
        return numCliente;
    }

    /**
     * Método para actualizar los datos de numCliente
     * @param numCliente
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * Método para acceder a los datos de capitalPres
     * @return capitalPres
     */
    public double getCapitalPres() {
        return capitalPres;
    }

    /**
     * Método para actualizar los datos de capitalPres
     * @param capitalPres
     */
    public void setCapitalPres(double capitalPres) {
        this.capitalPres = capitalPres;
    }

    /**
     * Métodp para acceder a los daots de tazaInt
     * @return tazaInt
     */
    public double getTazaInt() {
        return tazaInt;
    }

    /**
     * Métodp ara actualizar los datos de tazaInt
     * @param tazaInt
     */
    public void setTazaInt(double tazaInt) {
        this.tazaInt = tazaInt;
    }

    /**
     * Métodp para acceder a los datos de plazloInv
     * @return plazoInv
     */
    public int getPlazoInv() {
        return plazoInv;
    }

    /**
     * Métoodo para actualizar los datos de plazoInv
     * @param plazoInv
     */
    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }
}
