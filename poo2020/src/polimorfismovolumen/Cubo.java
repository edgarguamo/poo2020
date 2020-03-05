package polimorfismovolumen;

public class Cubo extends Volumen{
    private double arista;
    private double volumenCubo;

    public Cubo(double arista, String nombre){
        this.arista = arista;
        this.nombre = nombre;
    }

    public double getArista() {
        return arista;
    }

    public double getVolumenCubo() {
        return volumenCubo;
    }

    @Override
    public void calcularVolumen() {
        volumenCubo = Math.pow(getArista(),3);
    }
}
