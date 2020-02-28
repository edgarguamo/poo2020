package herenciafigura;

public class Rectangulo extends PartesFiguras{

    private double areaRec;

    /**
     * Método para acceder al valor de areaRec
     * @return areaRec
     */
    public double getAreaRec() {
        return areaRec;
    }

    /**
     * Método para calcular el valor de AreaRec
     */
    public void calcualrAreaRec(){
        areaRec = (getAltura() * getBase());
    }

}
