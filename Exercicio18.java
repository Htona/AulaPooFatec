package Lista2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// Menu:
		// 1 - Somar
		// 2 - Subtrair
		// 3 - Sair
		// O programa deve continuar até sair

		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            if (op == 3) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite dois números: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            switch (op) {
                case 1:
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.println("Resultado: " + (a - b));
                    break;
                default:
                    System.out.println("Opção inválida");
                    sc.close();
            }
        }
    }
}
