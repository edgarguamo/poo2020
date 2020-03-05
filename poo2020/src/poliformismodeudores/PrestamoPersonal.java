package poliformismodeudores;

public class PrestamoPersonal extends ClienteDeudor{
    //Declaración de variable
    private double deuda;

    public PrestamoPersonal(String nombre, int numCuenta, int numCliente
            , double capitalPres, double tazaInt, int plazoInv){
        this.nombre= nombre;
        this. numCuenta = numCuenta;
        this.numCliente = numCliente;
        this.capitalPres = capitalPres;
        this.tazaInt = tazaInt;
        this.plazoInv = plazoInv;
    }

    public double getDeuda() {
        return deuda;
    }

    @Override
    public void calcularDeuda() {
        deuda = ((Math.pow(1+tazaInt/100,1/12))-1)*capitalPres*12;
        System.out.println((Math.pow(1+tazaInt/100,1/12))-1);
    }
}
