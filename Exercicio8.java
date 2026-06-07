package Lista4;

import java.util.Scanner;

public class Exercicio8 {

	public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o valor X para contar as ocorrências: ");
        int x = scanner.nextInt();
        
        int contagem = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == x) {
                contagem++;
            }
        }

        System.out.println("O valor " + x + " aparece " + contagem + " vezes no array.");
        scanner.close();
    }
}}