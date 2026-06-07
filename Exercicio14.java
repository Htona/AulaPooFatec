package Lista4;

import java.util.Scanner;

public class Exercicio14 {

public static Scanner scanner = new Scanner(System.in);
public static double contaSaldo = 500.00; // Começa com um saldo base

public static void main(String[] args) {
    int opcao;
    boolean rodando = true;

    while (rodando) {
        mostrarMenu();
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                rodando = encerrarSistema();
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.println();
    }
}

public static void mostrarMenu() {
    System.out.println("=== CAIXA ELETRÔNICO ===");
    System.out.println("1 - Ver Saldo");
    System.out.println("2 - Depositar Dinheiro");
    System.out.println("3 - Sacar Dinheiro");
    System.out.println("4 - Sair do Caixa");
    System.out.print("Escolha uma operação: ");
}

public static void consultarSaldo() {
    System.out.printf("Saldo disponível: R$ %.2f\n", contaSaldo);
}

public static void depositar() {
    System.out.print("Informe o valor do depósito: R$ ");
    double valor = scanner.nextDouble();
    if (valor > 0) {
        contaSaldo += valor;
        System.out.println("Depósito efetuado com sucesso!");
    } else {
        System.out.println("Valor de depósito incorreto.");
    }
}

public static void sacar() {
    System.out.print("Quanto deseja sacar? R$ ");
    double valorSaque = scanner.nextDouble();
    if (valorSaque > 0 && valorSaque <= contaSaldo) {
        contaSaldo -= valorSaque;
        System.out.println("Saque aprovado! Retire as notas.");
    } else {
        System.out.println("Saldo insuficiente ou valor incorreto.");
    }
}

public static boolean encerrarSistema() {
    System.out.println("Encerrando sessão... Retire o seu cartão. Obrigado!");
    return false;
}
}