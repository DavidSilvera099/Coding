
package cuc.edu.ListaE_Simple;

public class Nodo {
    private int informacion;
    private Nodo siguiente;
    
    public Nodo(){
        this.informacion=0;
        this.siguiente=null;
    }

    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
