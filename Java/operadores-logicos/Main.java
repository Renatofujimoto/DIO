package operadoresLogicos;

import java.util.Scanner;

// programa para verificar quanto o funcionario deve receber de acordo com o tempo da empresa e horas trabalhadas

public class Main {
    public static void main(String[] args){
      Scanner scan =  new Scanner(System.in);
      int a,b,c;

      System.out.println("Digite a quantidade de anos: ");
      a = scan.nextInt();

      System.out.println("Digite a quantidade de horas: ");
      b = scan.nextInt();

      System.out.println("Digite o valor das horas: ");
      c = scan.nextInt();


      int quantidadeAnos = a;
      int horasTrabalhadas = b;
      int valorHora = c;
      int salario = 0;


      if (quantidadeAnos <= 1) {
      salario = 1500 + (valorHora * horasTrabalhadas);
      } else if ((quantidadeAnos > 1) && (quantidadeAnos < 3)) {
      salario = 2000 + (valorHora * horasTrabalhadas);
      } else {
      salario = 3000 + (valorHora * horasTrabalhadas);
      }

      System.out.println("salario deve ser: " + salario);
   }
}
