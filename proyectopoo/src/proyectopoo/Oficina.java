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
public class Oficina extends Producto {
    
    private String tamanio;
    
    public Oficina(String tamanio, String nombre, 
            double cantidad, String cantidadTipo, 
            double precio, String marca) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadTipo = cantidadTipo;
        this.precio = precio;
        this.marca = marca; 

    }

    public String getTamanio() {
        return tamanio;
    }
    
    @Override
    
    public void calcularProducto(int cantidadReal){
        valorProducto = precio * cantidadReal;
    }
    
    
    
    
}
