package Visitor;

public class Main {
    public static void main(String[] args) {
        Elemento[] elementos = {new Circulo(5), new Rectangulo(3, 4)};
        Visitante visitanteArea = new VisitanteArea();
        Visitante visitantePerimetro = new VisitantePerimetro();

        for (Elemento elemento : elementos) {
            elemento.aceptar(visitanteArea);
            elemento.aceptar(visitantePerimetro);
            System.out.println();
        }
    }
}
