package Lista2;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Leia um ano
		// Verifique se é bissexto
		// Divisível por 4 e não por 100 OU divisível por 400

		Scanner sc = new Scanner(System.in);
		int ano = sc.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("Ano bissexto");
		} else {

		System.out.println("Não é bissexto");
	    sc.close();
		}
	}
}
