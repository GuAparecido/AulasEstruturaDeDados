package TrabalhoEstruturaDeDados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TrabalhoJava {
    //    Exercício 2 - Listas dinâmicas:
//
//    Crie uma classe nova chamada TrabalhoJava e crie o método main.
//    Dentro do método main, defina um ArrayList e adicione 3 objetos distintos criados a
//    partir da classe Aluno. (esses 3 objetos serão importantes para o restante do trabalho)
//    Percorra a lista e imprima cada um dos objetos (lembrando do método toString() criado no
//    exercício anterior).
    public static void main(String[] args) {
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


//        Exercício 3 - Listas dinâmicas:
//
//        Ainda no método main da classe criada no exercício anterior,
//        remova os itens da posição 0 e 1 e imprima novamente a lista,
//        mostrando que agora só possui um registro.

        // alunos.remove(aluno1); ou alunos.remove(aluno.indexOf(aluno1));
        // alunos.remove(aluno2); ou alunos.remove(aluno.indexOf(aluno2));
        alunos.remove(0);
        alunos.remove(0);

        for (Aluno soda : alunos) {
            System.out.println(soda.toString());
        }

//        Exercício 4 - Comparação de objetos:
//
//        Implemente o método "equals" da classe Aluno.
//        Esse método deverá considerar apenas a propriedade "matricula".
//        Na nossa regra de negócio hipotética desse trabalho, os objetos de
//        Aluno serão considerados iguais quando possuírem a mesma matrícula,
//        independente do restante dos valores.

        HashSet<Aluno> estudantes = new HashSet<>();
        Aluno aluno4 = new Aluno("Jão", LocalDate.of(2002, 3, 30), 3);
        Aluno aluno5 = new Aluno("Borsato", LocalDate.of(2005, 2, 3), 5);
        Aluno aluno6 = new Aluno("Sara", LocalDate.of(1999, 3, 16), 6);

        estudantes.add(aluno4);
        estudantes.add(aluno5);
        estudantes.add(aluno6);

        if (aluno3.equals(aluno4)) {
            System.out.println("O aluno já existe! ");
        } else {
            System.out.println("As matrículas não são iguais.");
        }





    }
}
