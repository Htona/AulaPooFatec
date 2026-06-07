package Lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Leia um número e verifique se ele está no intervalo entre 10 e 50 (inclusive).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int numero = sc.nextInt();
		
		if (numero >= 10 && numero <= 50) {
			System.out.println("Dentro do intervalo");
		} else{
			System.out.println("Fora do intervalo");	
		}
		sc.close();
	}

}
