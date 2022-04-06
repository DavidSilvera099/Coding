package cuc.edu.Vehiculos;

public class Coche implements Vehiculo_Terrestre {

    @Override
    public void Acelerar() {
        System.out.println("El coche acelero");
    }

    @Override
    public void Frenar() {
        System.out.println("El coche frenó");
    }

    @Override
    public void girar() {
        System.out.println("El coche giró");
    }

    @Override
    public void rodar() {
        System.out.println("El coche rodó");
    }

}
