package Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
        // Cria o scanner para ler os dados do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Declara e instancia um array de inteiros com 5 posições
        int[] numeros = new int[5];

        // Loop para ler os 5 números inteiros
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Loop para exibir todos os valores armazenados
        System.out.println("\nValores armazenados no array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
