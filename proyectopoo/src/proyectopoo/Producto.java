/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author Usuario iTC
 */
public abstract class Producto {
    protected String nombre;
    protected double cantidad;
    protected String cantidadTipo;
    protected double precio;
    protected String marca;
    protected double valorProducto;
    protected String areaProducto;


    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }    
    
    public String getAreaProducto(){
        return areaProducto;
    }
    
    public String getCantidadTipo(){
        return cantidadTipo;
    }

    public void setAreaProducto(String areaProducto) {
        this.areaProducto = areaProducto;
    }

    public double getValorProducto() {
        return valorProducto;
    }
    
            
    public abstract void calcularProducto(int cantidadReal);
    
}
