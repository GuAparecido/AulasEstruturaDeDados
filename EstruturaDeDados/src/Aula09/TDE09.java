package Aula09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TDE09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Exercício 1: Adicionar e Remover Elementos Crie um programa Java que utilize uma LinkedList
        como uma Queue. Adicione os números de 1 a 5 na fila e, em seguida, remova e imprima cada elemento
        da fila.*/
        Queue<Integer> contagem = new LinkedList<>();
        contagem.offer(1);
        contagem.offer(2);
        contagem.offer(3);
        contagem.offer(4);
        contagem.offer(5);

        int sizeContagem = contagem.size();
        for(int i = 0; i < sizeContagem; i++){
            System.out.println(contagem.poll());
        }

        System.out.println(contagem);

        /* Exercício 2: Verificar a Presença de Elementos Escreva um programa Java que utilize uma
        LinkedList como uma Queue. Adicione alguns números na fila e verifique se um número específico
        está presente na fila. Imprima o resultado.*/
        contagem.offer(1);
        contagem.offer(2);
        contagem.offer(3);
        contagem.offer(4);
        contagem.offer(5);
        contagem.offer(6);
        contagem.offer(7);
        contagem.offer(8);
        contagem.offer(9);
        contagem.offer(10);

        int sizeNovaContagem = contagem.size();

        System.out.println("Insira o valor que deseja consultar na lista: ");
        int valor = Integer.parseInt(scanner.nextLine());

        if (contagem.contains(valor)) {
            System.out.println("O valor digitado foi " + valor + " e ele está presente na lista");
        } else {
            System.out.println("O valor digitado foi " + valor + " e ele não está presente na lista");
        }

        /* Exercício 3: Filtrar Elementos Escreva um programa Java que utilize uma LinkedList como uma Queue.
        Adicione alguns números na fila e remova todos os elementos mantendo (em uma outra lista, se precisar)
        os números maiores que 5. Imprima a fila resultante.*/


        /* Exercício 4: Esvaziar a Fila Crie um programa Java que utilize uma LinkedList como uma Queue.
        Adicione alguns elementos na fila e, em seguida, remova todos os elementos da fila até que ela
        esteja vazia. Imprima a fila a cada remoção.*/

    }
}
