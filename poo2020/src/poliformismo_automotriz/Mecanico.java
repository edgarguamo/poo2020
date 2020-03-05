package poliformismo_automotriz;

public class Mecanico extends Sueldo{

    private int nTrab;
    private double precio;
    private double quincena;

    public Mecanico (int nTrab, double precio,
                     String nombre, String depart, String puesto,
                     String rfc){
        this.nTrab=nTrab;
        this.precio=precio;
        this.nombre = nombre;
        this.depart = depart;
        this.depart = depart;
        this.puesto = puesto;
        this.rfc = rfc;
    }


    @Override
    public void calcularSueldo() {
         quincena = quincena +(precio*nTrab)*(0.04);
    }

    public int getnTrab() {
        return nTrab;
    }

    public double getPrecio() {
        return precio;
    }

    public double getQuincena() {
        return quincena;
    }

}
