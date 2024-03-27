package Aula06;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);
    // Atributos
    private String nome;
    private Date dataNascimento;
    private List<String> materias;

    // Construtor
    public Aluno() {
    }

    public Aluno(String nome, Date dataNascimento, List<String> materias) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.materias = materias;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public String mostrarMaterias() {
        return ("Matérias [" +
            String.join(", ", materias) +
            "]");
    }

    public void adicionarMateria(String materia) {
        this.materias.add(materia);
    }

    public void removerMateria(String materia) {
        this.materias.remove(materia);
    }

    // Utilizando o método equals para comparar objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
