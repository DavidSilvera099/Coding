package cuc.edu.Vehiculos;

public class Vehiculo_Anfibio implements Vehiculo_Terrestre, Vehiculo_Acuatico {

    @Override
    public void Acelerar() {
        System.out.println("El vehiculo aceleró");
    }

    @Override
    public void Frenar() {
        System.out.println("El vehiculo frenó");
    }

    @Override
    public void girar() {
        System.out.println("El vehiculo giró");
    }

    @Override
    public void navegar() {
        System.out.println("El vehiculo comenzo a navegar");
    }

    @Override
    public void rodar() {
        System.out.println("El vehiculo rodó");
    }

}
