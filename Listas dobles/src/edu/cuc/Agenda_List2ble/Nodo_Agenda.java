package edu.cuc.Agenda_List2ble;

public class Nodo_Agenda {
    //Atribustos
    private long Id;
    private String Nombre;
    private String Apellido;
    private long Telefono;
    private String Correo;
    private Nodo_Agenda Siguiente;
    private Nodo_Agenda Anterior;
    //Constructor
    public Nodo_Agenda() {
        this.Id        = 0;
        this.Nombre    = " ";
        this.Apellido  = " ";
        this.Telefono  = 0;
        this.Correo    = " ";
        this.Siguiente = null;
        this.Anterior  = null;
    }
    //Sobrecarga
    public Nodo_Agenda(long Id, String Nombre, String Apellido, long Telefono, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Siguiente = null;
        this.Anterior = null;
    }
 
    //Get and Set
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Nodo_Agenda getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_Agenda Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_Agenda getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Agenda Anterior) {
        this.Anterior = Anterior;
    }
}
