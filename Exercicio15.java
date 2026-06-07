package Lista4;

import java.util.Scanner;

public class Exercicio15 {
	public static Scanner scanner = new Scanner(System.in);
    public static String nomePlayer;
    public static int pontuacao = 0;

    public static void main(String[] args) {
        iniciarJogo();
    }

    public static void iniciarJogo() {
        mostrarMenu();
        criarJogador();
        
        // Executa 2 turnos (2 perguntas)
        ejecutarTurno(1, "Qual é a linguagem que estamos programando agora?\nA) Python\nB) Java\nC) PHP", "B");
        ejecutarTurno(2, "Qual IDE estamos usando para rodar o Java?\nA) Eclipse\nB) VS Code\nC) NetBeans", "A");
        
        verificarVitoria();
        encerrarJogo();
    }

    public static void mostrarMenu() {
        System.out.println("=================================");
        System.out.println("    BEM-VINDO AO QUIZ MODULAR   ");
        System.out.println("=================================");
    }

    public static void criarJogador() {
        System.out.print("Informe o seu nome de jogador: ");
        nomePlayer = scanner.nextLine();
        System.out.println("Boa sorte, " + nomePlayer + "! Vamos começar.");
    }

    public static void ejecutarTurno(int nPergunta, String questao, String respostaCorreta) {
        System.out.println("\n--- PERGUNTA " + nPergunta + " ---");
        System.out.println(questao);
        System.out.print("Sua resposta: ");
        String respostaUser = scanner.nextLine().trim().toUpperCase();

        if (respostaUser.equals(respostaCorreta)) {
            System.out.println("Acertou! +10 pontos.");
            pontuacao += 10;
        } else {
            System.out.println("Errou! A resposta certa era a " + respostaCorreta);
        }
    }

    public static void verificarVitoria() {
        System.out.println("\n--- FIM DAS PERGUNTAS ---");
        if (pontuacao == 20) {
            System.out.println("🏆 Excelente, " + nomePlayer + "! Você teve uma vitória perfeita!");
        } else if (pontuacao == 10) {
            System.out.println("👍 Bom trabalho, " + nomePlayer + "! Você acertou metade.");
        } else {
            System.out.println("❌ Que pena, " + nomePlayer + ", você zerou o Quiz. Estude mais!");
        }
    }

    public static void encerrarJogo() {
        System.out.println("Obrigado por jogar! Pontuação final: " + pontuacao);
    }
}
