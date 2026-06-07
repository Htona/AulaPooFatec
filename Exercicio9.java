package Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        long fatorial = 1;

	        for (int i = numero; i >= 1; i--) {
	            fatorial *= i;
	        }

	        System.out.println(numero + "! = " + fatorial);

	        sc.close();
	    }
	}