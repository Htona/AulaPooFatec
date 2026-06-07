package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nArray ordenado em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}