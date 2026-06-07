package Lista4;

public class Exercicio13 {
	// Variáveis globais do personagem para controle dos métodos
    public static String nomePersonagem;
    public static int vidaAtual;
    public static int vidaMaxima;

    public static void main(String[] args) {
        criarPersonagem("Aragorn", 100);
        mostrarStatus();

        System.out.println("\n--- Turno 1: Atacando um Monstro ---");
        atacar();

        System.out.println("\n--- Turno 2: Levando uma emboscada ---");
        receberDano(35);
        mostrarStatus();

        System.out.println("\n--- Turno 3: Usando uma Poção de Cura ---");
        curar(20);
        mostrarStatus();
    }

    public static void criarPersonagem(String nome, int vidaMax) {
        nomePersonagem = nome;
        vidaMaxima = vidaMax;
        vidaAtual = vidaMax;
        System.out.println("Personagem " + nomePersonagem + " criado com sucesso!");
    }

    public static void mostrarStatus() {
        System.out.println("[STATUS] " + nomePersonagem + " | HP: " + vidaAtual + "/" + vidaMaxima);
    }

    public static void atacar() {
        System.out.println("⚔️ " + nomePersonagem + " desferiu um ataque crítico e causou 25 de dano!");
    }

    public static void receberDano(int dano) {
        vidaAtual -= dano;
        System.out.println("💥 " + nomePersonagem + " sofreu " + dano + " de dano!");
        if (vidaAtual < 0) {
            vidaAtual = 0;
        }
    }

    public static void curar(int pontosCura) {
        vidaAtual += pontosCura;
        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }
        System.out.println("💚 " + nomePersonagem + " foi curado em " + pontosCura + " pontos de vida.");
    }
}