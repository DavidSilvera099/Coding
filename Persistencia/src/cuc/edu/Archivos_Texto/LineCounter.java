package cuc.edu.Archivos_Texto;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Este código toma un archivo de texto especifico existente y retorna el número de líneas que contiene*/

public class LineCounter {
    public static void main(String[] args) {
        File archivo_texto = new File("texto.txt"); //Instancia un archivo .txt con el nombre texto
        int contadorLinea = 0;
        try {
            Scanner scanner = new Scanner(archivo_texto); //Instancia un scanner para leer un archivo de texto existente
            while (scanner.hasNextLine()) { //True siempre que quede una línea escrita en el .txt
                String data = scanner.nextLine();
                contadorLinea++;
            }
            scanner.close();
            System.out.println("El archivo tiene: " + contadorLinea + " líneas.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LineCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
