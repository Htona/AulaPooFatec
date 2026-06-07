package Lista4;

import java.util.Scanner;

public class Exercicio9 {
	public static Scanner scanner = new Scanner(System.in);
    // Variável do saldo controlada de forma centralizada
    public static double saldo = 0.0; 

    public static void main(String[] args) {
        int opcao;
        
        do {
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
                    System.out.println("Sistema bancário encerrado. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
            
        } while (opcao != 4);
    }

    public static void mostrarMenu() {
        System.out.println("=== BANCO DIGITAL ===");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void consultarSaldo() {
        System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
    }

    public static void depositar() {
        System.out.print("Digite o valor para depósito: R$ ");
        double valor = scanner.nextDouble();
        
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public static void sacar() {
        System.out.print("Digite o valor para saque: R$ ");
        double valor = scanner.nextDouble();
        
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente!");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
}