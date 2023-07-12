package Command;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1,200);

        Depositar depositar = new Depositar(cuenta,100);
        Retirar retirar = new Retirar(cuenta,50);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(depositar);
        ivk.recibirOperacion(retirar);

        ivk.realizarOperacion();
    }
}