package diseniopoo;

public class CalifcacionesUtpl {
    private  String nombre;
    private double cali1;
    private double cali2;
    private String mensaje;
    private  String asig;

    public CalifcacionesUtpl (String nombre, String asig, double cali1, double cali2, String mensaje){
        this.nombre = nombre;
        this.asig = asig;
        this.cali1 = cali1;
        this.cali2 = cali2;
        this.mensaje= mensaje;
    }

    public double caliNota (double cali1, double cali2){
        double notaFinal = cali1+cali2;
        return notaFinal;
    }

    public String caliString ( double notaFinal){
        String caliString="";
        if (notaFinal>27.49){
            caliString= "El estudiante "+nombre+" ha aprovado con la nota: "+notaFinal;
        }else if (notaFinal<27.5){
            caliString = "El estudiante "+nombre+" ha reprovado la materia con la nota " +
                    "de: "+notaFinal+",\npor lo tanto deberá realizar el examen supletorio ";
        }
        return caliString;
    }

    public void impresion(){
        System.out.println("\n/////////////////////////////");
        System.out.println("\nEstudiante:"+nombre+"\nAsignatura: "+asig
        +"\nNota Final: "+caliNota(cali1,cali2)+"\n"
                +caliString(caliNota(cali1,cali2))+"\n");
        System.out.println("/////////////////////////////");
    }

    /**
     *
     * @return
     */
    public double getCali1() {
        return cali1;
    }

    public void setCali1(double cali1) {
        this.cali1 = cali1;
    }

    public double getCali2() {
        return cali2;
    }

    public void setCali2(double cali2) {
        this.cali2 = cali2;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
