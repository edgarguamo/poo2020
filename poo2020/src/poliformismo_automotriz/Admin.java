package poliformismo_automotriz;

public class Admin extends Sueldo{

    private double sueldo;
    private double quincena;

    public Admin ( double sueldo,String nombre,
                   String depart, String puesto, String rfc){
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.depart = depart;
        this.depart = depart;
        this.puesto = puesto;
        this.rfc = rfc;
    }

    @Override
    public void calcularSueldo() {
        quincena = sueldo/2;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getQuincena() {
        return quincena;
    }
}
