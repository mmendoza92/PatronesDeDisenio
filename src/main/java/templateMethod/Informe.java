package templateMethod;

public abstract class Informe {
    public void generarInforme() {
        generarEncabezado();
        generarCuerpo();
        generarPie();
    }

    protected abstract void generarEncabezado();

    protected abstract void generarCuerpo();

    protected abstract void generarPie();
}