package edu.cuc.pruebas;

import edu.cuc.punto2d.Punto2D;

public class PruebaEqualsPunto2D {

    public static void main(String[] args) {
        Punto2D punto1 = new Punto2D(10, 15);
        System.out.println("Punto 1: "+punto1);
        Punto2D punto2 = new Punto2D(10, 5);
        System.out.println("Punto 2: "+punto2);
        if (punto1.equals(punto2)) {
            System.out.println("Son iguales!");
        } else {
            System.out.println("Son diferentes!");
        }
    }
    
}
