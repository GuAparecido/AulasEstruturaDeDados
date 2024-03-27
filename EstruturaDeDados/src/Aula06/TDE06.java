package Aula06;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDE06 {

    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();

        materias.add("Matemática");
        materias.add("Português");
        materias.add("Física");

        Aluno aluno1 = new Aluno("Gustavo", new Date(100, 10, 10), materias);
        Aluno aluno2 = new Aluno("Otavio", new Date(104, 10, 10), materias);
        Aluno aluno3 = new Aluno("Léo Lins", new Date(104, 10, 10), materias);
        Aluno aluno4 = new Aluno(); // Utilizando o aluno com construtor vazio

        System.out.println(aluno1.mostrarMaterias());

        aluno1.adicionarMateria("Libras");

        System.out.println(aluno1.mostrarMaterias());

        aluno1.removerMateria("Português");

        System.out.println(aluno1.mostrarMaterias());



    }
}
