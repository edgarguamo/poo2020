package herenciafigura;

public class Triangulo extends PartesFiguras {
    protected double areaTri;

    /**
     * Método para acceder al valor de areaTri
     * @return areaTri
     */
    public double getAreaTri() {
        return areaTri;
    }

    /**
     * Mëtodo para actualizar el valor de areaTri
     */
    public void calcularAreaTri(){
        areaTri = (getAltura()*getBase())/2;
    }

}
