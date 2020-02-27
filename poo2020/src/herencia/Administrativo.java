package herencia;

public class Administrativo extends Persona {
    private String dependencia;

    /**
     * Creación del constructor
     * @param nombre
     * @param identificación
     * @param dependencia
     * @param fecha_nac
     * @param estado_civil
     */
    public Administrativo(String nombre, String identificación, String dependencia, String fecha_nac, String estado_civil){
        this.nombre = nombre;
        this.identificacion = identificación;
        this.dependencia = dependencia;
        this.fecha_nac = fecha_nac;
        this.estado_civil=estado_civil;
    }

    /**
     * Método para acceder a la variable dependnecia
     * @return dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * Método para actualizar la variable dependencia
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     * Método gest_pro
     */
    public void gest_pro(){
        System.out.println("Método para gestionar procesos");
    }
}
