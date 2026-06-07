package Lista2;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Leia três lados
		// Classifique: Equilátero, Isósceles ou Escaleno
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (a == b && b == c) {
			System.out.println("Equilátero");
		} else if (a == b || a == c || b == c) {
			System.out.println("Isósceles");
		} else {
			System.out.println("Escaleno");
			sc.close();
        }
	}
}
