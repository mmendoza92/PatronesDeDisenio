package Command;

public class Depositar implements Operacion {

    private Cuenta cuenta;
    private double monto;

    public Depositar(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
    this.cuenta.despositar(this.monto);
    }
}
