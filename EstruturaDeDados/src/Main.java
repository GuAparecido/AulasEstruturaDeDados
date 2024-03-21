import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto("Óleo Coamo", 8.99, 3, true);
        System.out.println(produto.toString());

        Carro carro = new Carro("Chevrolet", "Astra Preto 2.0", 2009, 29000);
        carro.mostrarInformacoes();

        System.out.println("Insira o valor de desconto para calcular");
        double desconto = scanner.nextDouble();
        carro.aplicarDesconto(desconto);



    }
}