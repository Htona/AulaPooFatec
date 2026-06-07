package Lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Se valor >= 100, aplicar 10% de desconto.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor da compra: ");
		double valor = sc.nextDouble();
				
				if (valor >= 100) {
					valor = valor - (valor * 0.10);
				}
		
		System.out.println("Valor fina: " + valor);
		sc.close();
	}

}
