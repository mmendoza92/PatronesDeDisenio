package templateMethod;

public class Main {
    public static void main(String[] args) {
        Informe informeVentas = new InformeVentas();
        Informe informeGastos = new InformeGastos();

        System.out.println("Generando informe de ventas:");
        informeVentas.generarInforme();

        System.out.println("\nGenerando informe de gastos:");
        informeGastos.generarInforme();
    }
}