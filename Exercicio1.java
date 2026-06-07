package Lista4;

public class Exercicio1 {

	public static void main(String[] args) {
		// O main agora fica limpo, apenas chamando as funções na ordem correta
        mostrarTitulo();
        mostrarMenu();
    }

    // Função responsável apenas por exibir o título do sistema
    public static void mostrarTitulo() {
        System.out.println("===============");
        System.out.println("    SISTEMA");
        System.out.println("===============");
    }

    // Função responsável apenas por exibir as opções do menu
    public static void mostrarMenu() {
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
    }
}

