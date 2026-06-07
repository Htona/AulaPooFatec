package Desafios;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] original = new int[3][3];
        int[][] rotacionada = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                original[i][j] = scanner.nextInt();
            }
        }

        // Lógica matemática para rotacionar 90 graus no sentido horário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotacionada[j][2 - i] = original[i][j];
            }
        }

        System.out.println("\nMatriz Rotacionada em 90 Graus:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotacionada[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
