package Aula03;

public class ListaJava {

    private final int LIST_SIZE = 10;
    private int tamanho = 0;

    public Integer[] values = new Integer[LIST_SIZE];

    public void add(Integer value) {
        // TODO validar se a lista já atingiu o limite
        // Estudar porque eu não entendi nada.
        if(values[LIST_SIZE - 1] != null) {
            System.out.println("O limite de já foi atingido.");
            return;
        }

        // TODO validar se o valor do objeto é maior que zero
        if(value > 0) {
            System.out.println("O valor digitado é maior que zero.");
        } else {
            System.out.println("O valor digitado é menor que zero.");
            return;
        }

        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] == null) {
                System.out.println("Adicionando o " + value);
                this.values[i] = value;
                tamanho++;
                break;
            }
        }

    }

    public Integer find(int index) {
        // TODO retorne o item pedido
        if (index >= 0 && index < 10) {
            System.out.println(values[index]);
        } else {
            System.out.println("Valor inválido.");
        }
        return null;
    }

    private void aumentarTamanho() {
        // TODO DESAFIO!! Descobrir uma maneira de aumentar o tamanho do array (substituir)

    }

    @Override
    public String toString() {
        // TODO Crie um método para imprimir
        return null;
    }
}
