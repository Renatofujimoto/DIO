package Loops;

import java.util.Scanner;

/* Desevolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10.
O usuario deve informar de qual nuymero ele deseja ver a tabuada
a saida deve ser conforme o ex abaixo:
5 x 1 = 5
5 x 2 = 10
....*/
public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada: "+ tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X "+ i + " = "+ (tabuada*i));
        }
    }
}
