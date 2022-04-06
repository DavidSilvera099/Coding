package cuc.edu.Archivos_Texto;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Este código recibe un archivo de texto .txt y regresa el número de palabras que contiene, teniendo
en cuenta que se distingue una palabra de otra por los espacios en blanco*/

public class WordCounter {
    public static void main(String[] args) {
        File archivo_texto = new File("texto.txt"); //Instancia un archivo .txt con el nombre texto
            int num_palabras = 0;
        try {
            Scanner scanner = new Scanner(archivo_texto); //Instancia un scanner para leer un archivo de texto existente
            while (scanner.hasNext()) { //True siempre que quede una palabra escrita en el .txt
                String data = scanner.next();
                num_palabras++;
                System.out.println("Las palabras que contiene son: " + data);
            }
         
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
