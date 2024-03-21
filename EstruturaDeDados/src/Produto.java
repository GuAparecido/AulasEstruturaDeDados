// 1. Definição de Variáveis: Escreva um programa Java que declare e inicialize variáveis
// para armazenar informações sobre um produto, como nome (String), preço (double),
// quantidade em estoque (int) e disponibilidade (boolean). Atribua valores a essas variáveis
// e imprima suas informações na tela.
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private boolean disponibilidade;

    public Produto(String nome, double preco, int quantidadeEmEstoque, boolean disponibilidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", disponibilidade=" + disponibilidade +
                '}';
    }
}
