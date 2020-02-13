package deber_seleccion;

public class Ejercicio3 {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int numMayor;

    /**
     * Método para obtener el valor de num1
     * @return num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Método para actualizar el valor de num1
     * @param num1
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Método para obtener el valor de num2
     * @return num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Método para actualizar el valor de num2
     * @param num2
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Método para obtener el valor de num3
     * @return num3
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Método para actualizar el valor de num3
     * @param num3
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }

    /**
     * Método para obtener el valor de num4
     * @return num4
     */
    public int getNum4() {
        return num4;
    }

    /**
     * Método para actualizar el valor de num4
     * @param num4
     */
    public void setNum4(int num4) {
        this.num4 = num4;
    }

    /**
     * Méyodo para calcular el número mayor
     * @return numMayor
     */
    public int numMayor (){
        if (num1 > num2 && num1 > num3 && num1>num4){
            numMayor = num1;
        }else {
            if (num2 > num3 && num2 > num4) {
                numMayor = num2;
            } else {
                if (num3 > num4) {
                    numMayor = num3;
                } else {
                    numMayor = num4;
                }

            }

        }
        return numMayor;
    }

    /**
     * Método para obtener el valor de numMayor
     * @return numMayor
     */
    public int getNumMayor() {
        return numMayor;
    }

}
