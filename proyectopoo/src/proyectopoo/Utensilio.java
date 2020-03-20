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
public class Utensilio extends Producto{
    
    //Declaración de Variables
    private String tipo;
    
    /**
     * Constructor
     * @param tipo
     * @param nombre
     * @param cantidad
     * @param cantidadTipo
     * @param precio
     * @param marca 
     */
     public Utensilio(String tipo, String nombre, 
             double cantidad, String cantidadTipo, 
            double precio, String marca) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadTipo = cantidadTipo;
        this.precio = precio;
        this.marca = marca; 

    }

     /**
      * Método para obtener el valor de tipo
      * @return tipo
      */
    public String getTipo() {
        return tipo;
    }
    
    @Override
    
    /**
     * Método para calcular valorProducto
     * @param cantidadReal
     */
    public void calcularProducto(int cantidadReal){
        valorProducto = precio * cantidadReal;
    }
       
    
    
}
