package cuc.edu.ArchivosBinarios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Este código identifica si un archivo específico tiene la extensión .bmp*/

public class IdentificadorBMP {
    public static void main(String[] args) {
        File image = new File("texto.txt"); //Instancia un archivo .bmp con el nombre image
        
        try {
            FileInputStream input = new FileInputStream(image);
            byte byte_leido=0;
            byte[] bytes = new byte[2];
            
            for (int i=0;(i<2)&&(byte_leido!=-1);i++) {
                byte_leido = (byte)input.read(); //Lectura byte por byte (2 primeros bytes)
                bytes[i]=byte_leido;
            }
            input.close(); //Importante, cerrar el flujo
            
            if ((bytes[0]==-1)&&(bytes[1]==0)) {
                System.out.println("Archivo .bmp");
            } else {System.out.println("Archivo no .bmp");}
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IdentificadorBMP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IdentificadorBMP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
