package polimorfismovolumen;

public class Cono extends Partes {
    private double volumenCono;

    public Cono(double altura, double radio, String nombre){
        this.altura = altura;
        this.radio =radio;
        this.nombre = nombre;
    }

    public double getVolumenCono() {
        return volumenCono;
    }

   @Override
   public void calcularVolumen() {
       volumenCono = (Math.PI*Math.pow(getRadio(),2)*getAltura()/3);
   }
}
