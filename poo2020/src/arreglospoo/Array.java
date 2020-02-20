package arreglospoo;

public class Array {
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int sumatoria_producto = 0;


    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria_producto(){
        return  sumatoria_producto;
    }

    public int calcularSumatoria(){
        int c= 0;
        while (c<vectorA.length){
            sumatoria_producto = sumatoria_producto+(vectorA[c] + vectorB[c]);
            c= c+1;
        }
        return sumatoria_producto;
    }
}
