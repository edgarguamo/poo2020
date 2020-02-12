package disenio_seleccion;

public class Dia {
    private int num;
    private String texto;

    /**
     * Método para obtener el valor de la variable num
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * Método para actualizar el número
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Método para obtener el valor de la variable texto
     * @return  texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Método para actualizar el texto
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String calcularDia(){
        switch (num){
            case 1:
                texto = "Domingo";
                break;
            case 2:
                texto = "Lunes";
                break;
            case 3:
                texto = "Martes";
                break;
            case 4:
                texto = "Miércoles";
                break;
            case 5:
                texto = "Jueves";
                break;
            case 6:
                texto = "Viernes";
                break;
            case 7:
                texto= "Sábado";
                break;
            default:
                texto= "Opción incorrecta";
        }
        return texto;
    }

}
