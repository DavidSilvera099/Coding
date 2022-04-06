package cuc.edu.SotfwareContratacion;
public class Empleado extends Persona{
    //Atributos
    private int sueldo;
    private String tipo_contrato;
    
    //Constructor
    public Empleado(String ID, String tipo_ID, String nombre, String apellido, String direccion, String correo, String telefono, int sueldo, String tipo_contrato) {
        super(ID, tipo_ID, nombre, apellido, direccion, correo, telefono);
        this.sueldo = sueldo;
        this.tipo_contrato = tipo_contrato;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" + "ID=" + ID + ", tipo_ID=" + tipo_ID + ", nombre=" + nombre + ", apellido=" + apellido +
                ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", sueldo=" + sueldo +
                ", tipo_contrato=" + tipo_contrato + '}';
    }
    
    //Getters and Setters
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }
}
