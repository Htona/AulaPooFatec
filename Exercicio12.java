package Lista3;

import java.util.Scanner;
  public class Exercicio12 {
	  public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

    int opcao;
    do {

        System.out.println("\n1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Sair");
        System.out.print("Escolha: ");

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Opção Somar selecionada.");
                break;

            case 2:
                System.out.println("Opção Subtrair selecionada.");
                break;

            case 3:
                System.out.println("Encerrando...");
                break;

            default:
                System.out.println("Opção inválida.");
        }

    } while (opcao != 3);

    sc.close();
}
}
