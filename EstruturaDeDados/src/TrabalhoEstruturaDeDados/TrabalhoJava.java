package TrabalhoEstruturaDeDados;

import java.time.LocalDate;
import java.util.*;

public class TrabalhoJava {
    //    Exercício 2 - Listas dinâmicas:
//
//    Crie uma classe nova chamada TrabalhoJava e crie o método main.
//    Dentro do método main, defina um ArrayList e adicione 3 objetos distintos criados a
//    partir da classe Aluno. (esses 3 objetos serão importantes para o restante do trabalho)
//    Percorra a lista e imprima cada um dos objetos (lembrando do método toString() criado no
//    exercício anterior).
    public static void main(String[] args) {
        System.out.println("************************* Exercício 2 *************************");

        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("Gustavo", LocalDate.of(2000, 10, 10), 1);
        Aluno aluno2 = new Aluno("Gabriel", LocalDate.of(2002, 12, 16), 2);
        Aluno aluno3 = new Aluno("Bruno", LocalDate.of(1998, 1, 19), 3);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

//        Imprimindo sem saber programar
//        System.out.println(aluno1.toString());
//        System.out.println(aluno2.toString());
//        System.out.println(aluno3.toString());

//      Imprimindo sem saber ainda mas com for
        for (Aluno soda : alunos) {
            System.out.println(soda.toString());
        }

        System.out.println("\n");


//        Exercício 3 - Listas dinâmicas:
//
//        Ainda no método main da classe criada no exercício anterior,
//        remova os itens da posição 0 e 1 e imprima novamente a lista,
//        mostrando que agora só possui um registro.

        System.out.println("************************* Exercício 3 *************************");

        // Comentando para rodar o for
        alunos.removeFirst();
        alunos.removeFirst();
        System.out.println("Após a exclusão de alunos: " + alunos + "\n");

//        for (Aluno soda : alunos) {
//            System.out.println(soda.toString());
//        }

//        Exercício 4 - Comparação de objetos:
//
//        Implemente o método "equals" da classe Aluno.
//        Esse método deverá considerar apenas a propriedade "matricula".
//        Na nossa regra de negócio hipotética desse trabalho, os objetos de
//        Aluno serão considerados iguais quando possuírem a mesma matrícula,
//        independente do restante dos valores.
        System.out.println("************************* Exercício 4 *************************");

        Aluno aluno4 = new Aluno("Jão", LocalDate.of(2002, 3, 30), 4);
        Aluno aluno5 = new Aluno("Borsato", LocalDate.of(2005, 2, 3), 5); //Trocar 5 por 6 para testar a validação
        Aluno aluno6 = new Aluno("Sara", LocalDate.of(1999, 3, 16), 6);

        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);

        // Utilizando o equals() alunos - Não terá matrículas iguais, pois utilizamos o Set!
        if (aluno5.equals(aluno6)) {
            System.out.println("O aluno já existe! \n");
        } else {
            System.out.println("As matrículas não são iguais.\n");
        }

        System.out.println("Utilizando um for para verificar se os alunos são iguais.");

        // Utilizando o array de alunos - Não terá matrículas iguais..
        int sizeAlunos = alunos.size();
        for (int i=0; i < sizeAlunos; i++) {
            for (int j = (i + 1) ; j < sizeAlunos; j++) {
                if ((alunos.get(i)).equals(alunos.get(j))) {
                    System.out.println("O aluno já existe! \n" + alunos.get(i) + "\n" + alunos.get(j));
                } else {
                    System.out.println("As matrículas não são iguais.\n" + alunos.get(i) + "\n" + alunos.get(j) + "\n");
                }
            }
        }

//        Exercício 5 - Conjuntos (Set):
        System.out.println("************************* Exercício 5 *************************");
//
//        No método main, crie um Set (HashSet) de Alunos e crie mais um objeto de Aluno
//        e defina nesse objeto novo um valor de matrícula já utilizado em algum outro objeto.
//        Tente adicionar os 4 objetos de Aluno dentro do HashSet e percorra (utilizando um for)
//        o Set mostrando todos os objetos.
//        obs: se tudo correr bem, só teremos 3 objetos impressos do HashSet, uma vez que o método
//        equals entenderá os 2 objetos de mesma matrícula como iguais.
        Set<Aluno> estudantes = new HashSet<>();
        Aluno aluno7 = new Aluno("Dark", LocalDate.of(2005, 2, 7), 7);
        Aluno aluno8 = new Aluno("Léo Lins", LocalDate.of(2002, 12, 16), 7);
        Aluno aluno9 = new Aluno("Mizuno", LocalDate.of(2002, 8, 1), 9);
        Aluno aluno10 = new Aluno("Murilo", LocalDate.of(1996, 10, 14), 10);

        estudantes.add(aluno7);
        estudantes.add(aluno8);
        estudantes.add(aluno9);
        estudantes.add(aluno10);

        for (Aluno aluno : estudantes) {
            System.out.println("Alunos cadastrados como estudantes: " + aluno);
        }

        System.out.println("\n");

//        Exercício 6 - Conjuntos (Set):
        System.out.println("************************* Exercício 6 *************************");
//
//        Crie 2 objetos Set de alunos e coloque no primeiro set 2 alunos. No segundo set,
//        coloque mais 2 alunos, porém, somente um deles pode ser igual a um objeto
//        adicionado no primeiro set.
//        Utilizando o conceito de união dos Set (union), adicione o segundo conjunto no
//        primeiro e imprima o resultado. O resultado deverá conter apenas 3 objetos, visto
//        que um deles é igual de propósito.
        HashSet<Aluno> hash1 = getAlunos();

        for (Aluno aluno : hash1) {
            System.out.println("Teste de duplicidade hash: " + aluno);
        }

        System.out.println("\n");

//        Exercício 7 - Filas (LinkedList):
        System.out.println("************************* Exercício 7 *************************");
//
//        No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila.
//        Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na fila.
        Queue<Aluno> queue1 = new LinkedList<>();
        Aluno aluno15 = new Aluno("Thiago da Chalana na usina", LocalDate.of(2009, 1, 4), 15);
        Aluno aluno16 = new Aluno("Cleitin da Hornet", LocalDate.of(2009, 1, 4), 16);

        queue1.offer(aluno15);
        queue1.offer(aluno16);

        System.out.println("Primeiro aluno da fila foi deletado: ");
        System.out.println(queue1.poll());

        for (Aluno aluno : queue1) {
            System.out.println("Os alunos restantes foram: \n" + aluno);
        }

        System.out.println("\n");

//        Exercício 8 - Filas (LinkedList):
        System.out.println("************************* Exercício 8 *************************");
//
//        No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila.
//        Em seguida, implemente um algoritmo que remova e imprima o nome do último aluno na fila.
        Queue<Aluno> queue2 = new LinkedList<>();
        Aluno aluno17 = new Aluno("Bar do Tião", LocalDate.of(2009, 1, 4), 17);
        Aluno aluno18 = new Aluno("Dono da bola", LocalDate.of(2009, 1, 4), 18);

        queue2.offer(aluno17);
        queue2.offer(aluno18);

        while (!queue2.isEmpty()) {
            Aluno element = queue2.poll();
            if (queue2.isEmpty()) {
                System.out.println("Nome do último da fila que foi excluída: " + element);
            }
        }

        System.out.println("\n");

//        Exercício 9 - Pilhas (Stack):
        System.out.println("************************* Exercício 9 *************************");
//
//        No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha.
//        Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na pilha.
//        obs: Lembrem-se que na fila o "primeiro" objeto não corresponde ao primeiro adicionado.
        Stack<Aluno> pilha2 = new Stack<>();
        Aluno aluno23 = new Aluno("Pilha5", LocalDate.of(2009, 1, 4), 23);
        Aluno aluno24 = new Aluno("Pilha6", LocalDate.of(2009, 1, 20), 24);
        Aluno aluno25 = new Aluno("Pilha7", LocalDate.of(2009, 1, 20), 25);
        Aluno aluno26 = new Aluno("Pilha8", LocalDate.of(2009, 1, 20), 26);

        pilha2.push(aluno23);
        pilha2.push(aluno24);
        pilha2.push(aluno25);
        pilha2.push(aluno26);

        System.out.println(pilha2.pop());
        System.out.println("Após a exclusão do primeiro da pilha: " + pilha2);

        System.out.println("\n");

//        Exercício 10 - Pilhas (Stack):
        System.out.println("************************* Exercício 10 *************************");
//
//        No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha.
//        Em seguida, implemente um algoritmo que remova e imprima o nome do último aluno na pilha.
        Stack<Aluno> pilha = new Stack<>();
        Aluno aluno19 = new Aluno("Pilha1", LocalDate.of(2009, 1, 4), 19);
        Aluno aluno20 = new Aluno("Pilha2", LocalDate.of(2009, 1, 20), 20);
        Aluno aluno21 = new Aluno("Pilha3", LocalDate.of(2009, 1, 20), 21);
        Aluno aluno22 = new Aluno("Pilha4", LocalDate.of(2009, 1, 20), 22);

        pilha.push(aluno19);
        pilha.push(aluno20);
        pilha.push(aluno21);
        pilha.push(aluno22);

        while (!pilha.isEmpty()) {
            Aluno element = pilha.pop();
            if (pilha.isEmpty()) {
                System.out.println(element);
            }
        }

        // Pilha deve estar toda excluída
        System.out.println("Pilha excluída: " + pilha);

    }

    private static HashSet<Aluno> getAlunos() {
        HashSet<Aluno> hash1 = new HashSet<>();
        Aluno aluno11 = new Aluno("Ivan", LocalDate.of(1993, 1, 4), 11);
        Aluno aluno12 = new Aluno("Juscelino", LocalDate.of(1995, 3, 28), 12);

        hash1.add(aluno11);
        hash1.add(aluno12);

        HashSet<Aluno> hash2 = new HashSet<>();
        Aluno aluno13 = new Aluno("Marco", LocalDate.of(2009, 1, 4), 11);
        Aluno aluno14 = new Aluno("Dark", LocalDate.of(2001, 3, 28), 14);

        hash2.add(aluno13);
        hash2.add(aluno14);

        hash1.addAll(hash2);
        return hash1;
    }
}
