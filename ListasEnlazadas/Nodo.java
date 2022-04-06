package cuc.edu.ListasEnlazadas;
/*
Un nodo es una clase autoreferenciada que contiene dos campos
Iformacion : info del objeto
Siguiente : campo de enlace al siguiente nodo
*/
public class Nodo {
    //Atributos
    private int informacion;//Info del objeto
    private Nodo Siguiente;//Enlace al siguiente nodo, tipo de dato autoreferenciado
   //Constructor
    public Nodo() {
        this.informacion  = 0;
        this.Siguiente    = null;
    }
    //Get y set
    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}
