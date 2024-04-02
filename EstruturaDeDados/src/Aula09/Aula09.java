package Aula09;

import java.util.LinkedList;
import java.util.Queue;

public class Aula09 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");

        // Está percorrendo a quantidade de vezes na fila o mesmo item.
        for (String elemento : fila) {
            System.out.println(fila.peek());
        }

        // Forma de percorrer e retornar os elementos um a um
        int size = fila.size();
        for (int i = 0; i < size; i++) {
            System.out.println(fila.poll());
        }

    }

}
