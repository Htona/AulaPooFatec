package Lista2;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// Leia o salário
		// ≤ 2000 → Isento
		// 2001 a 5000 → 10%
		// > 5000 → 20%
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Salário: ");
	        double salario = sc.nextDouble();

	        double imposto;

	        if (salario <= 2000) {
	            imposto = 0;
	        } else if (salario <= 5000) {
	            imposto = salario * 0.10;
	        } else {
	            imposto = salario * 0.20;
	        }

	        System.out.println("Imposto: " + imposto);
	        sc.close();
	    }
	}