package Desafios;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o número que deseja buscar na matriz: ");
        int numeroBusca = scanner.nextInt();
        boolean encontrado = false;

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numeroBusca) {
                    System.out.println("Número encontrado na posição: Linha " + i + ", Coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroBusca + " não foi encontrado na matriz.");
        }
        scanner.close();
    }
}