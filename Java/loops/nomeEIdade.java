package Loops;
import java.util.Scanner;

// Desafio DIO, faça um programa que receba um nome e um numero, pare o programa quando digitar o 0

public class nomeEIdade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
