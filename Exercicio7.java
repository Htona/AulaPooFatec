package Lista4;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];

    System.out.println("Digite 10 números:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
    }

    System.out.print("\nDigite o valor X a ser buscado: ");
    int x = scanner.nextInt();
    
    boolean encontrado = false;
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == x) {
            encontrado = true;
            break; // Se achou, não precisa continuar procurando
        }
    }

    if (encontrado) {
        System.out.println("O valor " + x + " está presente no array.");
    } else {
        System.out.println("O valor " + x + " NÃO está presente no array.");
    }
    
    scanner.close();
}
}