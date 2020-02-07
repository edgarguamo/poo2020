package taller1;

public class Animal {
    private String familia;
    private  String raza;
    private String especie;
    private String tamanio;
    private String vDesplazamiento;

    /**
     *
     * @return familia
     */
    public String obtenerFamilia(){
        return familia;
    }

    public String obtenerRaza(){
        return raza;
    }

    public String obtenerEspecie(){
        return especie;
    }

    public String obtenerTamanio(){
        return tamanio;
    }

    public String obtenervDesplazamiento(){
        return vDesplazamiento;
    }

    public String obtenerDtos(){
        String datos = "Familia: /n"familia+"/n" + "Raza: /n" +raza+"/n" + "Especie: /n"especie+"/n" +"Tamanio: /n"
            + tamanio+"/n" +"Velocidad media: /n"+ vDesplazamiento;
        return datos;
    }

    public void actualizarFamilia(String familia){
        this.familia=familia;
    }

    public void actualizarRaza(String raza){
        this.raza=raza;
    }

    public void actualizarespecie(String especie){
        this.especie=especie;
    }

    public void actualizarTamanio(String tamanio){
        this.tamanio=tamanio;
    }

    public void actualizarvDesplazamiento(String vDesplazamiento){
        this.vDesplazamiento=vDesplazamiento;
    }








}
