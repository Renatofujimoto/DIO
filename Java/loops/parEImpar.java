package Loops;

import java.util.Scanner;

/*Faça um programa que peça N numeros inteiros, calcule e mostre a quantidade de
números pares e a quantidade de numeros impares */

public class parEImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Números");
            numero = scan.nextInt();

            if (numero %2 ==0) quantPares++;
            else quantImpares++;

            count++;
        }while (count < quantNumeros);

        System.out.println("Quantidade de nº Pares: " + quantPares);
        System.out.println("Quantidade de nº Impares: " + quantImpares);
    }
}
