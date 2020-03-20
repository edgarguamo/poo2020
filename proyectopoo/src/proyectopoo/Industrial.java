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
public class Industrial  extends Producto{
    private String toxicidad;
    private String envase;
    
    
    public Industrial(String toxicidad, String envase, String nombre, 
            double cantidad, String cantidadTipo, 
            double precio, String marca) {
        this.toxicidad = toxicidad;
        this.envase = envase;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadTipo = cantidadTipo;
        this.precio = precio;
        this.marca = marca; 

    }

    public String getToxicidad() {
        return toxicidad;
    }

    public String getEnvase() {
        return envase;
    }
    
    @Override
    
    public void calcularProducto(int cantidadReal){
        if (toxicidad.equals("Bajo") || toxicidad.equals("bajo")){
           valorProducto = precio*cantidadReal;
        }else{
            valorProducto = precio*cantidadReal;
            valorProducto = valorProducto * 1.05;
        }
    }
    
}
