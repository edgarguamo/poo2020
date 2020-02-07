package diseniopoo;

public class Cerveza {
    private double precio;
    private int unidadesVendidas;
    private String nombre;
    private String tipo;

    public Cerveza (double precio, int unidadesVendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidadesVendidas = unidadesVendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double totalVentas (double precio, int unidadesVendidas){
        double totalVentas = precio * unidadesVendidas;
        return  totalVentas;
    }

    public void presentar (){
        System.out.println("\nCerveza: "+ getNombre());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Unidades Vendidas: "+ getUnidadesVendidas());
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
