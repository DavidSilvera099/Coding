package edu.cuc.pruebas;

import edu.cuc.punto2d.Punto2D;

public class PruebaFueraPaquetePunto2D {

    public static void main(String[] args) {
        Punto2D punto1 = new Punto2D();
        Punto2D punto2 = new Punto2D(500, 120);
        System.out.println("Valores 1: " + punto1.getValorX() + ", " + punto1.getValorY());
        System.out.println("Valores 2: " + punto2.getValorX() + ", " + punto2.getValorY());
        System.out.println("Nombre Punto 1: "+punto1.getNombrePunto());
        System.out.println("Suma: "+punto1.sumar(punto2));
    }

}
