package herenciaAutoMotriz;

public class Vendedor extends Sueldo{
    //Declaración de variables
    private double precio;
    private double nVentas;
    private double salarioBasico = 400;
    private double quincena;

    /**
     * Método para acceder a los datos de precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para actualizar los datos de precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para acceder a los daots de nVentas
     * @return nVentas
     */
    public double getnVentas() {
        return nVentas;
    }

    /**
     * Método para actualizar los datos de nVentas
     * @param nVentas
     */
    public void setnVentas(double nVentas) {
        this.nVentas = nVentas;
    }

    /**
     * Método para acceder a los datos de quincena
     * @return quincena
     */
    public double getQuincena() {
        return quincena;
    }

    /**
     * Método para actualizar los datos de quincena
     * @param quincena
     */
    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }

    /**
     * Método para calcular el valor de quincena
     */
    public void calcularQuincena(){
        quincena = quincena + (precio*nVentas*0.02);
    }
}
