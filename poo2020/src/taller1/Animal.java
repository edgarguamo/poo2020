package taller1;

public class Animal {
    private String familia;
    private  String raza;
    private String especie;
    private String tamanio;
    private String vDesplazamiento;

    /**
     *Método para obtener la variable familia
     * @return familia
     */
    public String obtenerFamilia(){
        return familia;
    }

    /**
     * Método para obtener la variable raza
     * @return raza
     */

    public String obtenerRaza(){
        return raza;
    }

    /**
     * Método para obtener la variable especie
     * @return especie
     */
    public String obtenerEspecie(){
        return especie;
    }

    /**
     * Método para obtener la variable tamanio
     * @return tamanio
     */
    public String obtenerTamanio(){
        return tamanio;
    }

    /**
     * Método para obtener la variable vDesplazamiento
     * @return vDesplazamiento
     */
    public String obtenervDesplazamiento(){
        return vDesplazamiento;
    }
//<-----------------------------------------------------------------------------

    /**
     * Método para calcular la variable obtener datos
     * @return datos
     */
    public String obtenerDtos(){
        String datos = "Familia: /n"+familia+"/n" + "Raza: /n" +raza+"/n" + "Especie: /n"+especie+"/n" +"Tamanio: /n"
            + tamanio+"/n" +"Velocidad media: /n"+ vDesplazamiento;
        return datos;
    }
//<-----------------------------------------------------------------------------
    /**
     * Metodo para actualizar el valor de la variable familia
     * @param familia
     */
    public void actualizarFamilia(String familia){
        this.familia=familia;
    }

    /**
     * Metodo para actualizar el valor de la variable raza
     * @param raza
     */
    public void actualizarRaza(String raza){
        this.raza=raza;
    }

    /**
     * Metodo para actualizar el valor de la variable especie
     * @param especie
     */
    public void actualizarespecie(String especie){
        this.especie=especie;
    }

    /**
     * Metodo para actualizar el valor de la variable tamanio
     * @param tamanio
     */
    public void actualizarTamanio(String tamanio){
        this.tamanio=tamanio;
    }

    /**
     * Metodo para actualizar el valor de la variable vDesplazamiento
     * @param vDesplazamiento
     */
    public void actualizarvDesplazamiento(String vDesplazamiento){
        this.vDesplazamiento=vDesplazamiento;
    }








}
