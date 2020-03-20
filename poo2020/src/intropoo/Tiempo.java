package intropoo;

public class Tiempo {
    //definicion de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * M'etodo para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora(){
        return this.hora;
    }

    /**
     * M'etodo para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto(){
        return this.minuto;
    }

    /**
     * M'etodo para obtener el valor de la variable segundo
     * @return this.segundo
     */
    public int obtener_segundo(){
        return this.segundo;
    }

    /**
     * M'etodo para obtener el valor de la variable tiempo
     * @return tiempo
     */
    public String obtener_tiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * M'etodo para actualizar el valor de la variable hora
     * @param  hora
     */
    public void actualizar_hora(int hora){
        //con el this hacemos referencia a variables globales
        this.hora=hora;
    }

    /**
     * M'etodo para actualizar el valor de la variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto=minuto;
    }

    /**
     * M'etodo para actualizar el valor de la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        this.segundo=segundo;
    }

}
