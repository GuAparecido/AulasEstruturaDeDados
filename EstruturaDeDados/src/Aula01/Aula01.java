package Aula01;

import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args) {
        System.out.println("Olaaaaar Javeiros");

//      int num1 = 2;
//      int num2 = 2;
//      int soma = num1 + num2;
//
//      System.out.println("A soma dos números é: "+ soma + "!!!!!!!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Erro no cálculo, o número não pode ser menor que zero.");
        }
        System.out.println("Digite mais um número");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: "+ (num + num2) + "!!!!!!!!!");

        // Testando outro commit


    }

}
