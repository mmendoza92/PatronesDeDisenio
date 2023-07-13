package Visitor;

public class VisitantePerimetro implements Visitante {
    public void visitar(Circulo circulo) {
        double perimetro = 2 * Math.PI * circulo.getRadio();
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    public void visitar(Rectangulo rectangulo) {
        double perimetro = 2 * (rectangulo.getAncho() + rectangulo.getAltura());
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
}