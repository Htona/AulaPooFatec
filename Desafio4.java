package Desafios;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaSecundaria = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Elementos da diagonal secundária: [0][2], [1][1], [2][0]
        for (int i = 0; i < 3; i++) {
            somaSecundaria += matriz[i][2 - i];
        }

        System.out.println("\nA soma da diagonal secundária é: " + somaSecundaria);
        scanner.close();
    }
}