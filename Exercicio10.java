package Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores únicos informados:");
        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;
            
            // Verifica se o número já apareceu antes na lista
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true;
                    break;
                }
            }
            
            // Se não apareceu antes, pode exibir
            if (!duplicado) {
                System.out.print(numeros[i] + " ");
            }
        }
        
        scanner.close();
    }
}