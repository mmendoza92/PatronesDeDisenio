package templateMethod;

public class InformeVentas extends Informe {
    protected void generarEncabezado() {
        System.out.println("Generando encabezado del informe de ventas");
    }

    protected void generarCuerpo() {
        System.out.println("Generando cuerpo del informe de ventas");
    }

    protected void generarPie() {
        System.out.println("Generando pie del informe de ventas");
    }
}

