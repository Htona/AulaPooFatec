package Lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Vai somando a cada iteração
        }

        System.out.println("\nA soma de todos os elementos é: " + soma);
        scanner.close();
    }
}