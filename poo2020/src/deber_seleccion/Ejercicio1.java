package deber_seleccion;

public class Ejercicio1 {
    //Declaración de variables
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaFinal;
    private String nombre;
    private String mensaje;

    /**
     * Método para obtener el valor de nota1
     * @return nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Método para actualizar el valor de nota1
     * @param nota1
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * Método para obtener el valor de nota2
     * @return nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Método para actualizar el valor de nota2
     * @param nota2
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * Método para obtener el valor de nota3
     * @return nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Método para actualizar el valor de nota3
     * @param nota3
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * Método para obtener el valor de nota4
     * @return nota4
     */
    public double getNota4() {
        return nota4;
    }

    /**
     * Método para actualizar el valor de nota4
     * @param nota4
     */
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    /**
     * Método para obtener el valor de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para actualizar el valor de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el valor de mensaje
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Método para actualizar el valor de mensaje
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Método para calcular el promedio
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     * @return notaFinal
     */
    public double promedio (double nota1, double nota2,
                            double nota3, double nota4){
        notaFinal = (nota1+nota2+nota3+nota4)/4;
        return notaFinal;
    }

    /**
     * Método para generar el mensaje en función de la nota
     * @param notaFinal
     * @return mensaje
     */
    public String mensaje(double notaFinal){
        if (notaFinal >=60){
            mensaje = "Aprobado";
        } else if (notaFinal < 60) {
            mensaje = "Reprobado";
        }
        return mensaje;
    }

    /**
     * Método usado para la impresiom
     */
    public void impresion(){
        System.out.println("Nombre: "+nombre+"\nPromedio: "
                +promedio(nota1,nota2,nota3,nota4)+"\nEstado: "
                + mensaje(notaFinal));
    }
}
