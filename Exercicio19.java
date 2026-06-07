package Lista2;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Leia a temperatura
		// < 15 → Frio
		// 15 a 25 → Agradável
		// > 25 → Quente

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Temperatura: ");
	        double temp = sc.nextDouble();

	        if (temp < 15) {
	            System.out.println("Frio");
	        } else if (temp <= 25) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Quente");
	       sc.close();     
	       }
	    }
	}