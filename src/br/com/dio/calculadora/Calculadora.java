package br.com.dio.calculadora;

import java.util.Scanner;
// para rodar o programa em outra classe Ctrl+Shift+F10
public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        //somar(a,b)  //Ctrl+Alt+V cria a variavel automaticamente.
        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subt: " + subtrair);
        System.out.println("Mult: " + multiplicar);
        System.out.printf("Div: %.2f", dividir);

    }

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }


}
