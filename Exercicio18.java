package Lista4;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3]; // Guardará a soma

        System.out.println("Digite os elementos da MATRIZ A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os elementos da MATRIZ B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma gerando a Matriz C e já exibe o resultado
        System.out.println("\nMatriz Resultante C (A + B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
