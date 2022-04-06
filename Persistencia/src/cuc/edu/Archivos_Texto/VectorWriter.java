package cuc.edu.Archivos_Texto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Este código pide una serie de números que son almacenadas en un vector para después ser guardados en
un archivo de texto .txt*/

public class VectorWriter {
    public static void main(String[] args) {
        Scanner scan_int = new Scanner(System.in);
        System.out.println("¿Cuántos números desea guardar?");
        int cantidad = scan_int.nextInt(); //Recibe la cantidad de números que tendrá el vector
        int[] numeros = new int[cantidad];
        //Lee los números a guardar en el vector
        for (int i=0;i<numeros.length;i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scan_int.nextInt();
        }
        
        File archivo_vector = new File("vector.txt"); //Instancia un archivo .txt con el nombre vector
        try {
            FileWriter writer = new FileWriter(archivo_vector); //Instancia un objeto FileWriter para escribir archivos de texto
            writer.write("[");
            for (int i=0;i<numeros.length;i++) { //Recorre el vector
                if (i == numeros.length-1){ //Si es el último número
                    writer.write(Integer.toString(numeros[i])); //Escribe el último número del vector sin espacios y sin coma
                } else {
                    writer.write(numeros[i]+", "); //Escribe el vector de números uno a uno, en el .txt
                }
            }
            writer.write("]");
            
            System.out.println("¡Escritura exitosa!");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(VectorWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
