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
//        List<String> materias = new ArrayList<>();
//
//        materias.add("Matemática");
//        materias.add("Português");
//        materias.add("Física");
//
//        Map<String, Aluno> nomeIdade1 = new HashMap<>();
//        Aluno aluno1 = new Aluno("Sara", new Date(99, 03, 16), materias);
//        Aluno aluno2 = new Aluno("Dark", new Date(103, 12, 23), materias);
//        Aluno aluno3 = new Aluno("Gabriel", new Date(102, 03, 28), materias);
//
//        long diffDays = ChronoUnit.DAYS.between(aluno1.getDataNascimento(), dataAtual);
//        long diffMonths = ChronoUnit.MONTHS.between(aluno1.getDataNascimento(), dataAtual);
//        long diffYears = ChronoUnit.YEARS.between(aluno1.getDataNascimento(), dataAtual);
//        System.out.println("Diferença em dias: " + diffDays);
//        System.out.println("Diferença em meses: " + diffMonths);
//        System.out.println("Diferença em anos: " + diffYears);
//
//
//        System.out.println(aluno1.getNome());

        // Exercício 5
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
