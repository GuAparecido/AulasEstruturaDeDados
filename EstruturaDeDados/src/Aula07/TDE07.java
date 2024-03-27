package Aula07;

import java.util.HashSet;
import java.util.Set;

public class TDE07 {


    public static void main(String[] args) {
        // Exercício 1
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Banana");

        fruit.remove("Orange");

        System.out.println(fruit);


        // Exercício 2
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(4);
        inteiros.add(5);
        inteiros.add(6);

//        inteiros.remove(5);

        if(inteiros.contains(5)){
            System.out.println("Possui 5.");
        } else {
            System.out.println("Não possui 5.");
        }

        // Exercício 3
        Set<String> letras = new HashSet<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");

        // Plotando letra a letra usando forech
        for (String letter : letras){
            for (char l : letter.toCharArray()){
                System.out.println(l);
            }
            System.out.println();
        }

        System.out.println(letras);

        // Exercício 4
        System.out.println("Existem " + inteiros.size() + " valores nesse conjunto.");
        inteiros.clear();
        System.out.println("Existem " + inteiros.size() + " valores nesse conjunto.");

        // Exercício 5
        boolean repetidos;
        if (fruit.retainAll(fruit)) {
            System.out.println("Tem elementos repetidos.");
        } else {
            System.out.println("Não possui elementos repetidos.");
        }

    }

}
