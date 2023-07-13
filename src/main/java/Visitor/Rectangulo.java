package Visitor;

public class Rectangulo implements Elemento {
    private double ancho;
    private double altura;

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
}
