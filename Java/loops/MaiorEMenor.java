package Loops;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float numero;
        float maior = 0;
        int count = 0;
        float soma = 0;

        do {
        System.out.println("Digite 5 numeros: ");
        numero = scan.nextFloat();

        soma = soma + numero;

        if (numero > maior) maior = numero; //condicao para mostrar o maior

        count = count + 1;
        }while(count < 5);
            System.out.println("Maior: " + maior);
            System.out.println("Média : " + (soma/5));
    }
}
