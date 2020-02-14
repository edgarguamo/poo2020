/*
Realizado por: Edgar Guamo M y David Morales
*/
package taller_repeticion;

public class Factorial {
    private int num;
    private int factorial =1;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }

    public int calcularFactorial(){
        while (num > 0) {
            factorial = factorial*num;
            num = num-1;
        }
        return factorial;
    }
}
