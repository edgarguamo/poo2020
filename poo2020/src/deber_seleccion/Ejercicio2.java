package deber_seleccion;

public class Ejercicio2 {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     * Método para obtener el valor de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar el valor de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el valor de  horas
     * @return horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Método para actualizar el valor de horas
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Método para obtener el valor de cuota
     * @return cuota
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * Método para actualizar el valor de cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    /**
     * Método para obtener el valor de sueldo
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método para actualizar el valor de sueldo
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para calcular el sueldo
     * @param horas
     * @param cuota
     * @return sueldo
     */
    public double calcularSueldo(int horas, double cuota){
        if (horas <= 40){

            setSueldo(horas * cuota);
        }
        if (horas > 40 && horas < 50){

            setSueldo((40 * cuota)+(horas-40)*(cuota*2));

        }else if (horas >= 50 ){
            setSueldo((40*cuota)+(10*cuota*2)+(horas-50)*cuota*3);
        }

        return getSueldo();
    }


    /**
     * Método para imprimir la información
     */
    public void impresion() {
        System.out.println("\nEl empleado " + getNombre() + " realizo " + getHoras() + " horas, por lo " +
                "su sueldo es de: $" + calcularSueldo(getHoras(), getCuota()));
    }


}
