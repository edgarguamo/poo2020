package arreglosdeberpoo;

import org.w3c.dom.ls.LSOutput;

public class Conversor {
    /**
     * Declaración de variables
     */
    private String cadena;
    private int longitud=0;
    private int[] binario = new int[longitud];
    private double decimal = 0;

    /**
     * Método para acceder a la variable cadena
     * @return cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Método para actualizar la información de la variable cadena
     * @param cadena
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * Método para acceder a la variable longitud
     * @return longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Método para actualizar la información de la variable longitud
     * @param longitud
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Método para acceder a la variable binario
     * @return binario
     */
    public int[] getBinario() {
        return binario;
    }

    /**
     * Método para actualizar la información de la variable binario
     * @param binario
     */
    public void setBinario(int[] binario) {
        this.binario = binario;
    }

    /**
     * Método para acceder a la variable decimal
     * @return decimal
     */
    public double getDecimal() {
        return decimal;
    }

    /**
     * Método para actualizar la información de la variable decimal
     * @param decimal
     */
    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    /**
     * Método para transformar un array de enteros a un entero
     */
    public void generarDecimal(){
        int c =0;
        int exp = longitud;
        while (c <= longitud){
            if (binario[c] == 1){
                decimal= decimal+(Math.pow(2,exp));
            }
            c++;
            exp--;
        }
    }

    /**
     * Método para generar el mensaje a consola
     */
    public void mensaje(){
        System.out.println("El número binario "+cadena+" transformado en decimal es: "+ decimal);
    }


}
