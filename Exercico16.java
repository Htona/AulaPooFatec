package Lista2;

import java.util.Scanner;

public class Exercico16 {

	public static void main(String[] args) {
		// Leia um valor inteiro
		// Calcule a menor quantidade de notas (100, 50, 20, 10, 5, 2, 1)
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor: ");
		int valor = sc.nextInt();
		
		int n100 = valor/100;
		valor %= 100;
		
		int n50 = valor/50;
		valor %= 50;
		
		int n20 = valor/20;
		valor %= 20;
		
		int n10 = valor/10;
		valor %= 10;
		
		int n5 = valor/5;
		valor %= 5;
		
		int n2 = valor/2;
		valor %= 2;

		System.out.println("Notas de 100: " + n100);
		System.out.println("Notas de 50: " + n50);
		System.out.println("Notas de 20: " + n20);
		System.out.println("Notas de 10: " + n10);
		System.out.println("Notas de 5: " + n5);
		System.out.println("Notas de 2: " + n2);
		
	    sc.close();
	    }
     }
