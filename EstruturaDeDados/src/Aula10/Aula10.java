package Aula10;

import java.util.Stack;

public class Aula10 {
    // Aprendendo pilha
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();
        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

    }
}
