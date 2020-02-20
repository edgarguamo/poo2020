package arreglosdeberpoo;

public class Conversor {
    private String cadena;
    private int[] binario = new int[6];
    private double decimal;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int[] getBinario() {
        return binario;
    }

    public void setBinario(int[] binario) {
        this.binario = binario;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double generalDecimal(){
        int c = 1;
        while (c < binario.length){
            decimal= decimal+(Math.pow(2,binario[c]));
            c++;
        }
        return decimal;
    }

    public void mensaje(){
        System.out.println("El número binario"+cadena+" transformado en decimal es: "+ decimal);
    }

}
