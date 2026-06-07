package Lista2;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// Usuário tem 3 tentativas
		// Se errar 3 vezes → "Conta bloqueada"
		
		try (Scanner sc = new Scanner(System.in)) {
			String usuarioCorreto = "Agata";
			    String senhaCorreta = "1234";

			    for (int i = 1; i <= 3; i++) {
			        System.out.print("Usuário: ");
			        String usuario = sc.next();

			        System.out.print("Senha: ");
			        String senha = sc.next();

			        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
			            System.out.println("Acesso permitido");
			            return;
			        } else {
			            System.out.println("Tentativa " + i + " incorreta");
			        }
			    }

			    System.out.println("Conta bloqueada");
			   sc.close();
		}
	}

}
