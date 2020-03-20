package taller1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String sexo;
    private String institucion;
    private String curso;

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
     * Metodo para obtener el valor de la variable institucion
     * @return institucion
     */
    public String obtenerInstitucion() {
        return institucion;
    }

    /**
     * Metodo para obtener el valor de la variable curso
     * @return curso
     */
    public String obtenerCurso() {
        return curso;
    }

    public String estudiar(){
        String estudios = institucion + ":"+curso;
        return  estudios;
    }

    public String asistir (){
        String asistir = "En esta variable ira el nombre y numero de asistencias del alumno por clase";
        return asistir;
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
     * Metodo para actualizar el valor de la variable institucion
     * @param institucion
     */
    public void actualizarInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * Metodo para actualizar el valro de la variable curso
     * @param curso
     */
    public void actualizarCurso(String curso) {
        this.curso = curso;
    }
}
