package Aula06;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula06 {

    public static void main(String[] args) {
        System.out.println("Insira o objeto que deseja encontrar a posição.");
        Scanner scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        lista.add("String 4");
        lista.add("String 5");
        lista.add("String 6");
        lista.add("String 6");

        String value = scanner.nextLine();
        int indice = lista.indexOf(value);
        int ultimoIndice = lista.lastIndexOf(value);
        System.out.println("A posição da lista é: " + (indice + 1));
        System.out.println("A última posição do item é " + (ultimoIndice + 1));

        String remove = lista.remove(ultimoIndice);
        System.out.println("Removeu " + remove);

        boolean removeu = lista.remove("String 6");
        System.out.println("Removeu? " + removeu);

        for (int i=0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //forech
        for (String item : lista) {
            System.out.println("Item da lista: " + item);
        }

        lista.clear();
        System.out.println("O tamanho da lista é: " + lista.size());

        // System.out.println(lista.get(32)); Vai dar pau

    }
}
