package Revisao;

import Aula06.Aluno;

import java.time.LocalDate;
import java.util.*;

public class Revisao {
    public static void main(String[] args) {
        // arrays

//        Criando um array de maneira simples e passando valor para ele
//        String[] valorString = new String[]{"Valor 1"};

//        Definindo o valor máximo do array, nesse caso 10
        String[] valorString = new String[10];

//        preenchendo o array
        for (int i = 0; i < valorString.length; i++) {
            valorString[i] = ("Valor " + i);
        }

        for (int i = 0; i < valorString.length; i++) {
            System.out.println(valorString[i]);
        }

        // Listas dinâmicas - ArrayList
        List<String> list = new ArrayList<>();
        // Adidionar elementos no ArrayList
        list.add("Valor 1");
        list.add("Valor 2");

//        percorrer a lista dinâmica forech
        System.out.println("Forech");
        for (String element : list) {
            System.out.println(element);
        }

//        percorrer a lista dinâmica
        System.out.println("For comum");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        remover os elementos da lista
        list.remove(1); // remova um indice específico
        list.clear(); // limpa a lista
        System.out.println("Lista depois da remoção " + list);

        // Declarando alunos e incluindo Alunos com a classe alunos da aula 06
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria José");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("João da Silva");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("João da Silva");
        aluno3.setDataNascimento(LocalDate.now());


        // Set - Conjuntos
        Set<Aluno> setAlunos = new HashSet<>();
        // adicionando elementos no conjunto
        setAlunos.add(aluno1);
        setAlunos.add(aluno2);
        setAlunos.add(aluno3); // Não vai adicionar porque é igual ao aluno1

        // removendo elementos
        setAlunos.remove(aluno2);

        // percorrendo o conjunto
        for (Aluno aluno : setAlunos) {
            System.out.println(aluno);
        }

        // Maps - Mapas chave-valor
        Map<String, Aluno> mapAluno = new HashMap<>();

        // Adicionando elementos no mapa
        mapAluno.put(aluno1.getNome(), aluno1);
        mapAluno.put(aluno2.getNome(), aluno2);
        mapAluno.put(aluno3.getNome(), aluno3); // deve substituir o valor 1

        // Percorrendo o mapa pelas chaves
        for (String chave : mapAluno.keySet()) {
            System.out.println(mapAluno.get(chave));
        }

        // Queue - Filas (FIFO/PEPS)
        Queue<String> fila = new LinkedList<>();
        // Adicionando elementos na fila
        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");
        // Percorrer a fila
//        while(!fila.isEmpty()) {
//            System.out.println(fila.poll());
//        }

        // Imprimindo apenas o último elemento *** Tem que tirar o percorrer anterior para funcionar ***
        while (!fila.isEmpty()) {
            String element = fila.poll();
            if (fila.isEmpty()) {
                System.out.println(element);
            }
        }
        System.out.println("Fila depois do while: " + fila);

        // Stack - Pilha LIFO(UEPS)
        Stack<String> pilha = new Stack<>();

        // Empilhando elementos
        pilha.push("Primeiro a entrar");
        pilha.push("Segundo a entrar");
        pilha.push("Terceiro a entrar");

        // Desempilhar elementos
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }


    }
}
