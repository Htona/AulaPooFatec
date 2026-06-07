package Lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPar = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] % 2 == 0) {
                contPar++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + contPar);
        scanner.close();
    }
}