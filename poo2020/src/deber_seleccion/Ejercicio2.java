package deber_seleccion;

public class Ejercicio2 {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para obtener el sueldo
     * @param horas
     * @param cuota
     * @return sueldo
     */
    public double calcularSueldo(int horas, double cuota){
        if (horas <= 40){

            setSueldo(horas * cuota);
        }
        else if (horas > 40 && horas < 50){

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
