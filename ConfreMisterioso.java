package jogosteams;

import java.util.Random;
import java.util.Scanner;

public class ConfreMisterioso {
	    	public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);
	            Random random = new Random();
	            
	            boolean continuarJogo = true;
	            int pontuacaoTotal = 0;

	            System.out.println("=== Bem-vindo ao Cofre Misterioso! ===");

	            while (continuarJogo) {
	                System.out.println("\nEscolha a dificuldade [1-Fácil (1-20) | 2-Médio (1-50) | 3-Difícil (1-100)]:");
	                int opcaoDificuldade = lerInteiroValido(scanner);
	                
	                int maxIntervalo = 50; 
	                if (opcaoDificuldade == 1) maxIntervalo = 20;
	                if (opcaoDificuldade == 3) maxIntervalo = 100;

	                int codigoSecreto = random.nextInt(maxIntervalo) + 1;
	                int totalTentativas = 5;
	                boolean cofreAberto = false;
	                int rodadaPontos = 10; 

	                System.out.println("Cofre gerado! Tente adivinhar o código de 1 a " + maxIntervalo);

	                for (int tent = 1; tent <= totalTentativas; tent++) {
	                    System.out.print("Tentativa " + tent + "/" + totalTentativas + " - Seu palpite: ");
	                    int palpite = lerInteiroValido(scanner);

	                    if (palpite == codigoSecreto) {
	                        System.out.println("Acertou! Cofre aberto. Código: " + codigoSecreto);
	                        pontuacaoTotal += rodadaPontos; 
	                        cofreAberto = true;
	                        break;
	                    } else {
	                        rodadaPontos = Math.max(0, rodadaPontos - 2);
	                        
	                        int restam = totalTentativas - tent;
	                        if (restam > 0) {
	                            if (palpite > codigoSecreto) {
	                                System.out.println("O código é MENOR. Restam " + restam + " tentativas.");
	                            } else {
	                                System.out.println("O código é MAIOR. Restam " + restam + " tentativas.");
	                            }
	                        }
	                    }
	                }

	                if (!cofreAberto) {
	                    System.out.println("Tentativas esgotadas! O código secreto era: " + codigoSecreto);
	                }

	                char resposta;
	                do {
	                    System.out.print("Deseja jogar novamente? (s/n): ");
	                    resposta = scanner.next().toLowerCase().charAt(0);
	                    if (resposta != 's' && resposta != 'n') {
	                        System.out.println("Opção inválida! Digite apenas 's' ou 'n'.");
	                    }
	                } while (resposta != 's' && resposta != 'n');

	                if (resposta == 'n') {
	                    continuarJogo = false;
	                }
	            }

	            System.out.println("\nPontuação final: " + pontuacaoTotal);
	            System.out.println("Fim do programa. Obrigado por jogar!");
	            scanner.close();
	        }

	        private static int lerInteiroValido(Scanner scanner) {
	            while (!scanner.hasNextInt()) {
	                System.out.print("Entrada inválida! Digite um número inteiro: ");
	                scanner.next(); 
	            }
	            return scanner.nextInt();
	        }
	    }