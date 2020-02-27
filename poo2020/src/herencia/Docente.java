package herencia;

public class Docente extends Persona {
    private String area;

    /**
     * Cosntructor Docente
     * @param nombre
     * @param identificación
     * @param area
     * @param fecha_nac
     * @param estado_civil
     */
    public Docente(String nombre, String identificación, String area, String fecha_nac, String estado_civil){
        this.nombre= nombre;
        this.identificacion = identificación;
        this.area = area;
        this.fecha_nac = fecha_nac;
        this.estado_civil = estado_civil;
    }

    /**
     * Método para acceder a la variable area
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * Método para actualizar los datos de la variable area
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Método enseniar
     */
    public void enseniar(){
        System.out.println("Método para enseniar");
    }

    /**
     * Método calificar
     */
    public void calificar(){
        System.out.println("Método para calificar");
    }
}
