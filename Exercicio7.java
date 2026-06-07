package Lista4;

public class Exercicio7 {
	public static void main(String[] args) {
        System.out.println("--- TODOS OS NÚMEROS DE 1 A 100 ---");
        mostrarNumeros();
        
        System.out.println("\n\n--- APENAS NÚMEROS PARES DE 1 A 100 ---");
        mostrarPares();
        
        System.out.println("\n\n--- APENAS NÚMEROS ÍMPARES DE 1 A 100 ---");
        mostrarImpares();
    }

    // Mostra todos os números de 1 a 100
    public static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    // Filtra e mostra apenas os pares de 1 a 100
    public static void mostrarPares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Filtra e mostra apenas os ímpares de 1 a 100
    public static void mostrarImpares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}