package Lista4;

import java.util.Scanner;

public class Exercicio4 {
	// Criamos o Scanner aqui fora dos métodos para que a função lerNota possa usá-lo sem abrir múltiplos Scanners
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Lendo as 3 notas usando a mesma função reaproveitável
        double nota1 = lerNota(1);
        double nota2 = lerNota(2);
        double nota3 = lerNota(3);
        
        double media = calcularMedia(nota1, nota2, nota3);
        String situacao = verificarSituacao(media);
        
        mostrarResultado(media, situacao);
    }

    // Função reaproveitável que aceita o número da nota como parâmetro para customizar a mensagem
    public static double lerNota(int numeroNota) {
        System.out.print("Digite a nota " + numeroNota + ": ");
        return scanner.nextDouble();
    }

    // Função com a responsabilidade única de calcular a média matemática
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Função que decide o status do aluno com base na nota (Média 7.0 para aprovação)
    public static String verificarSituacao(double mediaFinal) {
        if (mediaFinal >= 7.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    // Função de saída de dados
    public static void mostrarResultado(double media, String status) {
        System.out.printf("\nMédia Final: %.2f\n", media);
        System.out.println("Situação do Aluno: " + status);
    }
}