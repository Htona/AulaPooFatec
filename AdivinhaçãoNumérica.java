package jogosteams;

import java.util.Scanner;

public class AdivinhaçãoNumérica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JOGO DA ADIVINHAÇÃO NUMÉRICA ===");

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int limiteTentativas = 10;

        System.out.println("Escolha a versão do laço para jogar:");
        System.out.println("1 - Versão FOR");
        System.out.println("2 - Versão WHILE");
        System.out.println("3 - Versão DO/WHILE");
        System.out.print("Sua opção: ");

        int opcao = lerEntradaValida(scanner);

        switch (opcao) {
            case 1:
                versaoFor(numeroSecreto, limiteTentativas, scanner);
                break;

            case 2:
                versaoWhile(numeroSecreto, limiteTentativas, scanner);
                break;

            case 3:
                versaoDoWhile(numeroSecreto, limiteTentativas, scanner);
                break;

            default:
                System.out.println("Opção inválida. Rodando a versão FOR.");
                versaoFor(numeroSecreto, limiteTentativas, scanner);
        }

        scanner.close();
    }

    public static int lerEntradaValida(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void versaoFor(int numeroSecreto, int limiteTentativas, Scanner scanner) {

        System.out.println("\n=== VERSÃO FOR ===");

        for (int tentativa = 1; tentativa <= limiteTentativas; tentativa++) {

            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = lerEntradaValida(scanner);

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número!");
                return;
            }

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
        }

        System.out.println("Você perdeu! O número era: " + numeroSecreto);
    }

    public static void versaoWhile(int numeroSecreto, int limiteTentativas, Scanner scanner) {

        System.out.println("\n=== VERSÃO WHILE ===");

        int tentativa = 1;

        while (tentativa <= limiteTentativas) {

            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = lerEntradaValida(scanner);

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número!");
                return;
            }

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativa++;
        }

        System.out.println("Você perdeu! O número era: " + numeroSecreto);
    }

    public static void versaoDoWhile(int numeroSecreto, int limiteTentativas, Scanner scanner) {

        System.out.println("\n=== VERSÃO DO/WHILE ===");

        int tentativa = 1;

        do {

            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = lerEntradaValida(scanner);

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número!");
                return;
            }

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativa++;

        } while (tentativa <= limiteTentativas);

        System.out.println("Você perdeu! O número era: " + numeroSecreto);
    }
}