package cuc.edu.SotfwareProductos;

public class Productos {

    /* 
1. Diseñar una interfaz que permita cargar(Metodo leer) y guardar(Metodo Leer) el inventario de sus
productos a través de archivos de texto plano.
2. Se requiere una interfaz donde se permita calcular por venta el valor a pagar
por el cliente tomando como base el valor del producto (asuma que el cliente
va a comprar x cantidad de un solo producto) las ventas también deben ser
almacenadas en un archivo de texto plano.
     */
    //Atributos
    protected String Referencia, Descripcion, cantidad, ValoruUnitario, ValorTotal;

    //Constructor
    public Productos(String Referencia, String Descripcion, String cantidad, String ValoruUnitario, String ValorTotal) {
        this.Referencia = Referencia;
        this.Descripcion = Descripcion;
        this.cantidad = cantidad;
        this.ValoruUnitario = ValoruUnitario;
        this.ValorTotal = ValorTotal;
    }

    //toString
    @Override
    public String toString() {
        return "Productos{" + "Referencia=" + Referencia + ", nombre=" + Descripcion + ", cantidad=" + cantidad + ", ValoruUnitario=" + ValoruUnitario + ", ValorTotal=" + ValorTotal + '}';
    }

    //Getters and Setters
    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValoruUnitario() {
        return ValoruUnitario;
    }

    public void setValoruUnitario(String ValoruUnitario) {
        this.ValoruUnitario = ValoruUnitario;
    }

    public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

}
