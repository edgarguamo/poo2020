package disenio_seleccion;

public class Empleado {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    public Empleado(String nombre, int horas, double cuota, double sueldo){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
        this.sueldo = sueldo;
    }

    public double calcularSueldo(int horas, double cuota){
        if (horas <= 40){
            sueldo = horas * cuota;
        }
        else if (horas > 40){
            sueldo = (40 * cuota)+(horas-40)*(cuota*2);
        }
        return  sueldo;
    }
    public void impresion(){
        System.out.println("\nEl empleado " + nombre + " realizo "+ horas+" horas, por lo " +
                "su sueldo es de: $"+ calcularSueldo(horas, cuota));
    }
}
