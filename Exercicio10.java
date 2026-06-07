package Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usuario = lerUsuario();
        String senha = lerSenha();
        
        // Valida se o login confere com o padrão esperado (ex: admin / 1234)
        boolean loginValido = validarLogin(usuario, senha);
        
        mostrarResultado(loginValido);
    }

    public static String lerUsuario() {
        System.out.print("Usuário: ");
        return scanner.nextLine();
    }

    public static String lerSenha() {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }

    // Responsabilidade única de processar se as strings batem com as credenciais corretas
    public static boolean validarLogin(String user, String pass) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        
        return user.equals(usuarioCorreto) && pass.equals(senhaCorreta);
    }

    public static void mostrarResultado(boolean sucesso) {
        if (sucesso) {
            System.out.println("\n[ACESSO PERMITIDO] Bem-vindo ao sistema!");
        } else {
            System.out.println("\n[ACESSO NEGADO] Usuário ou senha incorretos.");
        }
    }
}
