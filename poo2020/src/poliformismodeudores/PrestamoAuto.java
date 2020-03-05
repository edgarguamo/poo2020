package poliformismodeudores;

public class PrestamoAuto extends ClienteDeudor{
    //Declaración de variables
    private double interesBP = 11.23;
    private double deuda;

    public PrestamoAuto(String nombre, int numCuenta, int numCliente
            , double capitalPres, double tazaInt, int plazoInv){
        this.nombre= nombre;
        this. numCuenta = numCuenta;
        this.numCliente = numCliente;
        this.capitalPres = capitalPres;
        this.tazaInt = tazaInt;
        this.plazoInv = plazoInv;
    }

    public double getTotalPagar() {
        return deuda;
    }

    @Override
    public void calcularDeuda() {
        deuda = capitalPres * tazaInt*plazoInv/1200;
    }
}
