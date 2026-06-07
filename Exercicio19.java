package Lista4;

import java.util.Scanner;

public class Exercicio19 {
	
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

	        boolean ehIdentidade = true;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (i == j) {
	                    // Elemento da diagonal principal deve ser 1
	                    if (matriz[i][j] != 1) {
	                        ehIdentidade = false;
	                        break;
	                    }
	                } else {
	                    // Qualquer outra posição deve ser 0
	                    if (matriz[i][j] != 0) {
	                        ehIdentidade = false;
	                        break;
	                    }
	                }
	            }
	        }

	        if (ehIdentidade) {
	            System.out.println("\nA matriz É uma matriz identidade.");
	        } else {
	            System.out.println("\nA matriz NÃO é uma matriz identidade.");
	        }
	        scanner.close();
	    }
	}