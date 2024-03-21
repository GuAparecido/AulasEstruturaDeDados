package Aula03;

import java.util.Arrays;

public class ListaJava {

    private final int LIST_SIZE = 10;
    private int tamanho = 0;
    private Integer[] values = new Integer[LIST_SIZE];

    public void add(Integer value) {
        // TODO validar se a lista já atingiu o limite
        // Estudar porque eu não entendi nada.
        if(values[LIST_SIZE - 1] != null) {
            System.out.println("O limite de já foi atingido.");
            return;
        }

        // TODO validar se o valor do objeto é maior que zero
        if(value > 0 && value < 1000) {
            System.out.println("O valor digitado é maior que zero.");
            for (int i = 0; i < this.values.length; i++) {
                if (this.values[i] == null) {
                    System.out.println("Adicionando o " + value);
                    this.values[i] = value;
                    tamanho++;
                    break;
                }
            }
        } else {
            System.out.println("O valor digitado é menor que zero. Não pode ser adicionado.");
            return;
        }

    }

    public Integer find(int index) {
        // TODO retorne o item pedido
        if (index < LIST_SIZE) {
            return this.values[index - 1];
        }
        return -9999;
//        if (index >= 0 && index < 10) {
//            System.out.println(values[index]);
//        } else {
//            System.out.println("Valor inválido.");
//        }
//        return null;
    }

    private void aumentarTamanho() {
        // TODO DESAFIO!! Descobrir uma maneira de aumentar o tamanho do array (substituir)
        this.values = Arrays.copyOf(this.values, LIST_SIZE + 1);

    }

//    @Override
//    public String toString() {
//        // TODO Crie um método para imprimir
//        return null;
//    }


    @Override
    public String toString() {
        return "ListaJava{" +
                "LIST_SIZE=" + LIST_SIZE +
                ", tamanho=" + tamanho +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
