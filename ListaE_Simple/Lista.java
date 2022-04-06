
package cuc.edu.ListaE_Simple;
import javax.swing.JOptionPane;


public class Lista {
    private Nodo inicio;
    
    public Lista(){
        this.inicio=null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    public void insertarInicio(Nodo nuevo){
        if (this.inicio==null) {
            this.inicio=nuevo;
            nuevo.setSiguiente(null);
        }else{
        nuevo.setSiguiente(inicio);
        this.inicio=nuevo;
        }
    }
     public void InsertarFinal(Nodo nuevo){
         if (this.inicio==null) {//preguntar si existe la lista
             this.inicio=nuevo;
             nuevo.setSiguiente(null);
         }else{
             Nodo auxiliar= this.inicio;
             while (auxiliar.getSiguiente()!=null) {                 
                 auxiliar=auxiliar.getSiguiente();
             }
             auxiliar.setSiguiente(nuevo);
             nuevo.setSiguiente(null);
         }
     }
     public void RecorrerLista(){
         if (this.inicio==null) {
             System.out.println("No hay elementos en la lista");
         }else{
         Nodo aux = this.inicio;
             while (aux!=null) {                 
                 //System.out.println(aux.getInformacion());
                 JOptionPane.showMessageDialog(null, aux.getInformacion());
                 aux=aux.getSiguiente();
             }
         }
     }
     public int numeroNodos(){
     int contador=0;
     Nodo aux = this.inicio;
             while (aux!=null) {                 
                 contador++;
                 aux=aux.getSiguiente();
             }
             return contador;
     }
     public void eliminarInicio(){
     if (this.inicio==null) {
            JOptionPane.showMessageDialog(null,"La lista esta vacía.");
        }else if (numeroNodos()==1) {
             this.inicio=null;
         }else{
        Nodo auxiliar= inicio.getSiguiente();
        inicio=auxiliar;
        }
     JOptionPane.showMessageDialog(null,"Nodo eliminado.");
     }
}
