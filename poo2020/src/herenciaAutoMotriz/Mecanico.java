package herenciaAutoMotriz;

public class Mecanico extends Sueldo{
    //Declaración de variables
    private int nTrab;
    private double precio;
    private double sueldo=0;

    /**
     * Método para acceder a los datos de nTrab
     * @return nTrab
     */
    public int getnTrab() {
        return nTrab;
    }

    /**
     * Método para actualizar los datos de nTrab
     * @param nTrab
     */
    public void setnTrab(int nTrab) {
        this.nTrab = nTrab;
    }

    /**
     * Método para acceder a los datos de precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para actualzar los datos de precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para accder a los datos de sueldo
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método para calcular el sueldo
     */
    public void sueldoMec(){
        sueldo = sueldo + (precio*nTrab)*(0.04);
    }



}
