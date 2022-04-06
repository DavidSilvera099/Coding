package edu.cuc.Calculadora_2y3_numeros;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String args[]) {

        Scanner Scanner = new Scanner(System.in);

        int decision;
        int operador;

        System.out.println("Cuantos valores desea usar para la operacion? Solo 2 y 3 son posibles.");
        decision = Scanner.nextInt();

        switch (decision) {
            case 2: {
                System.out.println("Ingrese el primer dato");
                double valor1 = Scanner.nextDouble();

                System.out.println("Ingrese el segundo dato");
                double valor2 = Scanner.nextDouble();

                Calculadora objeto = new Calculadora(valor1, valor2);

                System.out.println("¿Qué tipo de operación desea realizar?"
                        + "\n 1 para suma "
                        + "\n 2 para resta"
                        + "\n 3 para multiplicacion "
                        + "\n 4 para division.");
                operador = Scanner.nextInt();

                switch (operador) {

                    case 1:
                        System.out.println("La suma es: " + objeto.suma());

                        break;
                    case 2:
                        System.out.println("La resta es: " + objeto.resta());

                        break;
                    case 3:
                        System.out.println("La multiplicacion es: " + objeto.multiplicacion());

                        break;
                    case 4:
                        System.out.println("La division es: " + objeto.division());

                        break;
                    default:
                        break;
                }

            }

            case 3: {

                System.out.println("Ingrese el primer dato ");
                double valor1 = Scanner.nextDouble();

                System.out.println("Ingrese el segundo dato ");
                double valor2 = Scanner.nextDouble();
                System.out.println("Ingrese el tercer dato ");
                double valor3 = Scanner.nextDouble();

                Calculadora objeto = new Calculadora(valor1, valor2, valor3);

                System.out.println("¿Qué tipo de operación desea realizar?"
                        + "\n 1 para suma "
                        + "\n 2 para resta"
                        + "\n 3 para multiplicacion "
                        + "\n 4 para division.");
                operador = Scanner.nextInt();

                switch (operador) {

                    case 1:
                        System.out.println("La suma es: " + objeto.suma());

                        break;
                    case 2:
                        System.out.println("La resta es: " + objeto.resta());

                        break;
                    case 3:
                        System.out.println("La multiplicacion es: " + objeto.multiplicacion());

                        break;
                    case 4:
                        System.out.println("La division es: " + objeto.division());
                        break;
                    default:
                        break;
                }

            }

        }

    }

}
