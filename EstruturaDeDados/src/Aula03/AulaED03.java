package Aula03;

import java.util.Scanner;

public class AulaED03 {

    public static void main(String[] args) {

        // FILA
        // FIFO (Fist In Fist Out) - Primeiro que entra e primeiro que sai.
        Scanner scanner = new Scanner(System.in);

        FilaJava fila = new FilaJava();
        System.out.println("Digite um valor: ");
        fila.add(scanner.nextLine());
        fila.add(scanner.nextLine());
        fila.add(scanner.nextLine());
//        fila.values[0] = scanner.nextLine();

//        System.out.println("Digite mais um valor: ");
//        String texto = scanner.nextLine();
//        if (texto.isEmpty()) {
//            fila.values[1] = texto;
//        } else {
//            System.out.println("Não inseriu o valor");
//        }
    }
}
