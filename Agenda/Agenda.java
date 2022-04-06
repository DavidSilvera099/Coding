package cuc.edu.Agenda;
import cuc.edu.Agenda.Nodo;

public class Agenda {
    //Atributo
    protected Nodo Inicio;
    //Constructor
   public Agenda() {
        this.Inicio = null;
    }
    //Get y Set
    public Nodo getInicio() {
        return Inicio;
    }
    public void setInicio(Nodo Inicio) {
        this.Inicio = Inicio;
    }
    
    //----------------- M E T O D O S ------------------
    public void InsertarInicio(Nodo nuevo) {
        if (this.Inicio == null) {//Valid. Si la lista no existe
            this.Inicio = nuevo;
            nuevo.setSiguiente(null);// Enlace al sgte nodo
        } else {//Si la lista existe
            nuevo.setSiguiente(Inicio);//Apunta al inicio de la lista
            this.Inicio = nuevo;
        }
    }

    public void InsertarFinal(Nodo nuevo) {
        if (this.Inicio == null) {//Valid. Si la lista está vacía
            this.Inicio = nuevo;
            nuevo.setSiguiente(null);// Enlace al sgte nodo
        } else {//Si la lista no está vacía
            //Recorrer la lista
            Nodo auxiliar = this.Inicio;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            //Insertar el nuevo nodo
            auxiliar.setSiguiente(nuevo);//El campo de enlace apunta al nuevo nodo
            nuevo.setSiguiente(null);//El campo de enlace del nuevo nodo apuna a nulo
        }
    }

    public String Listar(){
        if (this.Inicio == null) {//Valid. Si hay datos en la lista
            return null;
        } else {
            String informacion = "";
            Nodo auxiliar = this.Inicio; //Arranca en el inicio
            while (auxiliar != null) { //Recorre hasta que llegue al final
                informacion += auxiliar.getId() + " ";
                informacion += auxiliar.getNombre() + " ";
                informacion += auxiliar.getApellido() + " ";
                informacion += auxiliar.getTelefono() + " ";
                informacion += auxiliar.getCorreo() + "\n";
                auxiliar    =  auxiliar.getSiguiente(); 
            }
            return informacion;          
        }

    }

    public int NumContactos() {
        int contador = 0;
        Nodo aux = this.Inicio;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    public boolean EliminarInicio() {
        if (this.Inicio == null) {//Si la lista está vacía
            return false;//No se pudo eliminar
        } else if (NumContactos() == 1) {
            this.Inicio = null;
        } else {
            Nodo auxiliar = Inicio.getSiguiente();
            Inicio = auxiliar;
        }
        return true; //Nodo eliminado exitoso
    }

    public boolean EliminarFinal() {
        if (this.Inicio == null) {//Si la lista está vacía
            return false;//No se pudo eliminar
        } else if (NumContactos() == 1) {
            this.Inicio = null;
        } else {
            Nodo previo = null;
            Nodo auxiliar = this.Inicio;
            while (auxiliar.getSiguiente() != null) {
                previo = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
            previo.setSiguiente(null);
        }
        return true; //Nodo eliminado
    }

}
