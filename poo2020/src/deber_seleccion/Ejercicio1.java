package deber_seleccion;

public class Ejercicio1 {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaFinal;
    private String nombre;
    private String mensaje;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double promedio (double nota1, double nota2,
                            double nota3, double nota4){
        notaFinal = (nota1+nota2+nota3+nota4)/4;
        return notaFinal;
    }

    public String mensaje(double notaFinal){
        if (notaFinal >=60){
            mensaje = "Aprobado";
        } else if (notaFinal < 60) {
            mensaje = "Reprobado";
        }
        return mensaje;
    }

    public void impresion(){
        System.out.println("Nombre: "+nombre+"\nPromedio: "
                +promedio(nota1,nota2,nota3,nota4)+"\nEstado: "
                + mensaje(notaFinal));
    }
}
