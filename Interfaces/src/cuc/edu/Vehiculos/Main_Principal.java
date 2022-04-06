package cuc.edu.Vehiculos;



import cuc.edu.Vehiculos.Barco;
import cuc.edu.Vehiculos.Coche;
import cuc.edu.Vehiculos.Vehiculo_Anfibio;

public class Main_Principal {

    public static void main(String[] args) {
        //Objetos tipo barco
        Barco barco1 = new Barco();
        barco1.Acelerar();
        barco1.Frenar();
        barco1.girar();
        barco1.navegar();
        System.out.println("//////////////////////////////////");
        //Objetos tipo coche
        Coche carro1 = new Coche();
        carro1.Acelerar();
        carro1.Frenar();
        carro1.girar();
        carro1.rodar();
        System.out.println("//////////////////////////////////");
        //Objetos tipo vehiculo anfibio
        Vehiculo_Anfibio vehiculo1 = new Vehiculo_Anfibio();
        vehiculo1.Acelerar();
        vehiculo1.Frenar();
        vehiculo1.girar();
        vehiculo1.navegar();
        vehiculo1.rodar();
    }

}
