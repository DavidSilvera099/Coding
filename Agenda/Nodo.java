package cuc.edu.Agenda;
public class Nodo {
    //Atribustos 
    private int Id;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private String Correo;
    private Nodo Siguiente;
    //Constructor   
    public Nodo() {
        this.Id = 0;
        this.Nombre = " ";
        this.Apellido = " ";
        this.Telefono = 0;
        this.Correo = " ";
        this.Siguiente = null;
    }
    public Nodo(int Id, String Nombre, String Apellido, int Telefono, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Siguiente = null;
    }
    //toString
    @Override
    public String toString() {
        return  Id + ", " + Nombre + ", " + Apellido + ", " + Telefono + ", " + Correo;
    }
    //Get y Set
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}
