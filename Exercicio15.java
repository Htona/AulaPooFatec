package Lista4;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int contPares = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] % 2 == 0) {
                    contPares++;
                }
            }
        }

        System.out.println("\nA matriz possui " + contPares + " números pares.");
        scanner.close();
    }
}