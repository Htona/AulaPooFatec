package Desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        int jogadas = 0;

        System.out.println("--- JOGO DA VELHA ---");

        while (jogoAtivo) {
            // Exibe o tabuleiro atual
            System.out.println("\nTabuleiro atual:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            // Lê a jogada
            System.out.println("\nJogador [" + jogadorAtual + "], informe sua jogada.");
            System.out.print("Linha (0, 1 ou 2): ");
            int linha = scanner.nextInt();
            System.out.print("Coluna (0, 1 ou 2): ");
            int coluna = scanner.nextInt();

            // Valida a jogada
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != '_') {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            // Aplica a jogada
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // Verifica se o jogador atual venceu
            boolean venceu = false;
            
            // Verifica linhas e colunas
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) venceu = true;
                if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) venceu = true;
            }
            // Verifica diagonais
            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) venceu = true;
            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) venceu = true;

            if (venceu) {
                System.out.println("\nParabéns! O jogador [" + jogadorAtual + "] VENCEU o jogo!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                System.out.println("\nO jogo terminou em EMPATE (Deu velha)!");
                jogoAtivo = false;
            } else {
                // Alterna o jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }
}