

/* Este proyecto recibe tres valores por consola para realizar las operaciones basicas, con las sgtes condiciones:
   1. Si existen tres valores, proceda a realizar alguna de las operaciones disponibles.
   2. Si existen dos valores, entonces el tercer valor será igual al segundo valor ingresado, proced a realizar operaciones. 
   Esto se hace con la finalidad de poner en práctica la sobrecarga de metodos.*/

package edu.cuc.Calculadora_2y3_numeros;

public class Calculadora {
    private double valor1;
    private double valor2;
    private double valor3;
    private double resultado;

    //Constructores
    public Calculadora(double valor1, double valor2, double valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor2;
    }

    //Metodos   
    public double suma() {
        resultado = valor1 + valor2 + valor3;
        return resultado;
    }

    public double resta() {
        resultado = valor1 - valor2 - valor3;
        return resultado;
    }

    public double multiplicacion() {
        resultado = valor1 * valor2 * valor3;
        return resultado;
    }

    public double division() {
        if (valor3 == 0) {
            System.out.println("La division por cero no esta definida");
        }
        resultado = valor1 + valor2 / valor3;
        return resultado;
    }

    //Getters y Setters
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
