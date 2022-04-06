
package cuc.edu.SotfwareProductos;
public class Productos_vendidos extends Productos {
    //Atributos del cliente
    protected String CC, NombreCliente, Apellido;
    
    //Atrubutos del producto vendido
    public Productos_vendidos( String Referencia, String Descripcion, String cantidad, String ValoruUnitario, String ValorTotal,
            String CC, String NombreCliente, String Apellido) {
        super(Referencia, Descripcion, cantidad, ValoruUnitario, ValorTotal);
        this.CC = CC;
        this.NombreCliente = NombreCliente;
        this.Apellido = Apellido;
    }
    
    //Get y set
    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    //toString

    @Override
    public String toString() {
        return "Productos_vendidos{" + "CC=" + CC + ", NombreCliente=" + NombreCliente + ", Apellido=" + Apellido + '}';
    }
    
}
