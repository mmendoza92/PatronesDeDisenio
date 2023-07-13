/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

public class VisitanteArea implements Visitante {
    public void visitar(Circulo circulo) {
        double area = Math.PI * circulo.getRadio() * circulo.getRadio();
        System.out.println("Área del círculo: " + area);
    }

    public void visitar(Rectangulo rectangulo) {
        double area = rectangulo.getAncho() * rectangulo.getAltura();
        System.out.println("Área del rectángulo: " + area);
    }
}
