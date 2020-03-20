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
public class Industrial  extends Producto{
    
    //Declaración de variables
    private String toxicidad;
    private String envase;
    
    
    /**
     * Constructor
     * @param toxicidad
     * @param envase
     * @param nombre
     * @param cantidad
     * @param cantidadTipo
     * @param precio
     * @param marca 
     */
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

    /**
     * Método para obtener el valor de la variable toxicidad
     * @return toxicidad
     */
    public String getToxicidad() {
        return toxicidad;
    }
    
    /**
     * Método para obtener el valor de la variable envase
     * @return envase
     */
    public String getEnvase() {
        return envase;
    }
    
    @Override
    /**
     * Método para calcular valorProducto
     * @param cantidadReal
     */
    public void calcularProducto(int cantidadReal){
        if (toxicidad.equals("Bajo") || toxicidad.equals("bajo")){
           valorProducto = precio*cantidadReal;
        }else{
            valorProducto = precio*cantidadReal;
            valorProducto = valorProducto * 1.05;
        }
    }
    
}
