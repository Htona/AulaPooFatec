package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroSecreto = sortearNumero();
        boolean acertou = false;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número sorteado entre 1 e 50!");

        while (!acertou) {
            int palpite = lerPalpite();
            acertou = verificarAcerto(palpite, numeroSecreto);

            if (!acertou) {
                mostrarDica(palpite, numeroSecreto);
            }
        }

        mostrarVitoria();
    }

    public static int sortearNumero() {
        Random random = new Random();
        return random.nextInt(50) + 1; // Sorteia de 1 a 50
    }

    public static int lerPalpite() {
        System.out.print("\nDigite o seu palpite: ");
        return scanner.nextInt();
    }

    public static boolean verificarAcerto(int palpite, int numeroSecreto) {
        return palpite == numeroSecreto;
    }

    public static void mostrarDica(int palpite, int numeroSecreto) {
        if (palpite > numeroSecreto) {
            System.out.println("O número secreto é MENOR do que " + palpite + ".");
        } else {
            System.out.println("O número secreto é MAIOR do que " + palpite + ".");
        }
    }

    public static void mostrarVitoria() {
        System.out.println("\n🎉 PARABÉNS! Você descobriu o número secreto e venceu o jogo!");
    }
}