package cuc.edu.SotfwareContratacion;
public class Persona {
    //Atributos
    protected String ID, tipo_ID, nombre, apellido, direccion, correo, telefono;

    //Constructor
    public Persona(String ID, String tipo_ID, String nombre, String apellido, String direccion, String correo, String telefono) {
        this.ID = ID;
        this.tipo_ID = tipo_ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", tipo_ID=" + tipo_ID + ", nombre=" + nombre + ", apellido=" + apellido +
                ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    //Getters and Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipo_ID() {
        return tipo_ID;
    }

    public void setTipo_ID(String tipo_ID) {
        this.tipo_ID = tipo_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
}
