package Aula07;

import Aula06.Aluno;
import jdk.jfr.Enabled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Aula07 {

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(8);
        a.add(12);
        a.add(99);

        Set<Integer> b = new HashSet<>();
        b.add(3);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(0);
        b.add(14);

        System.out.println("Conjunto A: " + a);
        System.out.println("Conjunto B: " + b);

        // Como encontrar a união de conjuntos?
//        boolean union = a.addAll(b);
//        System.out.println("União: " + a);

//        a.retainAll(b);
//        System.out.println("Intersecção: " + a);

        // "No meu conjunto A, remova todos que estão em B"
        a.removeAll(b);
        System.out.println("Diferença: " + a);

    }
}
