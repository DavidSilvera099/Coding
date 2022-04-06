package edu.cuc.cuentas;

import java.util.Objects;

public class CuentaAhorros {
    private String titular;
    private String numeroCuenta;
    private double saldoCuenta = 0;

    public CuentaAhorros(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" + "titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldoCuenta=" + saldoCuenta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titular);
        hash = 97 * hash + Objects.hashCode(this.numeroCuenta);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldoCuenta) ^ (Double.doubleToLongBits(this.saldoCuenta) >>> 32));
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
        final CuentaAhorros other = (CuentaAhorros) obj;
        if (!Objects.equals(this.numeroCuenta, other.numeroCuenta)) {
            return false;
        }
        return true;
    }
    
    //Método Consignar
    public boolean consignar(double montoAConsignar) {
        if (montoAConsignar > 0) {
            this.saldoCuenta = this.saldoCuenta + montoAConsignar;
            return true; //Si se hizo la consignación
        } else {
            return false; //No se hizo la consignación
        }
    }
    
    //Método retirar
    public boolean retirar(double montoARetirar) {
        if (montoARetirar > 0) {
            if (montoARetirar <= this.saldoCuenta) {
                this.saldoCuenta = this.saldoCuenta - montoARetirar;
                return true; //Retiro exitoso
            } else {
                return false; //Consignación sin fondos suficientes
            }
        } else {
            return false; //Consignación no exitosa
        }
    }
    
    //Método Transferir
    public boolean transferir(CuentaAhorros cuentaDestino, double montoATransferir) {
        if (montoATransferir > 0) {
            //Intentar el retiro en la cuenta origen
            if (this.retirar(montoATransferir) == true) { //Si hay fondos en la cuenta Origen
                cuentaDestino.consignar(montoATransferir);
                return true;
            } else {
                return false; //Transferencia no exitosa (Fondos Insuficientes)
            }
        } else {
            return false; //Transferencia no exitosa (monto inválido)
        }
    }
}
