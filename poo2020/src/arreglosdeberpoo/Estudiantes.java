package arreglosdeberpoo;

public class Estudiantes {
    //Declaración de variables
    private String[] nombre= new String[5];
    private int[] edad = new int[5];
    private String[] uni = new String[5];
    private String[] celular = new String[5];
    private String mensaje = "";

    /**
     * Método para acceder a la información de la variable nombre
     * @return nombre
     */
    public String[] getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar la información de la variable nombre
     * @param nombre
     */
    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para acceder a la información de la variable edad
     * @return edad
     */
    public int[] getEdad() {
        return edad;
    }

    /**
     * Método para actualizar la información de la variable edad
     * @param edad
     */
    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    /**
     * Método para acceder a la información de la variable uni
     * @return uni
     */
    public String[] getUni() {
        return uni;
    }

    /**
     *Método para actualizar la información de la variable uni
     * @param uni
     */
    public void setUni(String[] uni) {
        this.uni = uni;
    }

    /**
     * Método para acceder a la información de la variable celular
     * @return celular
     */
    public String[] getCelular() {
        return celular;
    }

    /**
     * Método para actualizar la información de la variable celular
     * @param celular
     */
    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    /**
     * Método para acceder a la información de la variable mensaje
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Método para actualizar la información de la variable mensaje
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Método para generar respuesta al usuario
     */
    public void generarMensaje (){
        int c = 1;
        while (c < nombre.length) {
            mensaje = String.format("%sNombre: " + nombre[c] + "\nEdad: " + edad[c]
                    + "\nUniversidad: " + uni[c] + "\nCeluar: " + celular[c]+"\n \n", mensaje);
            c++;
        }
        System.out.println(mensaje);
    }


}
