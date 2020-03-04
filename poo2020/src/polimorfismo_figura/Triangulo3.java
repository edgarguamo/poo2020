package polimorfismo_figura;

public class Triangulo3 extends Figura3{
    /**
     * Declarcion de variables
     */
    private double baseTri;
    private double alturaTri;

    /**
     * Método para actualizar los datos de baseTri
     * @param baseTri
     */
    public void setBaseTri(double baseTri) {
        this.baseTri = baseTri;
    }

    /**
     * Método para actualizar los daots de alturaTri
     * @param alturaTri
     */
    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }

    @Override
    public void calcularArea() {
        area=baseTri*alturaTri/2;
    }
}
