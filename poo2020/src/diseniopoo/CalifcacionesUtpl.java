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
        if (notaFinal>27.49){
            mensaje= "El estudiante "+nombre+" ha aprovado con la nota: "+notaFinal;
        }else if (notaFinal<27.5){
            mensaje = "El estudiante "+nombre+" ha reprovado la materia con la nota " +
                    "de: "+notaFinal+",\npor lo tanto deberá realizar el examen supletorio ";
        }
        return mensaje;
    }

    public void caliMensaje(){
        System.out.println("\n/////////////////////////////");
        System.out.println("\nEstudiante:"+nombre+"\nAsignatura: "+asig
        +"\nNota Final: "+caliNota(cali1,cali2)+"\n"
                +caliString(caliNota(cali1,cali2))+"\n");
        System.out.println("/////////////////////////////");
    }

}
