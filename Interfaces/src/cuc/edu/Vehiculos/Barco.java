package cuc.edu.Vehiculos;

public class Barco implements Vehiculo_Acuatico {

    @Override
    public void Acelerar() {
        System.out.println("El barco aceleró");
    }

    @Override
    public void Frenar() {
        System.out.println("El barco frenó");
    }

    @Override
    public void girar() {
        System.out.println("El barco giró");
    }

    @Override
    public void navegar() {
        System.out.println("El barco comenzo a navegar");
    }

}
