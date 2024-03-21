// 2. Criação de uma Classe Simples: Crie uma classe chamada Carro com quatro atributos:
// marca (do tipo String), modelo (do tipo String), ano (do tipo int) e preco (do tipo double).
// Inclua um construtor que inicialize esses atributos.
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }


    // 3. Implementação de Dois Métodos na Classe: Adicione dois métodos à classe Carro:
    // a) Um método chamado mostrarInformacoes() que imprima na tela a marca, modelo, ano e preço do carro.

    public void mostrarInformacoes() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.preco);
    }

    // b) Outro método chamado aplicarDesconto(double desconto) que aplique
    // um desconto ao preço do carro e atualize o valor do atributo preco.
    double desconto;
    public void aplicarDesconto(double desconto){
        System.out.println("O valor do carro é " + preco);
        System.out.println("O valor com o desconto solicitado é de: " + (preco - ((preco * desconto)/100)));
    }
}
