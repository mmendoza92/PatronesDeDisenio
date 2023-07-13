package Visitor;


public class Circulo implements Elemento {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }}
