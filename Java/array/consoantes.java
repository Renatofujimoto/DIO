package Array;
/*Faça um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas e imprima consoantes*/

import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadesConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Digite 6 letras: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")|
                  letra.equalsIgnoreCase("e")|
                  letra.equalsIgnoreCase("i")|
                  letra.equalsIgnoreCase("o")|
                  letra.equalsIgnoreCase("u"))){
                   consoantes[count] = letra;
                   quantidadesConsoantes++;
            }
            count++;

        }while (count < consoantes.length);

        System.out.println("São consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidades de consoantes: " + quantidadesConsoantes);

    }
}
