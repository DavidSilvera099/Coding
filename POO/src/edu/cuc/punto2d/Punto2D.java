package edu.cuc.punto2d;

import java.util.Objects;

public class Punto2D {
    //1. Atributos
    private int valorX;
    private int valorY;
    private static String nombrePunto = "Punto";
    
    //2. Constructores
    public Punto2D() { //Constructor por defecto
    }
    public Punto2D(int valorX, int valorY) { //Constructor personalizado
        this.valorX = valorX;
        this.valorY = valorY;
    }
    
    //3. Métodos de acceso (accesors)
    //Atributos se permiten leer/ver
    public int getValorX() {
        return valorX;
    }
    public int getValorY() {
        return valorY;
    }
    public String getNombrePunto() {
        return nombrePunto;
    }
    //Atributos se permiten modificar/cambiar
    public void setValorX(int valorX) {
        this.valorX = valorX;
    }
    public void setValorY(int valorY) {
        this.valorY = valorY;
    }
    
    //4. Método toString
    @Override
    public String toString() {
        return "(" + valorX + ", " + valorY + ')';
    }
    
    //5. Método equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.valorX;
        hash = 97 * hash + this.valorY;
        hash = 97 * hash + Objects.hashCode(this.nombrePunto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punto2D other = (Punto2D) obj;
        if (this.valorX != other.valorX) {
            return false;
        }
        if (this.valorY != other.valorY) {
            return false;
        }
        return true;
    }
    
    //6. Métodos de instancia o de clase 
    public Punto2D sumar(Punto2D punto2) {
        Punto2D suma = new Punto2D(this.valorX + punto2.valorX, this.valorY + punto2.valorY);
        return suma;
    }
    
    public static Punto2D crearPunto0() {
        return new Punto2D();
    }
}
