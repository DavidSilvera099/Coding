package edu.cuc.Empresa;

public class EmpresaMain {
    public static void main(String[] args) {
        Empresa Cliente1 = new Empresa(001, 1004189, "David", "Teclado", 5, 100);
        Empresa Cliente2 = new Empresa(002, 1929237, "Andrea", "Mouse", 3, 200);

        //Validacion        
        if (Cliente1.EsValido()) {
            System.out.println("Cliente 1:" + Cliente1);
        }
        if (Cliente2.EsValido()) {
            System.out.println("Cliente 2:" + Cliente2);
        }
        //Muestra el total vendido
        System.out.println("Total ventas Cliente 1: " + Cliente1.totalVentas(0));
        System.out.println("Total ventas Cliente 2: " + Cliente2.totalVentas(0));
    }

}
