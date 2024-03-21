// Importando a classe ListaJava para poder utilizar na pasta 05
import Aula03.ListaJava;

import java.util.Scanner;

public class AulaED05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo uma variável lista do tipo ListaJava.
        ListaJava lista = new ListaJava();

        System.out.println("Entre com um valor");
        int valor = scanner.nextInt();

        // ESSE CÓDIGO DÁ ERRADO PQ O VALUES É PRIVADO
        // IF (VALOR>0) {
        //  lista.values[0] = valor;
        // }

        lista.add(valor);
        lista.add(valor + 1);
        lista.add(valor + 2);
        lista.add(valor + 3);

        Integer retorno = lista.find(1);
        System.out.println("O item buscado é o: " + retorno);

        System.out.println("A minha lista é " + lista);

    }
}
