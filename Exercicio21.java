package Lista2;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "Agata";
        String senhaCorreta = "1234";

        System.out.print("Usuário: ");
        String usuario = sc.next();

        System.out.print("Senha: ");
        String senha = sc.next();

        if (!usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)) {
            System.out.println("Acesso negado");
            sc.close();
            return;
        }

        double saldo = 996.125;
        int op;

        do {
            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Valor para depósito: R$ ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Valor para saque: R$ ");
                    double saque = sc.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else if (saque <= 0) {
                        System.out.println("Valor inválido.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 4);

        sc.close();
    }
}