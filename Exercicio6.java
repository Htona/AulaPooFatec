package Lista4;

import java.util.Scanner;

public class Exercicio6 {
	public class Exercicio06 {

	    public static void main(String[] args) {
	        int numero = lerNumero();
	        exibirTabuada(numero);
	    }

	    // Função para ler o número que o usuário deseja ver a tabuada
	    public static int lerNumero() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Deseja ver a tabuada de qual número? ");
				return scanner.nextInt();
			}
	    }

	    // Função com a responsabilidade única de calcular e formatar uma única linha
	    public static void mostrarLinha(int numero, int i) {
	        int resultado = numero * i;
	        System.out.println(numero + " x " + i + " = " + resultado); // Exemplo: 5 x 1 = 5
	    }

	    // Função que controla o laço de repetição de 1 até 10 para exibir a tabuada completa
	    public static void exibirTabuada(int numero) {
	        System.out.println("\n--- Tabuada do " + numero + " ---");
	        for (int i = 1; i <= 10; i++) {
	            mostrarLinha(numero, i); // Reaproveita a função de mostrar a linha
	        }}}}