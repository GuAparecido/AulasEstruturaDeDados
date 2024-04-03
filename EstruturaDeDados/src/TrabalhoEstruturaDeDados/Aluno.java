package TrabalhoEstruturaDeDados;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno {
//    Exercício 1 - Classes Java:
//
//    Defina uma classe chamada Aluno com os seguintes atributos:
//
//    Um atributo do tipo String para o nome do aluno.
//    Um atributo do tipo LocalDate para a data de nascimento do aluno.
//    Um atributo do tipo Integer para a matrícula do aluno.
//
//    Implemente o método toString() para essa classe.
    private String nome;
    private LocalDate dataNascimento;
    private Integer matricula;

    public Aluno(String nome, LocalDate dataNascimento, Integer matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome= '" + nome + '\'' +
                ", dataNascimento= " + dataNascimento +
                ", matricula= " + matricula +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
