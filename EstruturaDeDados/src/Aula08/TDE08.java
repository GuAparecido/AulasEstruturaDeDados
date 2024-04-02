package Aula08;

import Aula06.Aluno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TDE08 {
    public static void main(String[] args) {
        // Exercício 1
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatarData);
        System.out.println(dataFormatada);

        // Exercício 2
        LocalDateTime dataEhoraAtual = LocalDateTime.now();

        String formatarDataEHora = dataEhoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(formatarDataEHora);

        // Exercício 3
        Map<String, Integer> nomeIdade = new HashMap<>();
        nomeIdade.put("Gustavo", 23);
        nomeIdade.put("Otavio", 20);
        nomeIdade.put("Brunão", 26);

        System.out.println(nomeIdade);

        // Exercício 4
        // Exercício professor
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jackson Five");
        aluno1.setDataNascimento(LocalDate.of(2004, 4,12));

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Joãozinho da TI");
        aluno2.setDataNascimento(LocalDate.of(2005, 8,2));

        Map<String, Aluno> map = new HashMap<>();
        map.put(aluno1.getNome(), aluno1);
        map.put(aluno2.getNome(), aluno2);

        for (String key : map.keySet()) {
            Aluno value = map.get(key);

            LocalDate now = LocalDate.now();
            long diffYears = ChronoUnit.YEARS.between(value.getDataNascimento(), now);

            System.out.println("Nome: " + value.getNome() + ", Idade: " + diffYears);
        }
//        List<String> materias = new ArrayList<>();
//
//        materias.add("Matemática");
//        materias.add("Português");
//        materias.add("Física");
//
//        Aluno aluno1 = new Aluno("Sara", LocalDate.of(1999, 3, 16), materias);
//        Aluno aluno2 = new Aluno("Dark", LocalDate.of(2003, 12, 23), materias);
//        Aluno aluno3 = new Aluno("Gabriel", LocalDate.of(2002, 3, 28), materias);
//
//        Map<String, Aluno> nomeIdade1 = new HashMap<>();
//        nomeIdade1.put(aluno1.getNome(), aluno1);
//        nomeIdade1.put(aluno2.getNome(), aluno2);
//        nomeIdade1.put(aluno3.getNome(), aluno3);
//
//        for (String key : nomeIdade1.keySet()) {
//            Aluno value = map.get(key);
//            LocalDate now = LocalDate.now();
//            long diffYears = ChronoUnit.YEARS.between(value.getDataNascimento(), dataAtual);
//            System.out.println("Nome: " + value.get(nome) + ", Idade: " + diffYears);
//        }

//        long diffDays = ChronoUnit.DAYS.between(aluno1.getDataNascimento(), dataAtual);
//        long diffMonths = ChronoUnit.MONTHS.between(aluno1.getDataNascimento(), dataAtual);
//        long diffYears = ChronoUnit.YEARS.between(aluno1.getDataNascimento(), dataAtual);
//        System.out.println("Diferença em dias: " + diffDays);
//        System.out.println("Diferença em meses: " + diffMonths);
//        System.out.println("Diferença em anos: " + diffYears);




//        System.out.println(aluno1.getNome());
//
//        // Exercício 5
//        Map<String, Set<String>> telefone = new HashMap<>();
//        telefone.put("Gustavo", new HashSet<>("(44)9 9999-9999"));
//        telefone.put("Otavio", "(44)9 9999-9999");
//        telefone.put("Gabriel", "(44)9 9999-9999");
//
//        for (String letter : telefone){
//            for (char l : letter.toCharArray()){
//                System.out.println(l);
//            }
//            System.out.println();
//        }

    }
}
