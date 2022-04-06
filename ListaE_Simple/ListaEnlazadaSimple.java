/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu.ListaE_Simple;

import javax.swing.JOptionPane;

/**
 *
 * @author janns
 */
public class ListaEnlazadaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista=new Lista();
        int op=0;
        while (op==0) {            
            Nodo nuevo=new Nodo();
            nuevo.setInformacion(Integer.parseInt(JOptionPane.showInputDialog("Digíte un número entero: ")));
            lista.insertarInicio(nuevo);
            op=JOptionPane.showConfirmDialog(null,"Desea agregar otro nodo?","Lista simple enlazada",JOptionPane.YES_NO_OPTION);
        }
        lista.RecorrerLista();
    }
    
}
