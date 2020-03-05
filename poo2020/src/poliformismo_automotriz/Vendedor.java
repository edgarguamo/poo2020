package poliformismo_automotriz;

public class Vendedor  extends Sueldo{
    private double precio;
    private double nVentas;
    private double salarioBasico = 400;
    private double quincena;

    public Vendedor ( double precio, double nVentas,String nombre,
                   String depart, String puesto, String rfc){
        this.precio = precio;
        this.nVentas = nVentas;
        this.nombre = nombre;
        this.depart = depart;
        this.depart = depart;
        this.puesto = puesto;
        this.rfc = rfc;
    }

    public double getPrecio() {
        return precio;
    }

    public double getnVentas() {
        return nVentas;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public double getQuincena() {
        return quincena;
    }

    @Override
    public void calcularSueldo() {
        quincena = quincena + (precio*nVentas*0.02);
    }
}
