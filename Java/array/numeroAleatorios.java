package Array;
/*Faça um programa que leia 20 numeros inteiros aleatorios entre 0  e 100,
* armazene os em um vetor. ao final mostre os numeros e seus sucessores*/

import java.util.Random;

public class numeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero =  random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero:numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores do numeros Aleatorios: ");
        for (int numero:numerosAleatorios){
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessores do numeros Aleatorios: ");
        for (int numero:numerosAleatorios){
            System.out.print((numero-1) + " ");
        }


    }
}
