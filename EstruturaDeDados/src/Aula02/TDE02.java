package Aula02;

import java.util.Scanner;

public class TDE02 {

    public static void main(String[] args) {
        int[] valores = new int[5];

        Scanner scanner = new Scanner(System.in);

/* Exercício 1: Array - Tde02Ex01.java

1. Crie um programa em Java que declare e inicialize um array de inteiros com 5 elementos.
Em seguida, imprima cada elemento do array. */
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Insira o " + (i + 1) + "º número.");
//            valores[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(valores[i]);
//        }

/* Exercício 2: Matriz - Tde02Ex02.java
2. Escreva um programa em Java que declare e inicialize uma matriz de inteiros com 3 linhas e 3 colunas.
Em seguida, preencha a matriz com valores de 1 a 9 (sequencialmente) e imprima a matriz. */
//        int[][] matriz3x3 = new int[3][3];
//        int cont = 1;
//        for (int i = 0; i < 3; i ++) {
//            for (int j = 0; j < 3; j++) {
//                matriz3x3[i][j] = cont;
//                cont++;
//            }
//        }
//
//        for (int i = 0; i < 3; i ++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matriz3x3[i][j]);
//                if (j == 2) {
//                    System.out.println();
//                }else {
//                    System.out.print(", ");
//                }
//            }
//        }

/* Exercício 3: Manipulação de String - Tde02Ex03.java

3. Crie um programa em Java que receba uma String como entrada do usuário e conte o número de caracteres maiús
culos, minúsculos, dígitos e caracteres especiais presentes na String. Em seguida, imprima esses valores. */
        String texto;
        System.out.println("Digite o texto: " );
        texto = scanner.nextLine();

        int contadorMaiuscula = 0;
        int contadorMinuscula = 0;
        int contadorNumero = 0;
        int contadorEspecial = 0;
        for (int i = 0; i < texto.length(); i ++) {
//            System.out.println(texto.charAt(i));
            if (Character.isUpperCase(texto.charAt(i))) {
                contadorMaiuscula++;
            } else if(Character.isLowerCase(texto.charAt(i))) {
                contadorMinuscula++;
            }else if(Character.isDigit(texto.charAt(i))) {
                contadorNumero++;
            }else {
                contadorEspecial++;
            }
        }
        System.out.println("A quantidade de letras maiúsculas digitadas foi " +contadorMaiuscula);
        System.out.println("A quantidade de letras mínúsculas digitadas foi " +contadorMinuscula);
        System.out.println("A quantidade de números digitados foi " +contadorNumero);
        System.out.println("A quantidade de caracteres especiais digitados foi " +contadorEspecial);
        System.out.println(texto);

        // Professor fez
        // int contMaiusculas;
        // int contMinusculas;
        // int contNumeros;
        // int contEspeciais;

        // for (int i = 0; i < texto.length(); i ++) {
        //     char letra = texto.char(i);
        //
        //     if(Character.isUpperCase(letra)) {
        //        contMaiusculas++;
        //     } else if (Character.isLowerCase(letra)) {
        //        contMinusculas++;
        //     } else if (Character.isDigit(letra)) {
        //        contNumeros++;
        //     } else {
        //        contEspeciais++;
        //     };
        // }

        // System.out.println("Cont maiusculas: " + + contadorMaiuscula);
        // System.out.println("Cont maiusculas: " + + contadorMinuscula);
        // System.out.println("Cont maiusculas: " + + contadorNumeros);
        // System.out.println("Cont maiusculas: " + + contadorEspeciais);

        // System.out.println("Texto de entrada: " + texto);

/* 4. Vamos criar uma escada de String! Crie um algoritmo em Java que solicite ao usuário um número.
Esse número será a quantidade de degraus da nossa escada. Com essa quantidade definida,
imprima no console uma sequência de Strings no formato de uma escada: */
        // Escadinha de String
        // Entrada de texto
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 0; i < degraus; i++) { // Percorre a quantidade de degraus

            // preencher os espaços
            for (int j = (degraus - 1); j >= 0; j--) {
                System.out.print("");
            }

            for (int k = 1; k <= degraus; k++) {
                System.out.print("#");
            }

            System.out.println();
        }


    }
}


