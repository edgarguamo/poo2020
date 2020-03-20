/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author Edgar Guamo
 */
public abstract class Producto {
    
    //Declaración de variables
    protected String nombre;
    protected double cantidad;
    protected String cantidadTipo;
    protected double precio;
    protected String marca;
    protected double valorProducto;
    protected String areaProducto;


    /**
     * Método para obtener el valor de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el valor de cantidad
     * @return cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Método para obtener el valor de precio
     * @return cantidad
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * método para obtener los datos de marca 
     * @return marca
     */
    public String getMarca() {
        return marca;
    }    
    
    /**
     * Método para obtener los datos de areaProducto
     * @return areaProducto
     */
    public String getAreaProducto(){
        return areaProducto;
    }
    
    /**
     * Método para obtener los datos de cantidadTipo
     * @return cantidadTipo
     */
    public String getCantidadTipo(){
        return cantidadTipo;
    }

    /**
     * Método para establecer los datos de areaProducto
     * @param areaProducto 
     */
    public void setAreaProducto(String areaProducto) {
        this.areaProducto = areaProducto;
    }

    /**
     * Método para obtener los datos de valorProducto
     * @return valorProducto
     */
    public double getValorProducto() {
        return valorProducto;
    }
    
    /**
     * Mëtodo abstracto para calcular valorProducto 
     * @param cantidadReal 
     */       
    public abstract void calcularProducto(int cantidadReal);
    
}
