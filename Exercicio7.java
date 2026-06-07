package Lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Aprovado >= 6, Recuperação entre 4 e 6, Reprovado < 4
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		double n2 = sc.nextDouble();
		
		double media = (n1 + n2)/ 2;
		
		if (media >= 6) {
			System.out.println("Aprovado");
		} else if (media >= 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		sc.close();
		}	
	}
