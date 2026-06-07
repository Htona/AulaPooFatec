package Lista4;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1 = 10;
        int n2 = 20;
        
        // Chamamos a função de somar passando os dois números
        int resultado = somar(n1, n2);
        
        // Chamamos a função de exibir o resultado passando o valor calculado
        mostrarResultado(resultado);
    }

    // Função que recebe dois números inteiros, calcula a soma e retorna o valor
    public static int somar(int a, int b) {
        return a + b;
    }

    // Função que recebe um valor e apenas o exibe formatado na tela
    public static void mostrarResultado(int valor) {
        System.out.println("O resultado da soma é: " + valor);
    }
}