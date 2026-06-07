package Lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
        int numero = lerNumero();
        
        // A função ehPar retorna verdadeiro (true) ou falso (false)
        boolean resultadoValidacao = ehPar(numero);
        
        mostrarResultado(numero, resultadoValidacao);
    }

    // Função responsável por interagir com o usuário e capturar o número
    public static int lerNumero() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número inteiro: ");
			return scanner.nextInt();
		}
    }

    // Função puramente lógica: recebe o número e verifica se o resto da divisão por 2 é zero
    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }

    // Função responsável por interpretar o booleano e exibir a mensagem amigável
    public static void mostrarResultado(int num, boolean par) {
        if (par) {
            System.out.println("O número " + num + " é PAR.");
        } else {
            System.out.println("O número " + num + " é ÍMPAR.");
        }
    }
}