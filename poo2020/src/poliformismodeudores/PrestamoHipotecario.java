package poliformismodeudores;

public class PrestamoHipotecario extends ClienteDeudor{
    //Declaración de variables
    private double deuda;

    public PrestamoHipotecario(String nombre, int numCuenta, int numCliente
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
        deuda = capitalPres*((Math.pow((1+tazaInt/100),plazoInv)*tazaInt/100)
                / (Math.pow(1+tazaInt/100,plazoInv)-1));
    }
}
