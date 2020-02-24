package matrizpoo;

public class SumaMatrices {
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];
    private String impresion;

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public void sumaMatriz(){
     for (int i=0;i<matrizA.length;i++){
         for (int j = 0;j<matrizA.length;j++){
             matrizC[i][j] = matrizA[i][j]+matrizB[i][j];
         }
     }
    }
    public int[][] obtenerSuma(){
        return matrizC;
    }

    public void impresion(int [][]matrizN){
        for (int i=0;i<matrizN.length;i++){
            for (int j = 0; j<matrizN[i].length;j++){
                System.out.print(matrizN[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
