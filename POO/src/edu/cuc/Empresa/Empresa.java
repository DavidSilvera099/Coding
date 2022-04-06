

/* 
En este proyecto se ha creado una empresa, que recibe datos de una compra realizada por los clientes y devuelve el valor
total de la venta.

Este proyecto se hizo con la intención de practicar la POO (Programacion orientada a objetos) y la aplicación de validaciones.
*/
package edu.cuc.Empresa;
public class Empresa {

//Atributos
    private int no;
    private int id;
    private String nombre;
    private String producto;
    private int cantidad;
    private double valorUnitario;
    private boolean Valido = true;

//Constructor y validaciones
    public Empresa(int no, int id, String nombre, String producto, int cantidad, double valorUnitario) {

        if (no == 0) {
            System.out.println("¡Por favor introduce un No.!");
            this.Valido = false;
        } else {
            this.no = no;
        }

        if (id == 0) {
            System.out.println("Introduce un Id");
            this.Valido = false;
        } else {

            this.id = id;
        }

        if (nombre.equals("")) {
            System.out.println("¡Por favor introduce un nombre.!");
            this.Valido = false;
        } else {
            this.nombre = nombre;

        }

        if (producto.equals("")) {
            System.out.println("¡Por favor ingresar un producto!");
            this.Valido = false;
        } else {
            this.producto = producto;
        }

        if (cantidad == 0) {
            System.out.println("¡Por favor ingresar una cantidad!");
            this.Valido = false;
        } else {
            this.cantidad = cantidad;
        }

        if (valorUnitario == 0) {
            System.out.println("¡Por favor ingresar un valor unitario!");
            this.Valido = false;
        } else {
            this.valorUnitario = valorUnitario;
        }
    }

//Getters
    public int getNo() {
        return no;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

//Setters
    public void setNo(int no) {
        this.no = no;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

//Metodo total ventas
    public double totalVentas(double sumaTotal) {
        if (cantidad <= 0) {
            System.out.println("Nota: ¡La cantidad debe ser mayor que cero!");

        } else {
            sumaTotal = cantidad * valorUnitario;
        }
        return sumaTotal;
    }

//Metodo toString
    @Override
    public String toString() {
        return "{" + "No: " + no + ", Id: " + id + ", Nombre: "
                + nombre + ", Producto: " + producto + ", Cantidad: " + cantidad + ", Valor unitario: " + valorUnitario + '}';
    }
//HashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.no;
        hash = 71 * hash + this.id;
        return hash;
    }
//Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.no != other.no) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    //Metodo que permite segui desplegando la informacion
    public boolean EsValido() {
        return Valido;
    }

}
