package Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	//Leia um número inteiro e informe se é "Par" (resto 0) ou "Impar"
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        sc.close();
    }
}
