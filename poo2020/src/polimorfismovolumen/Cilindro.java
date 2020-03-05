package polimorfismovolumen;

import poliformismo_automotriz.Vendedor;

public class Cilindro extends Partes {
    private double volumenCil;


    public Cilindro(double radio, double altura, String nombre){
        this.altura = altura;
        this.radio = radio;
        this.nombre=nombre;
    }

    public double getVolumenCil() {
        return volumenCil;
    }

    @Override
    public void calcularVolumen() {
        volumenCil = Math.PI*Math.pow(getRadio(),2)*getAltura();
    }
}
