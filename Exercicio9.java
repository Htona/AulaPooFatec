package Lista2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// usuário = "admin" e senha = "1234"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Usuário: ");
		String usuario = sc.next();
		System.out.println("Senha: ");
		String senha = sc.next();
		
		if (usuario.equals("Agata") && senha.equals("Vitoria2026!")) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
		sc.close();
		

	}

}
