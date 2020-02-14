package disenio_repeticion;

public class Empleado {
    private String nombre;
    private double sueldo;
    private double pph;
    private int horasTra;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPph() {
        return pph;
    }

    public void setPph(double pph) {
        this.pph = pph;
    }

    public double getHorasTra() {
        return horasTra;
    }

    public void setHorasTra(int horasTra) {
        this.horasTra = horasTra;
    }

    public Empleado(String nombre, double pph, int horasTra){
        this.nombre = nombre;
        this.pph = pph;
        this.horasTra = horasTra;
    }

    public Empleado(String nombre, int horasTra){
        this.nombre = nombre;
        this.horasTra = horasTra;
    }

    public void calculaSueldo (){
        if (horasTra <= 40){
            sueldo = horasTra * pph;
        }else if (horasTra > 40){
            sueldo = (40*pph)+ (horasTra-40)*pph*2;
        }
    }


}
