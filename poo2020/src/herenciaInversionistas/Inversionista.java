package herenciaInversionistas;

public class Inversionista {
    /**
     * Declaración de variables
     */
    protected String nombre;
    protected int numCuenta;
    protected int numCliente;
    protected double capitalInv;
    protected double tInteres;
    protected int plazoInv;

    /**
     * Método para acceder a los datos de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar los datos de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para acceder a los datos de numCuenta
     * @return numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Método para acteualizar a los datos de numCuenta
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
     * Método para actualizar los datos  de capitalInv
     * @return capitalInv
     */
    public double getCapitalInv() {
        return capitalInv;
    }

    /**
     * Método para actualizar los datos de capitalInv
     * @param capitalInv
     */
    public void setCapitalInv(double capitalInv) {
        this.capitalInv = capitalInv;
    }

    /**
     * Métodp para acceder a los datos de tInteres
     * @return tInteres
     */
    public double gettInteres() {
        return tInteres;
    }

    /**
     * Método para actualizar los datos de tInteres
     * @param tInteres
     */
    public void settInteres(double tInteres) {
        this.tInteres = tInteres;
    }

    /**
     * Método para acceder los datos de plazoInv
     * @return plazoInv
     */
    public int getPlazoInv() {
        return plazoInv;
    }

    /**
     * Método para actualizar los datos de plazoInv
     * @param plazoInv
     */
    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }
}
