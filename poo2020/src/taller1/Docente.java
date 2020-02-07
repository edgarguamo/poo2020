package taller1;

public class Docente {
    private String nombre;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private String institucion;

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el valor de la variable edad
     * @return edad
     */
    public int obtenerEdad() {
        return edad;
    }

    /**
     * Metodo para obtener el valor de la variable sexo
     * @return sexo
     */
    public String obtenerSexo() {
        return sexo;
    }

    /**
     * Metodo para obtener el valor de la variable estadoCivil
     * @return estadoCivil
     */
    public String obtenerEstadoCivil(){
        return estadoCivil
    }

    /**
     * Metodo para obtener el valor de la variable institucion
     * @return institucion
     */
    public String obtenerInstitucion() {
        return institucion;
    }


    public String enseniar(){
        String enseiar = "En esta varaible se alamacenara el pensul de estudio";
        return enseiar;
    }

    public String calificar (){
        String calificar = "En Esta variable se alamcenara las calificaciones de los estudianntes";
        return calificar;
    }

    /**
     * Metodo para actualizar el valor de la variable nombre
     * @param nombre
     */
    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar el valor de la variable edad
     * @param edad
     */
    public void actualizarEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo para actualizar el valor de la variable sexo
     * @param sexo
     */
    public void actualizarSexo(String sexo){
        this.sexo=sexo;
    }

    /**
     * Metodo para actualizar el valor de la variable estadoCivil
     * @param erstadoCivil
     */
    public String actualizarEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Metodo para actualizar el valor de la variable institucion
     * @param institucion
     */
    public void actualizarInstitucion(String institucion) {
        this.institucion = institucion;
    }

}
