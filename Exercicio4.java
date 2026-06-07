package Lista4;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[6];
        double soma = 0;

        System.out.println("Digite 6 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.printf("\nA média dos valores é: %.2f\n", media);
        scanner.close();
    }
}