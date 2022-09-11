package Loops;

import java.util.Scanner;

public class nota {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digita a nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota Inválida! Digite uma nota válida");
            nota = scan.nextInt();
        }

    }
}
