package Lista4;

import java.util.Scanner;

public class Exercicio16 {
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

        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Imprime invertendo os índices i e j para transpor na exibição
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
