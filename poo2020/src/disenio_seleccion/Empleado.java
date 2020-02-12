package disenio_seleccion;

public class Empleado {
    //Declaración de variables
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     * Constructor
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;

    }

    /**
     * Método para obtener el sueldo
     * @param horas
     * @param cuota
     * @return sueldo
     */
    public double calcularSueldo(int horas, double cuota){
        if (horas <= 40){
            sueldo = horas * cuota;
        }
        else if (horas > 40){
            sueldo = (40 * cuota)+(horas-40)*(cuota*2);
        }
        return  sueldo;
    }

    /**
     * Método para imprimir la información
     */
    public void impresion(){
        System.out.println("\nEl empleado " + nombre + " realizo "+ horas+" horas, por lo " +
                "su sueldo es de: $"+ calcularSueldo(horas, cuota));
    }
}
