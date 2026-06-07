package Lista2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//Leia três números e informe qual é o maior.
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("Maior: " + n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println("Maior: " + n2);
		} else {
			System.out.println( "Maior: " + n3);
		}
		sc.close();
		}
	}