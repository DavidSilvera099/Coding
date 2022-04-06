package cuc.edu.serializacion3;
import java.io.Serializable;
import java.util.Objects;
public class Cuenta implements Serializable{
   
   //Atributos
   protected String numeroCuenta;
   protected String titularCuenta;
   protected double saldoCuenta;
   public int conteo = 10;
   
    //Constructores
    public Cuenta(String numeroCuenta, String titularCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
    }
    
    //Getters y Setters (Métodos de Acceso)
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    
    //Método toString

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", titularCuenta=" + titularCuenta +
                ", saldoCuenta=" + saldoCuenta + ", conteo=" + conteo + '}';
    }
    
    //Método equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.numeroCuenta);
        hash = 29 * hash + Objects.hashCode(this.titularCuenta);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.saldoCuenta) ^ (Double.doubleToLongBits(this.saldoCuenta) >>> 32));
        hash = 29 * hash + this.conteo;
        return hash;
    }

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
        final Cuenta other = (Cuenta) obj;
        if (!Objects.equals(this.numeroCuenta, other.numeroCuenta)) {
            return false;
        }
        return true;
    }
    
    //Métodos de la clase
    //Consignar
    public boolean consignar(double cantidadAConsignar) {
        if (cantidadAConsignar > 0) {
            this.saldoCuenta += cantidadAConsignar;
            return true;
        } else {return false;}
    }
    
    //Retirar
    public boolean retirar(double cantidadARetirar) {
        if (cantidadARetirar > 0) {
            if (cantidadARetirar <= this.saldoCuenta) {
                this.saldoCuenta -= cantidadARetirar;
                return true; //Retiro Exitoso
            }
        }
        return false;
    }
}
