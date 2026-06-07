package jogosteams;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        inicializarTabuleiro(tabuleiro);

        char jogadorAtual = 'X';
        boolean partidaAtiva = true;

        System.out.println("=== JOGO DA VELHA ===");

        while (partidaAtiva) {

            imprimirTabuleiro(tabuleiro);

            System.out.println("Vez do jogador: " + jogadorAtual);

            int linha = 0;
            int coluna = 0;
            boolean jogadaValida = false;

            while (!jogadaValida) {

                System.out.print("Digite a linha (1-3): ");
                linha = lerCoordenadaValida(scanner) - 1;

                System.out.print("Digite a coluna (1-3): ");
                coluna = lerCoordenadaValida(scanner) - 1;

                if (tabuleiro[linha][coluna] != ' ') {
                    System.out.println("Essa posição já está ocupada! Escolha outra.");
                } else {
                    jogadaValida = true;
                }
            }

            tabuleiro[linha][coluna] = jogadorAtual;

            if (verificarVitoria(tabuleiro, jogadorAtual)) {

                imprimirTabuleiro(tabuleiro);

                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu a partida!");

                partidaAtiva = false;

            } else if (tabuleiroCheio(tabuleiro)) {

                imprimirTabuleiro(tabuleiro);

                System.out.println("Deu velha! O jogo empatou.");

                partidaAtiva = false;

            } else {

                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    public static void inicializarTabuleiro(char[][] tab) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tab[i][j] = ' ';
            }
        }
    }

    public static void imprimirTabuleiro(char[][] tab) {

        System.out.println("\n  1   2   3");
        System.out.println("1 " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2]);
        System.out.println(" ---+---+---");
        System.out.println("2 " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2]);
        System.out.println(" ---+---+---");
        System.out.println("3 " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2]);
        System.out.println();
    }

    public static int lerCoordenadaValida(Scanner scanner) {

        int valor;

        while (true) {

            while (!scanner.hasNextInt()) {

                System.out.print("Entrada inválida! Digite um número de 1 a 3: ");
                scanner.next();
            }

            valor = scanner.nextInt();

            if (valor >= 1 && valor <= 3) {

                break;
            }

            System.out.print("Valor fora do limite! Digite uma posição entre 1 e 3: ");
        }

        return valor;
    }

    public static boolean verificarVitoria(char[][] tab, char jog) {

        for (int i = 0; i < 3; i++) {

            if (tab[i][0] == jog &&
                tab[i][1] == jog &&
                tab[i][2] == jog) {
                return true;
            }

            if (tab[0][i] == jog &&
                tab[1][i] == jog &&
                tab[2][i] == jog) {
                return true;
            }
        }

        if (tab[0][0] == jog &&
            tab[1][1] == jog &&
            tab[2][2] == jog) {
            return true;
        }

        if (tab[0][2] == jog &&
            tab[1][1] == jog &&
            tab[2][0] == jog) {
            return true;
        }

        return false;
    }

    public static boolean tabuleiroCheio(char[][] tab) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tab[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}