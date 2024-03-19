package Aula04;

public class PessoaTDE04 {
    String nome;
    int idade;

    // Construtor
    public PessoaTDE04(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Função que imprime o nome e idade.
    public void imprimirDetalhes(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }


}
