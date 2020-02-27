package herencia;

/**
 * Clase que hereda de la clase persona
 * Contendra Todos los atributos y métodos definicos en persona
 */
public class Estudiante extends Persona{
    //Atributos propios de esta clase
    private  String carrera;
    public String getCarrera(){
        return carrera;
    }

    /**
     * Constructor para la clase Estudiante
     * @param carrera
     * @param nombre
     * @param estado_civil
     * @param fecha_nac
     * @param identificacion
     */
    public Estudiante(String carrera, String nombre, String estado_civil, String fecha_nac, String identificacion){
        this.carrera = carrera;
        this.nombre = nombre;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
        this.identificacion = identificacion;

    }

    /**
     * Método para actualizar los datos de la variable carrera
     * @param carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Método matricular
     */
    public void matricular(){
        System.out.println("Método para matricular");
    }

    /**
     * Método aprender
     */
    public void aprender(){
        System.out.println("Método para aprender");
    }

}
