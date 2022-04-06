package cuc.edu.Leer;
import java.io.FileReader;
import java.io.IOException;


public class Persistencia_leer {
    public static void main(String[] args) {
        //Instaciar para correr el programa
        Metodo_leer accediendo = new Metodo_leer();
        accediendo.lee();
    }

   public static class Metodo_leer {
        //Busqueda del archivo
        public void lee() {
            try {//Si encuentra el archivo en la ruta
                FileReader entrada = new FileReader("Para leer.txt"); 
                //Metodo para leer
                int lea=0;
                while (lea != -1) {//Mientras while no haya llegado al final                    
                    lea = entrada.read();
                    //Para que el archivo sea legible
                    char legible = (char)lea;
                    System.out.print(legible);
                }
                
            }catch (IOException ex) {//Si no encuentra el archivo en la ruta
               System.out.println("Archivo no encontrado");
            }              
        }
    }
}
