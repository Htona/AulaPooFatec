package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        
        String jogador = jogadaJogador();
        String computador = jogadaComputador();
        
        String resultado = verificarVencedor(jogador, computador);
        
        mostrarResultado(jogador, computador, resultado);
    }

    public static void mostrarMenu() {
        System.out.println("=== PEDRA, PAPEL OU TESOURA ===");
        System.out.println("Opções válidas: Pedra, Papel, Tesoura");
    }

    public static String jogadaJogador() {
        System.out.print("Digite a sua escolha: ");
        String escolha = scanner.nextLine().trim();
        return escolha.substring(0, 1).toUpperCase() + escolha.substring(1).toLowerCase();
    }

    public static String jogadaComputador() {
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        Random random = new Random();
        int indice = random.nextInt(3);
        return opcoes[indice];
    }

    public static String verificarVencedor(String jogador, String computador) {
        if (jogador.equals(computador)) {
            return "Empate";
        }
        
        if ((jogador.equals("Pedra") && computador.equals("Tesoura")) ||
            (jogador.equals("Papel") && computador.equals("Pedra")) ||
            (jogador.equals("Tesoura") && computador.equals("Papel"))) {
            return "Jogador Venceu";
        } else {
            return "Computador Venceu";
        }
    }

    public static void mostrarResultado(String jogadaUser, String jogadaBot, String resultadoFinal) {
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Você escolheu: " + jogadaUser);
        System.out.println("O Computador escolheu: " + jogadaBot);
        System.out.println("-----------------");
        
        if (resultadoFinal.equals("Empate")) {
            System.out.println("🤝 O jogo terminou em EMPATE!");
        } else if (resultadoFinal.equals("Jogador Venceu")) {
            System.out.println("🏆 Parabéns, VOCÊ GANHOU!");
        } else {
            System.out.println("🤖 O COMPUTADOR ganhou!");
        }
    }
}