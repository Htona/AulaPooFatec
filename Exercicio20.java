package Lista4;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        // Calculando e mostrando a soma de cada linha
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da Linha " + i + ": " + somaLinha);
        }

        System.out.println();

        // Calculando e mostrando a soma de cada coluna
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j]; // Repare que invertemos i e j aqui para travar a coluna
            }
            System.out.println("Soma da Coluna " + j + ": " + somaColuna);
        }
        scanner.close();
    }
}