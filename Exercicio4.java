package Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Leia dois números inteiros e informe qual deles é o maior, 
		// ou se ambos são iguais.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		if ( n1 > n2) {
			System.out.println("O maior é:" + n1);
		} else if (n2 > n1) {
			System.out.println("O maior é:" + n2);
		} else {
			System.out.println("Os números são iguais");
		}
		sc.close();
		}
	}
