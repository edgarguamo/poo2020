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
public class Comestible extends Producto{
    private String tipo;
    private String tiempoVid;
    
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

    public String getTipo() {
        return tipo;
    }

    public String getTiempoVid() {
        return tiempoVid;
    }
    
    @Override
    
    public void calcularProducto(int cantidadReal){
        valorProducto =  precio * cantidadReal;
    }
}
