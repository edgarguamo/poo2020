package arreglosdeberpoo;

public class Cedula {
    /**
     * Declaración de variables
     */
    private int[] cedula = new int[10];
    private int[] coeficiente = {2,1,2,1,2,1,2,1,2};
    private int resultado=0;
    private String mensaje;
    private int decena;

    /**
     * Método para obtener los datos de la variable cedula
     * @return cedula
     */
    public int[] getCedula() {
        return cedula;
    }

    /**
     * Método para actualizar  los datos de la variable cedula
     * @param cedula
     */
    public void setCedula(int[] cedula) {
        this.cedula = cedula;
    }

    /**
     * Método para obtener los datos de la variable coeficiente
     * @return coeficiente
     */
    public int[] getCoeficiente() {
        return coeficiente;
    }

    /**
     * Método para actualizar  los datos de la variable coeficiente
     * @param coeficiente
     */
    public void setCoeficiente(int[] coeficiente) {
        this.coeficiente = coeficiente;
    }

    /**
     * Método para obtener los datos de la variable resultado
     * @return resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Método para actualizar  los datos de la variable resultado
     * @param resultado
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * Método para obtener los datos de la variable mensaje
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Método para actualizar  los datos de la variable mensaje
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Método para obtener los datos de la variable decena
     * @return decena
     */
    public int getDecena() {
        return decena;
    }

    /**
     * Método para actualizar  los datos de la variable decena
     * @param decena
     */
    public void setDecena(int decena) {
        this.decena = decena;
    }

    /**
     * Método que realiza los calculos para validar una cedula
     * @return decena
     */
    public int validarCedula(){
        int c = 0;
        int limite = cedula.length-2;
        while (c<=limite){
            int aux = cedula[c]* coeficiente[c];
            if (aux>10){
                aux = aux-9;
            }
            System.out.println(cedula[c]);
            resultado = resultado+aux;

            decena = resultado -resultado%10 +10;
            decena = decena -resultado;
            c++;
        }
        System.out.println(resultado);
        return decena;
    }

    /**
     * Método para generar el mensaje
     */
    public void generarMensaje(){
        if (decena == cedula[9] || decena==10){
            mensaje = "El número de cedula es correcto";
        }else {
            mensaje = "El número de cedula es incorrecto";
        }
        System.out.println(mensaje);
    }
}
