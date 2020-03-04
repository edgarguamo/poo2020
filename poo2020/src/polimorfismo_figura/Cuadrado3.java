package polimorfismo_figura;

public class Cuadrado3 extends Figura3{
    //declaración de variables
    private double ladoCuad;

    /**
     * Método para actualizar los datos de ladoCuad
     * @param ladoCuad
     */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad,2);
    }
}
