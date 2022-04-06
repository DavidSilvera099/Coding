package edu.cuc.pruebas;

import edu.cuc.cuentas.CuentaAhorros;



public class PruebaCuentaAhorros {

    public static void main(String[] args) {
       
        CuentaAhorros cuenta1 = new CuentaAhorros("Maria", "123");
        CuentaAhorros cuenta2 = new CuentaAhorros("Carlos", "345");
        System.out.println("Cuenta 1: "+cuenta1);
        System.out.println("Cuenta 2: "+cuenta2);
        //Consignar
        System.out.println("Consignación: "+cuenta1.consignar(-10000));
        System.out.println("Consignación: "+cuenta1.consignar(0));
        System.out.println("Consignación: "+cuenta1.consignar(100000));
        System.out.println("Cuenta 1: "+cuenta1);
        System.out.println("Consignación: "+cuenta2.consignar(500000));
        System.out.println("Cuenta 2: "+cuenta2);
        //Retirar
        System.out.println("Retiro: "+cuenta1.retirar(0));
        System.out.println("Retiro: "+cuenta1.retirar(200000));
        System.out.println("Retiro: "+cuenta1.retirar(40000));
         System.out.println("Cuenta 1: "+cuenta1);
         //Transferir
         System.out.println("TRANSFERENCIA");
        System.out.println("Cuenta 1: "+cuenta1);
        System.out.println("Cuenta 2: "+cuenta2);
        System.out.println("Transferencia: "+cuenta2.transferir(cuenta1, 900000));
        System.out.println("Transferencia: "+cuenta2.transferir(cuenta1, 90000));
        System.out.println("Cuenta 1: "+cuenta1);
        System.out.println("Cuenta 2: "+cuenta2);
    }
    }

