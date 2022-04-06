/*
Las listas son usadas para implementar otras estructuras. Consiste en una secuencia de nodos.
Debe tener su respectivo inicio de tipo nodo
 */
package cuc.edu.ListasEnlazadas;

import javax.swing.JOptionPane;

public class Lista {

    //Atribustos
    private Nodo inicio;

    //Constructor
    public Lista() {
        this.inicio = null;
    }

    //Get y Set
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    // ------------ M E T O D O S ----------------
    public void InsertarInicio(Nodo nuevo) {//Recibe un nuevo nodo
        if (this.inicio == null) {//Si la lista no existe
            this.inicio = nuevo;
            nuevo.setSiguiente(null);// Enlace al siguiente en null
        } else { // Si la lista existe
            nuevo.setSiguiente(inicio);//Apunta al inicio de la lista
            this.inicio = nuevo;
        }
    }

    public void InsertarFinal(Nodo nuevo) {
        //Validar si la lista existe
        if (this.inicio == null) {//Si la lista no existe
            this.inicio = nuevo;
            nuevo.setSiguiente(null);// Enlace al siguiente en nodo = null
        } else {//Si la lista existe
            //Recorrer la lista
            Nodo auxiliar = this.inicio; //Arranca en el inicio
            while (auxiliar.getSiguiente() != null) { //Recorre hasta que llegue al final
                auxiliar = auxiliar.getSiguiente();
            }
            //Insertar el nuevo nodo
            auxiliar.setSiguiente(nuevo);//El campo de enlace apunta al nuevo nodo
            nuevo.setSiguiente(null);//El campo de enlace del nuevo nodo apuna a nulo
        }
    }

    public void RecorrerLista() {
        if (this.inicio == null) {//Valid. Si hay datos en la lista
            JOptionPane.showMessageDialog(null, "No hay datos en la lista", "ERROR", 0);
        } else {
            Nodo auxiliar = this.inicio; //Arranca en el inicio
            while (auxiliar != null) { //Recorre hasta que llegue al final
                auxiliar.getInformacion();
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    
    public void EliminarInicio(){
    
    }
}
