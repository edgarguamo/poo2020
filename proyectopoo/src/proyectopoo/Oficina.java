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
public class Oficina extends Producto {
    //Declaración de variables 
    private String tamanio;
    
    /**
     * Constructor 
     * @param tamanio
     * @param nombre
     * @param cantidad
     * @param cantidadTipo
     * @param precio
     * @param marca 
     */
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

    /**
     * Método para obtener el balor de la variable tamanio
     * @return tamanio
     */
    public String getTamanio() {
        return tamanio;
    }
    
    @Override
    /**
     * Método para calcular valorProducto
     * @param cantiadaReal
     */
    public void calcularProducto(int cantidadReal){
        valorProducto = precio * cantidadReal;
    }
    
    
    
    
}
