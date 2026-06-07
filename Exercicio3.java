package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia a idade de uma pessoa e informe se ela é "Maior de idade" (18 ou mais) 
		// ou "Menor de idade".
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Digite a idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
			sc.close();
		}
	}
}
