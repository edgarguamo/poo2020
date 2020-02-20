package arreglosdeberpoo;

public class Estudiantes {
    private String[] nombre= new String[5];
    private int[] edad = new int[5];
    private String[] uni = new String[5];
    private String[] celular = new String[5];
    private String mensaje = "";

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUni() {
        return uni;
    }

    public void setUni(String[] uni) {
        this.uni = uni;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

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
