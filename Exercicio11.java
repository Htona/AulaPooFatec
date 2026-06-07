package Lista2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Calculadora
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:" );
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número:" );
		double n2 = sc.nextDouble();
		
		System.out.println("Digite a operação ( +, -, *, /): ");
		char operacao = sc.next().charAt(0);
		
		switch (operacao) {
		case '+':
		    System.out.println("Resultado: " + (n1 + n2));
		    break;
		case '-':
			System.out.println("Resultado: " + (n1 - n2));
			break;
		case '*':
			System.out.println("Resultado: " + (n1 * n2));
			break;
		case '/':
			if(n2 !=0) {
			System.out.println("Resultado: " + (n1 / n2));
			break;
			} else {
				System.out.println("Erro: não é possivel dividir ");
			}
			break;
			default:
			System.out.println("Operação inválida");
			break;		
		}
		sc.close();
	}

}
