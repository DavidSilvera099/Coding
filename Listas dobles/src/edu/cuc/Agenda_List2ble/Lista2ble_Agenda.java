package edu.cuc.Agenda_List2ble;

import javax.swing.JOptionPane;
public class Lista2ble_Agenda {
    
    //Marcar el inicio y el final
    private Nodo_Agenda Inicio;
    private Nodo_Agenda Fin;
    
    

    //Constructor
    public Lista2ble_Agenda() {
        this.Inicio = null;
        this.Fin = null;
    }

    //Get and Set
    public Nodo_Agenda getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo_Agenda Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo_Agenda getFin() {
        return Fin;
    }

    public void setFin(Nodo_Agenda Fin) {
        this.Fin = Fin;
    }

    //----------------- M E T O D O S ------------------\\
    public boolean ListaVacía() {
        boolean respuesta = true; //Inicia como lista vacía
        if (this.Inicio != null) {//Valid. si la lista existe
            respuesta = false;
        }
        return respuesta;
    }

    public int NumContactos() {
        int Contador = 0;
        if (ListaVacía() == true) {//Si la lista está vacía
            Contador = 0;
        } else {//Si la lista no está vacía
            //Recorre la lista
            Nodo_Agenda aux = this.Inicio;
            while (aux != null) {
                Contador++;
                aux = aux.getSiguiente();
            }
        }
        return Contador;
    }

    public void InsertarInicio(Nodo_Agenda NodNuevo) {
        /* Procedimiento:
        1. Validar si la lista está vacía.
           1.1. Si está vacía agrega un nuevo nodo.*/
        if (ListaVacía() == true) {
            this.Inicio = NodNuevo;
            this.Fin = NodNuevo;
            // 2. Hacer que el nuevo nodo siguiente apunte al inicio, y el nodo anterior apunte al nodo nuevo. 
        } else {
            NodNuevo.setSiguiente(Inicio);
            Inicio.setAnterior(NodNuevo);
            Inicio = NodNuevo;
        }
    }

    public void InsertarFinal(Nodo_Agenda NodNuevo) {
        /* Procedimiento:
        1. Validar si la lista está vacía.
           1.1. Si está vacía agrega un nuevo nodo.*/
        if (ListaVacía() == true) {
            this.Inicio = NodNuevo;
            this.Fin = NodNuevo;
            // 2. Hacer que el nodo que apuntaba a null (Fin, ult nodo),apunte al nodo nuevo y que el nodo nuevo apunte al fin (Fin=null). 
        } else {
            Fin.setSiguiente(NodNuevo);
            NodNuevo.setAnterior(Fin);
            Fin = NodNuevo;
        }
    }

    public String Mostrar_Comienzo_Ultimo() {
        if (ListaVacía() == true) {//Valid. Si hay datos en la lista
            return null;
        } else {
            String informacion = "";
            Nodo_Agenda auxiliar = this.Inicio; //Arranca en el inicio
            while (auxiliar != null) { //Recorre hasta que llegue al final
                informacion += auxiliar.getId()       + " ";
                informacion += auxiliar.getNombre()   + " ";
                informacion += auxiliar.getApellido() + " ";
                informacion += auxiliar.getTelefono() + " ";
                informacion += auxiliar.getCorreo()   + "\n";
                auxiliar    =  auxiliar.getSiguiente();
            }
            return informacion;
        }

    }

    public String Mostrar_Ultimo_Comienzo() {
        if (ListaVacía() == true) {//Valid. Si hay datos en la lista
            return null;
        } else {
            String informacion = "";
            Nodo_Agenda auxiliar = this.Fin; //Arranca en el inicio
            while (auxiliar != null) { //Recorre hasta que llegue al comienzo
                informacion += auxiliar.getId()       + " ";
                informacion += auxiliar.getNombre()   + " ";
                informacion += auxiliar.getApellido() + " ";
                informacion += auxiliar.getTelefono() + " ";
                informacion += auxiliar.getCorreo()   + "\n";
                auxiliar    =  auxiliar.getAnterior();
            }
            return informacion;
        }
    }
   
    public boolean EliminarInicio(){
          if (ListaVacía() == true) {//Si la lista está vacía
            return false;//No se pudo eliminar
        } else if (NumContactos() == 1) {//Cuando hay un solo nodo
            Inicio = null;
            Fin    = null;
        } else {
            Nodo_Agenda auxiliar = Inicio.getSiguiente();
            auxiliar.setAnterior(null);
            Inicio = auxiliar;
        }
        return true; //Nodo eliminado exitoso 
    }
    
    public boolean ELiminarFinal(){
        if (ListaVacía() == true) {
            return false;
        } else if(NumContactos() == 1) {
            Fin = null;
            Inicio = null;
        }else{
            Nodo_Agenda auxiliar = Fin.getAnterior();
            auxiliar.setSiguiente(null);
            Fin = auxiliar;
        }
        return true;
    }
}
