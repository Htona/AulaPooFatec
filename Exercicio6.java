package Lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Criança: 0-12, Adolescente: 13-17, Adulto: 18-59, Idoso: 60+

		Scanner sc = new Scanner (System.in);
		System.out.println("Digita a idade: ");
		int idade = sc.nextInt();
		
		if (idade <= 12) {
		   System.out.println("Criança");
		} else if (idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade <= 59) { ;
		System.out.println("Adulto");
	} else {
        System.out.println("Idoso");
    }
    sc.close();
}
}