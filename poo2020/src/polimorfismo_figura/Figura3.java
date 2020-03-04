package polimorfismo_figura;

public abstract class Figura3 {
    /**
     * Declaración de variables
     */
    protected String nomFigura;
    protected double area;

    /**
     * Método para establecer los datos de nomFigura
     * @return nomFigura
     */
    public String getNomFigura() {
        return nomFigura;
    }

    /**
     * Método para actualizar los datos de nomFigura
     * @param nomFigura
     */
    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    /**
     * Método abstracto
     */
    public abstract void calcularArea();

    /**
     * Métoodo para establecer el valor de are
     * @return area
     */
    public double getArea() {
        return area;
    }

}