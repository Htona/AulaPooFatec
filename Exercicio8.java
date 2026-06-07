package Lista4;

import java.util.Scanner;

public class Exercicio8 {

// Scanner global para ser usado por todas as funções de leitura
public static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    String nome = lerNome();
    int idade = lerIdade();
    String cidade = lerCidade();
    
    // Exibe os dados agrupados
    mostrarResumo(nome, idade, cidade);
}

public static String lerNome() {
    System.out.print("Digite o seu nome: ");
    return scanner.nextLine();
}

public static int lerIdade() {
    System.out.print("Digite a sua idade: ");
    int idade = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer do teclado para a próxima leitura de texto
    return idade;
}

public static String lerCidade() {
    System.out.print("Digite a sua cidade: ");
    return scanner.nextLine();
}

public static void mostrarResumo(String nome, int idade, String cidade) {
    System.out.println("\n=== RESUMO DOS DADOS ===");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade + " anos");
    System.out.println("Cidade: " + cidade);
    System.out.println("========================");
}
}