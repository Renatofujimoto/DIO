package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a, b);

        System.out.println("A soma dos números é: " + somar);
        System.out.println("A subtração dos números é: " + subtrair);
        System.out.println("A multiplicação dos números é: " + multiplicar);
        System.out.println("A divisão dos números é: " + dividir);


    }

    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static int dividir (int a, int b){
        return a / b;
    }
}
