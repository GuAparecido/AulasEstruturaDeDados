package Aula07;

import Aula06.Aluno;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        LocalDate data2 = LocalDate.of(2024, 10, 10);
        System.out.println(data2);

        System.out.println(data2.getDayOfMonth() + "/" + data2.getMonthValue() + "/" + data2.getYear());

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        // Estudando sobre comparação de objetos
        Integer numero1 = 10;
        Integer numero2 = 10;

        if (numero1 == numero2) {
            System.out.println("Iguais!!");
        }

        Aluno gabNasc = new Aluno();
        gabNasc.setNome("Gabriel Nascimento");

        Aluno gabNasc2 = new Aluno();
        gabNasc2.setNome("Gabriel Nascimento");

        // if (gabNasc == gabNasc2) { Esse não funciona
        if (gabNasc.equals(gabNasc2)) {
            System.out.println("São a mesma pessoa");
        } else {
            System.out.println("Doppelganger");
        }

    }
}
