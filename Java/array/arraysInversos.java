package Array;
/*Crie um array com 6 numeros e mostre eles em ordem inversa*/

public class arraysInversos {
    public static void main(String[] args) {
        int[] vetor = {5,3,4,8,-5,2};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor Invertido: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }

}
