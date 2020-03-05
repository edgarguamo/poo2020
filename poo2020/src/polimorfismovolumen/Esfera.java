package polimorfismovolumen;

public class Esfera extends Volumen{
    private double radio;
    private double volumenRad;

    public Esfera (double radio, String nombre){
        this.radio = radio;
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public double getVolumenRad() {
        return volumenRad;
    }

    @Override
    public void calcularVolumen() {
        volumenRad = (4/3)*(Math.PI*Math.pow(getRadio(),3));
    }
}
