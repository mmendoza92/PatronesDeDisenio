package templateMethod;

public class InformeGastos extends Informe {
    protected void generarEncabezado() {
        System.out.println("Generando encabezado del informe de gastos");
    }

    protected void generarCuerpo() {
        System.out.println("Generando cuerpo del informe de gastos");
    }

    protected void generarPie() {
        System.out.println("Generando pie del informe de gastos");
    }
}