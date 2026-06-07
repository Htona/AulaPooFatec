package Lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            
            if (opcao >= 1 && opcao <= 4) {
                double num1 = lerNumero("primeiro");
                double num2 = lerNumero("segundo");
                double resultado = 0;
                
                switch (opcao) {
                    case 1:
                        resultado = somar(num1, num2);
                        System.out.println("Resultado da Soma: " + resultado);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        System.out.println("Resultado da Subtração: " + resultado);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println("Resultado da Multiplicação: " + resultado);
                        break;
                    case 4:
                        // Evita a divisão por zero
                        if (num2 != 0) {
                            resultado = dividir(num1, num2);
                            System.out.println("Resultado da Divisão: " + resultado);
                        } else {
                            System.out.println("Erro: Não é possível dividir por zero!");
                        }
                        break;
                }
            } else if (opcao != 5) {
                System.out.println("Opção inválida!");
            }
            System.out.println();
            
        } while (opcao != 5);
        
        System.out.println("Calculadora encerrada.");
    }

    public static void mostrarMenu() {
        System.out.println("--- CALCULADORA MODULAR ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static double lerNumero(String ordem) {
        System.out.print("Digite o " + ordem + " número: ");
        return scanner.nextDouble();
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}