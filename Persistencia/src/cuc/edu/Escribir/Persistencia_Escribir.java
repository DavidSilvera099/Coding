package cuc.edu.Escribir;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import jdk.jfr.events.FileWriteEvent;

public class Persistencia_Escribir {

    public static void main(String[] args) {
        //Instaciar para correr el programa
        Metodo_escribir pruebaEscritura = new Metodo_escribir();
        pruebaEscritura.Metodo_escribir();
    }

    public static class Metodo_escribir {
        public void Metodo_escribir() {
            //Tomar los datos a escribir
            String escriba = "";
            escriba=JOptionPane.showInputDialog("Doha"+escriba);
            try {//Si se encuentra el archivo a escribir
                //Crear la declaracion y ruta
                FileWriter escribiendo = new FileWriter("Para escribir.txt");
                //Ciclo para recorrer cada caracter que se escriba
                for (int i = 0; i < escriba.length(); i++) {
                    escribiendo.write(escriba.charAt(i));
                }
                //Despues de que se escribió, se cierra el programa 
                escribiendo.close();
                } catch (IOException ex) {//Si no se encuentra el archivo a escribir
                System.out.println("No se encontró el archivo");
            }

        }

    }

}
