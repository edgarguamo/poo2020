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
public class Comestible extends Producto{
    
    //Declaración de variables
    private String tipo;
    private String tiempoVid;
    
    /**
     * Constructor 
     * @param tipo
     * @param tiempoVid
     * @param nombre
     * @param cantidad
     * @param cantidadTipo
     * @param precio
     * @param marca 
     */
    public Comestible(String tipo, String tiempoVid, String nombre, 
            double cantidad, String cantidadTipo, 
            double precio, String marca) {
        this.tipo = tipo;
        this.tiempoVid = tiempoVid;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadTipo = cantidadTipo;
        this.precio = precio;
        this.marca = marca; 

    }

    /**
     * Método para regresar el valor de la variable tipo
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método para regresar el valor de la varible tiempoVid
     * @return  tiempo vid
     */
    public String getTiempoVid() {
        return tiempoVid;
    }
    
    @Override
    /**
     * Método para calcular el valor del producto 
     * @param cantidadReal
     */
    public void calcularProducto(int cantidadReal){
        valorProducto =  precio * cantidadReal;
    }
}
