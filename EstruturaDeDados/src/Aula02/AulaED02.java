package Aula02;

public class AulaED02 {

    public static void main(String[] args) {

        // Mostrando que a String é um array de char
//        String curso = "TADS - Terceiro Período";
//
//        for (int i = 0; i < curso.length(); i++) {
//            System.out.println(curso.charAt(i));
//        }

        // definindo um array/vetor
//          int[] nota = new int[4];
//        nota[0] = 10;
//        nota[1] = 10;
//        nota[2] = 10;
//        nota[3] = 10;
//
//        // Definindo o Scanner "cin" do Java
//        Scanner scanner = new Scanner(System.in);
//
//        // Solicitando dados para preencher os vetores
//        for (int i=0; i < 4; i++) {
//            System.out.println("Digite a nota nº " + (i + 1));
//            // nextInt porque vamos retornar um inteiro.
//            nota[i] = scanner.nextInt();
//        }
//
//        // Printando o vetor criado
//        for (int i=0; i < 4; i++) {
//            System.out.println("O valor do item é " + nota[i]);
//        }

        // Trabalahndo com matrizes - array de 2 ou mais dimensões;
        // Sempre linha e coluna, nessa ordem.
        int[][] matriz = new int[3][3];

        int cont = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = cont;
                cont++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if(j == 2) {
                    System.out.println();
                }else {
                    System.out.print(", ");
                }
            }
        }

//        System.out.println("Valores da matriz: " + matriz);

    }
}
