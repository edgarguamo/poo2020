package polimorfismovolumen;

public abstract class Volumen {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }
    public abstract void calcularVolumen();
}
