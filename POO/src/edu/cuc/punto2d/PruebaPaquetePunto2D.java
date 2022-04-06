package edu.cuc.punto2d;

public class PruebaPaquetePunto2D {

    public static void main(String[] args) {
        Punto2D punto1 = new Punto2D();
        Punto2D punto2 = new Punto2D(-10, 20);
        System.out.println("Valores 1: " + punto1.getValorX() + ", " + punto1.getValorY());
        System.out.println("Valores 2: " + punto2.getValorX() + ", " + punto2.getValorY());
        punto1.setValorY(10);
        System.out.println("Valores: " + punto1.getValorX() + ", " + punto1.getValorY());
        punto2.setValorX(punto1.getValorX() - punto2.getValorX());
        System.out.println("Valores 2: " + punto2.getValorX() + ", " + punto2.getValorY());
        System.out.println("Punto 1: "+punto1.toString());
        System.out.println("Punto 2: "+punto2.toString());
    }

}
