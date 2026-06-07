package Lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Leia um número inteiro e classifique:
		// "Positivo" maior que 0, "Negativo" menor que 0, "Zero" igual a 0
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if (numero > 0) { System.out.println("Positivo"); }
		else if (numero < 0 ) { System.out.println("Negativo"); }
		else { System.out.println("Zero"); }
		sc.close();
		}
	}
